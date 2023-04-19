package ds.airpollutiontracker;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirPollutionTrackerServer extends AirPollutionTrackerImplBase {
    public static void main(String[] args) throws InterruptedException, IOException {
        AirPollutionTrackerServer aTracker = new AirPollutionTrackerServer();

        int port = 50351;

        Server server;
        try {
            server = ServerBuilder.forPort(port)
                    .addService(aTracker)
                    .build()
                    .start();

            System.out.println("AirPollutionTracker started, listening on " + port);

            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAirPollutionHistory(AirPollutionHistoryRequest request,
                                       StreamObserver<AirPollutionLevel> responseObserver) {
        // TODO: Replace this with actual data retrieval from the database
        List<AirPollutionLevel> pollutionLevels = generateSampleData();

        Instant startTime = Instant.ofEpochMilli(request.getStartTime());
        Instant endTime = Instant.ofEpochMilli(request.getEndTime());
        String location = request.getLocation();

        List<AirPollutionLevel> filteredData = pollutionLevels.stream()
                .filter(level -> level.getLocation().equals(location))
                .filter(level -> Instant.parse(level.getTimestamp()).isAfter(startTime))
                .filter(level -> Instant.parse(level.getTimestamp()).isBefore(endTime))
                .collect(Collectors.toList());

        for (AirPollutionLevel level : filteredData) {
            responseObserver.onNext(level);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAirPollutionAlerts(AirPollutionAlertsRequest request,
                                      StreamObserver<AirPollutionAlertsResponse> responseObserver) {
        // TODO: Replace this with actual data retrieval from the database
        List<AirPollutionAlert> alerts = generateSampleAlerts();

        int threshold = request.getThreshold();
        String location = request.getLocation();

        List<AirPollutionAlert> filteredAlerts = alerts.stream()
                .filter(alert -> alert.getLocation().equals(location))
                .filter(alert -> alert.getPollutionLevel() > threshold)
                .collect(Collectors.toList());

        AirPollutionAlertsResponse response = AirPollutionAlertsResponse.newBuilder()
                .addAllAlerts(filteredAlerts)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AirPollutionMonitorRequest> monitorAirPollution(
            StreamObserver<AirPollutionLevel> responseObserver) {
        // TODO: Replace this with actual real-time data monitoring implementation
        return new StreamObserver<AirPollutionMonitorRequest>() {
            @Override
            public void onNext(AirPollutionMonitorRequest request) {
                String location = request.getLocation();

                // Generate sample data for demonstration purposes
                List<AirPollutionLevel> pollutionLevels = generateSampleData();

                for (AirPollutionLevel level : pollutionLevels) {
                    if (level.getLocation().equals(location)) {
                        responseObserver.onNext(level);
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in AirPollutionTrackerServer: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private List<AirPollutionLevel> generateSampleData() {
        // This method generates sample data for demonstration purposes
        List<AirPollutionLevel> pollutionLevels = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            AirPollutionLevel level = AirPollutionLevel.newBuilder()
                    .setLocation("SampleLocation")
                    .setPollutionType("PM2.5")
                    .setPollutionLevel(random.nextFloat() * 200)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            pollutionLevels.add(level);
        }
        return pollutionLevels;
    }

    private List<AirPollutionAlert> generateSampleAlerts() {
        // This method generates sample alerts for demonstration purposes
        List<AirPollutionAlert> alerts = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            AirPollutionAlert alert = AirPollutionAlert.newBuilder()
                    .setLocation("SampleLocation")
                    .setPollutionType("PM2.5")
                    .setPollutionLevel(random.nextFloat() * 300)
                    .setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString())
                    .build();
            alerts.add(alert);
        }
        return alerts;
    }
}