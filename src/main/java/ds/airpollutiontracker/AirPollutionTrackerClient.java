package ds.airpollutiontracker;

import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerBlockingStub;
import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AirPollutionTrackerClient {
    private static CountDownLatch serviceResolvedLatch = new CountDownLatch(1);
    static String serviceType = "_http._tcp.local.";
    static String resolvedIP;
    static int port;

    public static void main(String[] args) {
        discoverServiceWithJmDNS();

        try {
            serviceResolvedLatch.await();
        } catch (InterruptedException e) {
            System.err.println("Service resolution interrupted: " + e.getMessage());
            return;
        }

        // Check if the service has been resolved
        if (resolvedIP != null && port > 0) {
            // Run the GUI
            runClientGui(resolvedIP, port);
        } else {
            System.out.println("Could not resolve the service.");
        }
    }

    public static void runClientGui(String ip, int port) {
        JFrame frame = new JFrame("Air Pollution Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        // Method 2: Get Air Pollution History
        JLabel titleLabelHistory = new JLabel("Method 1: Get Air Pollution History");
        panel.add(titleLabelHistory);

        JLabel historyLocationLabel = new JLabel("Location:");
        panel.add(historyLocationLabel);

        JTextField historyLocationField = new JTextField(20);
        panel.add(historyLocationField);

        JLabel startTimeLabel = new JLabel("Start Time:");
        panel.add(startTimeLabel);

        SpinnerDateModel startTimeModel = new SpinnerDateModel();
        JSpinner startTimeSpinner = new JSpinner(startTimeModel);
        JSpinner.DateEditor startTimeEditor = new JSpinner.DateEditor(startTimeSpinner, "yyyy-MM-dd HH:mm:ss");
        startTimeSpinner.setEditor(startTimeEditor);
        panel.add(startTimeSpinner);

        JLabel endTimeLabel = new JLabel("End Time:");
        panel.add(endTimeLabel);

        SpinnerDateModel endTimeModel = new SpinnerDateModel();
        JSpinner endTimeSpinner = new JSpinner(endTimeModel);
        JSpinner.DateEditor endTimeEditor = new JSpinner.DateEditor(endTimeSpinner, "yyyy-MM-dd HH:mm:ss");
        endTimeSpinner.setEditor(endTimeEditor);
        panel.add(endTimeSpinner);

        JButton getHistoryButton = new JButton("Get Air Pollution History");
        panel.add(getHistoryButton);

        JTextArea historyOutputArea = new JTextArea(5, 40);
        historyOutputArea.setEditable(false);
        JScrollPane historyScrollPane = new JScrollPane(historyOutputArea);
        panel.add(historyScrollPane);

        // Get Air Pollution Alerts UI elements
        JLabel titleLabelAlerts = new JLabel("Method 2: Get Air Pollution Alerts");
        panel.add(titleLabelAlerts);

        JLabel alertsLocationLabel = new JLabel("Location:");
        panel.add(alertsLocationLabel);

        JTextField alertsLocationField = new JTextField(20);
        panel.add(alertsLocationField);

        JLabel thresholdLabel = new JLabel("Threshold:");
        panel.add(thresholdLabel);

        JTextField thresholdField = new JTextField(20);
        panel.add(thresholdField);

        JButton getAlertsButton = new JButton("Get Air Pollution Alerts");
        panel.add(getAlertsButton);

        JTextArea alertsOutputArea = new JTextArea(5, 40);
        alertsOutputArea.setEditable(false);
        JScrollPane alertsScrollPane = new JScrollPane(alertsOutputArea);
        panel.add(alertsScrollPane);

        // Monitor Air Pollution UI elements
        JLabel titleLabelMonitor = new JLabel("Method 3: Monitor Air Pollution");
        panel.add(titleLabelMonitor);

        JLabel monitorLocationLabel = new JLabel("Location:");
        panel.add(monitorLocationLabel);

        JTextField monitorLocationField = new JTextField(20);
        panel.add(monitorLocationField);

        JButton monitorButton = new JButton("Monitor Air Pollution");
        panel.add(monitorButton);

        JTextArea monitorOutputArea = new JTextArea(5, 40);
        monitorOutputArea.setEditable(false);
        JScrollPane monitorScrollPane = new JScrollPane(monitorOutputArea);
        panel.add(monitorScrollPane);

        // Get Air Pollution History ActionListener
        getHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = historyLocationField.getText();
                long startTime = startTimeModel.getDate().getTime();
                long endTime = endTimeModel.getDate().getTime();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                AirPollutionTrackerBlockingStub blockingStub = AirPollutionTrackerGrpc.newBlockingStub(channel);

                AirPollutionHistoryRequest historyRequest = AirPollutionHistoryRequest.newBuilder()
                        .setStartTime(startTime)
                        .setEndTime(endTime)
                        .setLocation(location).build();

                Iterator<AirPollutionLevel> historyResponseIterator = blockingStub
                        .getAirPollutionHistory(historyRequest);
                while (historyResponseIterator.hasNext()) {
                    AirPollutionLevel historyResponse = historyResponseIterator.next();
                    historyOutputArea.append("History message sent by the server: " + historyResponse + "\n");
                }

                channel.shutdown();
            }
        });

        // Get Air Pollution Alerts ActionListener
        getAlertsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = alertsLocationField.getText();
                int threshold = Integer.parseInt(thresholdField.getText());

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                AirPollutionTrackerBlockingStub blockingStub = AirPollutionTrackerGrpc.newBlockingStub(channel);

                AirPollutionAlertsRequest alertRequest = AirPollutionAlertsRequest.newBuilder()
                        .setLocation(location).setThreshold(threshold).build();

                AirPollutionAlertsResponse alertsResponse = blockingStub.getAirPollutionAlerts(alertRequest);
                alertsOutputArea.append("Alerts sent by the server: " + alertsResponse.getAlertsList() + "\n");

                channel.shutdown();
            }
        });

     // Monitor Air Pollution ActionListener
        monitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = monitorLocationField.getText();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                AirPollutionTrackerStub asyncStub = AirPollutionTrackerGrpc.newStub(channel);

                AirPollutionMonitorRequest monitorRequest = AirPollutionMonitorRequest.newBuilder()
                        .setLocation(location).build();

                CountDownLatch finishedLatch = new CountDownLatch(1);

                StreamObserver<AirPollutionMonitorRequest> monitorRequestObserver = asyncStub
                        .monitorAirPollution(new StreamObserver<AirPollutionLevel>() {
                            @Override
                            public void onNext(AirPollutionLevel value) {
                                monitorOutputArea.append("Received real-time data: " + value + "\n");
                            }

                            @Override
                            public void onError(Throwable t) {
                                monitorOutputArea.append(
                                        "Error encountered in AirPollutionTrackerClient: " + t.getMessage() + "\n");
                                finishedLatch.countDown();
                            }

                            @Override
                            public void onCompleted() {
                                monitorOutputArea.append("Real-time data receiving completed.\n");
                                finishedLatch.countDown();
                            }
                        });

                try {
                    monitorRequestObserver.onNext(monitorRequest);

                    // Sleep for demonstration purposes, replace with appropriate logic
                    Thread.sleep(5000);

                    monitorRequestObserver.onCompleted();

                    // Wait for the server to complete sending data
                    if (!finishedLatch.await(1, TimeUnit.MINUTES)) {
                        monitorOutputArea.append("monitorAirPollution can not finish within 1 minute\n");
                    }
                } catch (RuntimeException e1) {
                    monitorRequestObserver.onError(e1);
                    throw e1;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                } finally {
                    channel.shutdown();
                }
            }
        });

        frame.setVisible(true);
    }
    
 // JmDNS service discovery method
  	public static void discoverServiceWithJmDNS() {
  		try {
  			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

  			jmdns.addServiceListener(serviceType, new ServiceDiscoverer());

  			Thread.sleep(20000);
  		} catch (Exception e) {
  			System.out.println(e.getMessage());
  		}
  	}

  	private static class ServiceDiscoverer implements ServiceListener {
  		public void serviceAdded(ServiceEvent event) {
  			System.out.println("Service added: " + event.getInfo());
  		}

  		public void serviceRemoved(ServiceEvent event) {
  			System.out.println("Service removed: " + event.getInfo());
  		}

  		public void serviceResolved(ServiceEvent event) {
              System.out.println("Service resolved: " + event.getInfo());

              ServiceInfo info = event.getInfo();
              port = info.getPort();
              resolvedIP = info.getHostAddress();
              System.out.println("IP Resolved - " + resolvedIP + ":" + port);

              // Signal that the service has been resolved
              serviceResolvedLatch.countDown();
          }
  	}
 }

