package ds.waterpollutiontracker;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import ds.waterpollutiontracker.WaterPollutionTrackerGrpc.WaterPollutionTrackerImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WaterPollutionTrackerServer extends WaterPollutionTrackerImplBase {
    public static void main(String[] args) throws InterruptedException, IOException {
        WaterPollutionTrackerServer wTracker = new WaterPollutionTrackerServer();

        int port = 50151;

        Server server;
        try {
            server = ServerBuilder.forPort(port)
                    .addService(wTracker)
                    .build()
                    .start();

            System.out.println("WaterPollutionTracker started, listening on " + port);

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
        // TODO: Replace this with actual data retrieval from the database
        List<WaterPollutionLevel> pollutionLevels = generateSampleData();

        Instant startTime = Instant.ofEpochMilli(request.getStartTime());
        Instant endTime = Instant.ofEpochMilli(request.getEndTime());
        String location = request.getLocation();

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
                List<WaterPollutionLevel> pollutionLevels = generateSampleData();

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

    private List<WaterPollutionLevel> generateSampleData() {
        // This method generates sample data for demonstration purposes
        List<WaterPollutionLevel> pollutionLevels = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            WaterPollutionLevel level = WaterPollutionLevel.newBuilder()
                    .setLocation("SampleLocation")
                    .setPollutionType("Chemical")
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
        for (int i = 0; i < 5; i++) {
            WaterPollutionAlert alert = WaterPollutionAlert.newBuilder()
                    .setLocation("SampleLocation")
                    .setPollutionType("Chemical")
                    .setPollutionLevel(random.nextFloat() * 300)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            alerts.add(alert);
        }
        return alerts;
    }
}