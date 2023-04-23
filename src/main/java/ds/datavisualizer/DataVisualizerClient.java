package ds.datavisualizer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;

import ds.datavisualizer.DataVisualizationGrpc.DataVisualizationStub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DataVisualizerClient {
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
            runClientGui();
        } else {
            System.out.println("Could not resolve the service.");
        }
    }

    public static void runClientGui() {
        JFrame frame = new JFrame("Data Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        // Get Pollution Statistics UI elements
        JLabel titleLabelStatistics = new JLabel("Method 1: Get Pollution Statistics");
        panel.add(titleLabelStatistics);
        
        JLabel locationLabel = new JLabel("Location:");
        panel.add(locationLabel);

        JTextField locationField = new JTextField(20);
        panel.add(locationField);

        JButton getStatisticsButton = new JButton("Get Pollution Statistics");
        panel.add(getStatisticsButton);

        JTextArea statisticsOutputArea = new JTextArea(5, 40);
        statisticsOutputArea.setEditable(false);
        JScrollPane statisticsScrollPane = new JScrollPane(statisticsOutputArea);
        panel.add(statisticsScrollPane);

        // Filter Data by Location UI elements
        JLabel titleLabelFilter = new JLabel("Method 2: Filter Data by Location");
        panel.add(titleLabelFilter);
        
        JLabel filterLocationLabel = new JLabel("Location:");
        panel.add(filterLocationLabel);

        JTextField filterLocationField = new JTextField(20);
        panel.add(filterLocationField);

        JButton filterDataButton = new JButton("Filter Data by Location");
        panel.add(filterDataButton);

        JTextArea filterOutputArea = new JTextArea(5, 40);
        filterOutputArea.setEditable(false);
        JScrollPane filterScrollPane = new JScrollPane(filterOutputArea);
        panel.add(filterScrollPane);

        // Set Favorite Location UI elements
        JLabel titleLabelFavorite = new JLabel("Method 3: Set Favorite Location");
        panel.add(titleLabelFavorite);
        
        JLabel favoriteLocationLabel = new JLabel("Location:");
        panel.add(favoriteLocationLabel);

        JTextField favoriteLocationField = new JTextField(20);
        panel.add(favoriteLocationField);

        JButton setFavoriteButton = new JButton("Set Favorite Location");
        panel.add(setFavoriteButton);

        JTextArea favoriteOutputArea = new JTextArea(5, 40);
        favoriteOutputArea.setEditable(false);
        JScrollPane favoriteScrollPane = new JScrollPane(favoriteOutputArea);
        panel.add(favoriteScrollPane);

        // Set Favorite Location ActionListener
        setFavoriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = favoriteLocationField.getText();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                DataVisualizationStub asyncStub = DataVisualizationGrpc.newStub(channel);

                CountDownLatch favoriteLatch = new CountDownLatch(1);
                StreamObserver<FavoriteLocationRequest> favoriteRequestObserver = asyncStub.setFavoriteLocation(new StreamObserver<FavoriteLocationResponse>() {
                    @Override
                    public void onNext(FavoriteLocationResponse value) {
                        favoriteOutputArea.append("Favorite location response: " + value + "\n");
                    }

                    @Override
                    public void onError(Throwable t) {
                        favoriteOutputArea.append("Error encountered in DataVisualizerClient: " + t.getMessage() + "\n");
                        favoriteLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        favoriteOutputArea.append("Favorite location setting completed.\n");
                        favoriteLatch.countDown();
                    }
                });

                try {
                    FavoriteLocationRequest favoriteRequest = FavoriteLocationRequest.newBuilder()
                            .setLocation(location)
                            .build();
                    favoriteRequestObserver.onNext(favoriteRequest);

                    favoriteRequestObserver.onCompleted();

                    // Wait for the server to complete sending data
                    if (!favoriteLatch.await(1, TimeUnit.MINUTES)) {
                        favoriteOutputArea.append("setFavoriteLocation can not finish within 1 minutes\n");
                    }
                } catch (RuntimeException e1) {
                    favoriteRequestObserver.onError(e1);
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
