package ds.datavisualizer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
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
        
        JLabel filterLocationLabel1 = new JLabel("Location1 1 :");
        panel.add(filterLocationLabel1);

        JTextField filterLocationField1 = new JTextField(20);
        panel.add(filterLocationField1);
        
        JLabel filterLocationLabel2 = new JLabel("Location1 2 :");
        panel.add(filterLocationLabel2);
        
        JTextField filterLocationField2 = new JTextField(20);
        panel.add(filterLocationField2);
        
        JLabel filterLocationLabel3 = new JLabel("Location1 3 :");
        panel.add(filterLocationLabel3);
        
        JTextField filterLocationField3 = new JTextField(20);
        panel.add(filterLocationField3);

        JButton filterDataButton = new JButton("Filter Data by Location");
        panel.add(filterDataButton);

        JTextArea filterOutputArea = new JTextArea(5, 40);
        filterOutputArea.setEditable(false);
        JScrollPane filterScrollPane = new JScrollPane(filterOutputArea);
        panel.add(filterScrollPane);

        // Set Favorite Location UI elements
        JLabel titleLabelFavorite = new JLabel("Method 3: Set Favorite Location");
        panel.add(titleLabelFavorite);
        
        JLabel favoriteLocationLabel1 = new JLabel("Location1:");
        panel.add(favoriteLocationLabel1);

        JTextField favoriteLocationField1 = new JTextField(20);
        panel.add(favoriteLocationField1);
        
        JLabel favoriteLocationLabel2 = new JLabel("Location 2 :");
        panel.add(favoriteLocationLabel2);

        JTextField favoriteLocationField2 = new JTextField(20);
        panel.add(favoriteLocationField2);
        
        JLabel favoriteLocationLabel3 = new JLabel("Location3 :");
        panel.add(favoriteLocationLabel3);

        JTextField favoriteLocationField3 = new JTextField(20);
        panel.add(favoriteLocationField3);

        JButton setFavoriteButton = new JButton("Set Favorite Location");
        panel.add(setFavoriteButton);

        JTextArea favoriteOutputArea = new JTextArea(5, 40);
        favoriteOutputArea.setEditable(false);
        JScrollPane favoriteScrollPane = new JScrollPane(favoriteOutputArea);
        panel.add(favoriteScrollPane);
        
        // Get Pollution Statistics ActionListener
        getStatisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = locationField.getText();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                DataVisualizationStub asyncStub = DataVisualizationGrpc.newStub(channel);

                CountDownLatch statisticsLatch = new CountDownLatch(1);

                try {
                    asyncStub.withDeadlineAfter(5, TimeUnit.SECONDS)
                             .getPollutionStatistics(PollutionStatisticsRequest.newBuilder().setLocation(location).build(), new StreamObserver<PollutionStatistics>() {
                        @Override
                        public void onNext(PollutionStatistics value) {
                            statisticsOutputArea.append("Pollution statistics response: " + value + "\n");
                        }

                        @Override
                        public void onError(Throwable t) {
                            statisticsOutputArea.append("Error encountered in DataVisualizerClient: " + t.getMessage() + "\n");
                            statisticsLatch.countDown();
                        }

                        @Override
                        public void onCompleted() {
                            statisticsOutputArea.append("Pollution statistics request completed.\n");
                            statisticsLatch.countDown();
                        }
                    });

                    // Wait for the server to complete sending data
                    if (!statisticsLatch.await(1, TimeUnit.MINUTES)) {
                        statisticsOutputArea.append("getPollutionStatistics can not finish within 1 minute\n");
                    }
                } catch (StatusRuntimeException ex) {
                    if (ex.getStatus().getCode() == Status.DEADLINE_EXCEEDED.getCode()) {
                        statisticsOutputArea.append("Deadline exceeded for getPollutionStatistics request.\n");
                    } else {
                        statisticsOutputArea.append("Error encountered in DataVisualizerClient: " + ex.getMessage() + "\n");
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    channel.shutdown();
                }
            }
        });
        
        // Filter Data by Location ActionListener
        filterDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location1 = filterLocationField1.getText();
                String location2 = filterLocationField2.getText();
                String location3 = filterLocationField3.getText();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                DataVisualizationStub asyncStub = DataVisualizationGrpc.newStub(channel);

                CountDownLatch filterLatch = new CountDownLatch(1);
                StreamObserver<LocationFilterRequest> filterRequestObserver1 = asyncStub
                        .withDeadlineAfter(5, TimeUnit.SECONDS)
                        .filterDataByLocation(new StreamObserver<PollutionLevel>() {
                            @Override
                            public void onNext(PollutionLevel value) {
                                filterOutputArea.append("Filtered data response: " + value + "\n");
                            }

                            @Override
                            public void onError(Throwable t) {
                                filterOutputArea.append("Error encountered in DataVisualizerClient: " + t.getMessage() + "\n");
                                filterLatch.countDown();
                            }

                            @Override
                            public void onCompleted() {
                                filterOutputArea.append("Filtering completed.\n");
                                filterLatch.countDown();
                            }
                        });
                StreamObserver<LocationFilterRequest> filterRequestObserver2 = asyncStub
                        .withDeadlineAfter(5, TimeUnit.SECONDS)
                        .filterDataByLocation(new StreamObserver<PollutionLevel>() {
                            @Override
                            public void onNext(PollutionLevel value) {
                                filterOutputArea.append("Filtered data response: " + value + "\n");
                            }

                            @Override
                            public void onError(Throwable t) {
                                filterOutputArea.append("Error encountered in DataVisualizerClient: " + t.getMessage() + "\n");
                                filterLatch.countDown();
                            }

                            @Override
                            public void onCompleted() {
                                filterOutputArea.append("Filtering completed.\n");
                                filterLatch.countDown();
                            }
                        });
                StreamObserver<LocationFilterRequest> filterRequestObserver3 = asyncStub
                        .withDeadlineAfter(5, TimeUnit.SECONDS)
                        .filterDataByLocation(new StreamObserver<PollutionLevel>() {
                            @Override
                            public void onNext(PollutionLevel value) {
                                filterOutputArea.append("Filtered data response: " + value + "\n");
                            }

                            @Override
                            public void onError(Throwable t) {
                                filterOutputArea.append("Error encountered in DataVisualizerClient: " + t.getMessage() + "\n");
                                filterLatch.countDown();
                            }

                            @Override
                            public void onCompleted() {
                                filterOutputArea.append("Filtering completed.\n");
                                filterLatch.countDown();
                            }
                        });

                try {
                    // Send multiple location filter requests
                    if (!location1.isEmpty()) {
                        LocationFilterRequest filterRequest1 = LocationFilterRequest.newBuilder()
                                .setLocation(location1)
                                .build();
                        filterRequestObserver1.onNext(filterRequest1);
                    }

                    if (!location2.isEmpty()) {
                        LocationFilterRequest filterRequest2 = LocationFilterRequest.newBuilder()
                                .setLocation(location2)
                                .build();
                        filterRequestObserver2.onNext(filterRequest2);
                    }

                    if (!location3.isEmpty()) {
                        LocationFilterRequest filterRequest3 = LocationFilterRequest.newBuilder()
                                .setLocation(location3)
                                .build();
                        filterRequestObserver3.onNext(filterRequest3);
                    }

                    filterRequestObserver1.onCompleted();

                    filterRequestObserver2.onCompleted();

                    filterRequestObserver3.onCompleted();

                    // Wait for the server to complete sending data
                    if (!filterLatch.await(1, TimeUnit.MINUTES)) {
                        filterOutputArea.append("filterDataByLocation can not finish within 1 minutes\n");
                    }
                } catch (RuntimeException e1) {
                    filterRequestObserver1.onError(e1);
                    filterRequestObserver2.onError(e1);
                    filterRequestObserver3.onError(e1);
                    throw e1;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                } finally {
                    channel.shutdown();
                }
            }

        });

        // Set Favorite Location ActionListener
        setFavoriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location1 = favoriteLocationField1.getText();
                String location2 = favoriteLocationField2.getText();
                String location3 = favoriteLocationField3.getText();

                ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
                DataVisualizationStub asyncStub = DataVisualizationGrpc.newStub(channel);

                CountDownLatch favoriteLatch = new CountDownLatch(1);
                StreamObserver<FavoriteLocationResponse> favoriteResponseObserver = new StreamObserver<FavoriteLocationResponse>() {
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
                };

                StreamObserver<FavoriteLocationRequest> favoriteRequestObserver = asyncStub
                        .withDeadlineAfter(5, TimeUnit.SECONDS) // set a 5-second deadline
                        .setFavoriteLocation(favoriteResponseObserver);

                try {
                    if (!location1.isEmpty()) {
                        FavoriteLocationRequest favoriteRequest1 = FavoriteLocationRequest.newBuilder()
                                .setLocation(location1)
                                .build();
                        favoriteRequestObserver.onNext(favoriteRequest1);
                    }

                    if (!location2.isEmpty()) {
                        FavoriteLocationRequest favoriteRequest2 = FavoriteLocationRequest.newBuilder()
                                .setLocation(location2)
                                .build();
                        favoriteRequestObserver.onNext(favoriteRequest2);
                    }

                    if (!location3.isEmpty()) {
                        FavoriteLocationRequest favoriteRequest3 = FavoriteLocationRequest.newBuilder()
                                .setLocation(location3)
                                .build();
                        favoriteRequestObserver.onNext(favoriteRequest3);
                    }

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
