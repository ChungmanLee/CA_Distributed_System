package ds.datavisualizer;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.datavisualizer.DataVisualizationGrpc.DataVisualizationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DataVisualizerServer extends DataVisualizationImplBase {
	static int port = 50243;
    public static void main(String[] args) throws InterruptedException, IOException {
        DataVisualizerServer dataVisualizer = new DataVisualizerServer();

        

        Server server;
        try {
            server = ServerBuilder.forPort(port).addService(dataVisualizer).build().start();

            System.out.println("DataVisualizer started, listening on " + port);
            
            registerWithJmDNS();
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getPollutionStatistics(PollutionStatisticsRequest request,
                                       StreamObserver<PollutionStatistics> responseObserver) {
        List<PollutionLevel> sampleData = generateSamplePollutionData();
        // Process the sample data to calculate pollution statistics
        // For simplicity, we'll just send the first pollution level as an example
        PollutionStatistics statistics = PollutionStatistics.newBuilder()
                .setAveragePollutionLevel(sampleData.get(0).getPollutionLevel()).build();
        responseObserver.onNext(statistics);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<LocationFilterRequest> filterDataByLocation(StreamObserver<PollutionLevel> responseObserver) {
        return new StreamObserver<LocationFilterRequest>() {
            @Override
            public void onNext(LocationFilterRequest request) {
                List<PollutionLevel> sampleData = generateSamplePollutionData();

                // Filter the data based on the location in the request
                for (PollutionLevel pollutionLevel : sampleData) {
                    if (pollutionLevel.getLocation().equals(request.getLocation())) {
                        responseObserver.onNext(pollutionLevel);
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<FavoriteLocationRequest> setFavoriteLocation(
            StreamObserver<FavoriteLocationResponse> responseObserver) {
        return new StreamObserver<FavoriteLocationRequest>() {
            @Override
            public void onNext(FavoriteLocationRequest request) {
                // Save the favorite location
                // For simplicity, we'll just print the location and assume it's saved
                System.out.println("Favorite location saved: " + request.getLocation());

                FavoriteLocationResponse response = FavoriteLocationResponse.newBuilder()
                        .setStatus("Location saved successfully").build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private List<PollutionLevel> generateSamplePollutionData() {
        // This method generates sample data for demonstration purposes
        List<PollutionLevel> pollutionData = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            PollutionLevel pollutionLevel = PollutionLevel.newBuilder()
                    .setLocation("SampleLocation")
                    .setPollutionType("Chemical")
                    .setPollutionLevel(random.nextFloat() * 100).setTimestamp(Instant.now().getEpochSecond()).build();
            pollutionData.add(pollutionLevel);
        }
        return pollutionData;
    }
    
    // JmDNS registration method
    public static void registerWithJmDNS() {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "data-visualizer", port, "DataVisualizer service");
            jmdns.registerService(serviceInfo);

            // Wait a bit
            Thread.sleep(20000);

            // Unregister all services
            // jmdns.unregisterAllServices();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}