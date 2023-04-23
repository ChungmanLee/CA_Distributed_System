package ds.waterpollutiontracker;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.waterpollutiontracker.WaterPollutionTrackerGrpc.WaterPollutionTrackerImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WaterPollutionTrackerServer extends WaterPollutionTrackerImplBase {
    static int port = 50084;
    
    public static void main(String[] args) throws InterruptedException, IOException {
        WaterPollutionTrackerServer wTracker = new WaterPollutionTrackerServer();

        Server server;
        try {
            server = ServerBuilder.forPort(port)
                    .addService(wTracker)
                    .build()
                    .start();

            System.out.println("WaterPollutionTracker started, listening on " + port);
            
            registerWithJmDNS();
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getWaterPollutionHistory(WaterPollutionHistoryRequest request,
                                         StreamObserver<WaterPollutionLevel> responseObserver) {
        Instant startTime = Instant.ofEpochMilli(request.getStartTime());
        Instant endTime = Instant.ofEpochMilli(request.getEndTime());
        String location = request.getLocation();

        // Pass startTime and endTime to generateSampleData()
        List<WaterPollutionLevel> pollutionLevels = generateSampleDataHistory(startTime, endTime);

        List<WaterPollutionLevel> filteredData = pollutionLevels.stream()
                .filter(level -> level.getLocation().equals(location))
                .filter(level -> Instant.parse(level.getTimestamp()).isAfter(startTime))
                .filter(level -> Instant.parse(level.getTimestamp()).isBefore(endTime))
                .collect(Collectors.toList());

        for (WaterPollutionLevel level : filteredData) {
            responseObserver.onNext(level);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getWaterPollutionAlerts(WaterPollutionAlertsRequest request,
                                        StreamObserver<WaterPollutionAlertsResponse> responseObserver) {
        // TODO: Replace this with actual data retrieval from the database
        List<WaterPollutionAlert> alerts = generateSampleAlerts();

        int threshold = request.getThreshold();
        String location = request.getLocation();

        List<WaterPollutionAlert> filteredAlerts = alerts.stream()
                .filter(alert -> alert.getLocation().equals(location))
                .filter(alert -> alert.getPollutionLevel() > threshold)
                .collect(Collectors.toList());

        WaterPollutionAlertsResponse response = WaterPollutionAlertsResponse.newBuilder()
                .addAllAlerts(filteredAlerts)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<WaterPollutionMonitorRequest> monitorWaterPollution(
            StreamObserver<WaterPollutionLevel> responseObserver) {
        // TODO: Replace this with actual real-time data monitoring implementation
        return new StreamObserver<WaterPollutionMonitorRequest>() {
            @Override
            public void onNext(WaterPollutionMonitorRequest request) {
                String location = request.getLocation();

                // Generate sample data for demonstration purposes
                List<WaterPollutionLevel> pollutionLevels = generateSampleDataMonitor();
                
                for (WaterPollutionLevel level : pollutionLevels) {
                    if (level.getLocation().equals(location)) {
                        responseObserver.onNext(level);
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in WaterPollutionTrackerServer: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
    
    private List<WaterPollutionLevel> generateSampleDataHistory(Instant startTime, Instant endTime) {
        // This method generates sample data for demonstration purposes
        List<WaterPollutionLevel> pollutionLevels = new ArrayList<>();
        Random random = new Random();
        long duration = endTime.toEpochMilli() - startTime.toEpochMilli();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                long randomTimestamp = startTime.toEpochMilli() + (long) (random.nextDouble() * duration);
                Instant sampleTimestamp = Instant.ofEpochMilli(randomTimestamp);
                WaterPollutionLevel level = WaterPollutionLevel.newBuilder()
                        .setLocation("Dublin " + i)
                        .setPollutionType("Pollution type " + i)
                        .setPollutionLevel(random.nextFloat() * 200)
                        .setTimestamp(sampleTimestamp.toString())
                        .build();
                pollutionLevels.add(level);
            }
        }
        return pollutionLevels;
    }

    private List<WaterPollutionLevel> generateSampleDataMonitor() {
        // This method generates sample data for demonstration purposes
        List<WaterPollutionLevel> pollutionLevels = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            WaterPollutionLevel level = WaterPollutionLevel.newBuilder()
                    .setLocation("Dublin " + i)
                    .setPollutionType("Pollution type " + i)
                    .setPollutionLevel(random.nextFloat() * 200)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            pollutionLevels.add(level);
        }
        for (int i = 1; i <= 10; i++) {
            WaterPollutionLevel level = WaterPollutionLevel.newBuilder()
                    .setLocation("Dublin " + i)
                    .setPollutionType("Pollution type " + i)
                    .setPollutionLevel(random.nextFloat() * 200)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            pollutionLevels.add(level);
        }
        for (int i = 1; i <= 10; i++) {
            WaterPollutionLevel level = WaterPollutionLevel.newBuilder()
                    .setLocation("Dublin " + i)
                    .setPollutionType("Pollution type " + i)
                    .setPollutionLevel(random.nextFloat() * 200)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            pollutionLevels.add(level);
        }
        return pollutionLevels;
    }

    private List<WaterPollutionAlert> generateSampleAlerts() {
        // This method generates sample alerts for demonstration purposes
        List<WaterPollutionAlert> alerts = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            WaterPollutionAlert alert = WaterPollutionAlert.newBuilder()
                    .setLocation("Dublin " + i)
                    .setPollutionType("Pollution type " + i)
                    .setPollutionLevel(random.nextFloat() * 300)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            alerts.add(alert);
        }
        return alerts;
    }
    
 // Add the JmDNS registration method here
    public static void registerWithJmDNS() {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "water-pollution-tracker", port, "WaterPollutionTracker service");
            jmdns.registerService(serviceInfo);

            // Wait a bit
            Thread.sleep(20000);

            // Unregister all services
            // jmdns.unregisterAllServices();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                jmdns.unregisterAllServices();
            }));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}