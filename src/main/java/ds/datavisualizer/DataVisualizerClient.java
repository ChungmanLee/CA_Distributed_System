package ds.datavisualizer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DataVisualizerClient {
    static String serviceType = "_http._tcp.local.";
    static String resolvedIP;
    static int port;

    public static void main(String[] args) {
        discoverServiceWithJmDNS();

        ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();
        DataVisualizationGrpc.DataVisualizationBlockingStub blockingStub = DataVisualizationGrpc.newBlockingStub(channel);
        DataVisualizationGrpc.DataVisualizationStub asyncStub = DataVisualizationGrpc.newStub(channel);

        // Method 1
        PollutionStatisticsRequest statisticsRequest = PollutionStatisticsRequest.newBuilder()
                .setLocation("SampleLocation")
                .build();

        Iterator<PollutionStatistics> statisticsIterator = blockingStub.getPollutionStatistics(statisticsRequest);
        while (statisticsIterator.hasNext()) {
            PollutionStatistics statistics = statisticsIterator.next();
            System.out.println("Statistics sent by the server: " + statistics);
        }

        // Method 2
        CountDownLatch finishedLatch = new CountDownLatch(1);
        StreamObserver<LocationFilterRequest> filterRequestObserver = asyncStub.filterDataByLocation(new StreamObserver<PollutionLevel>() {
            @Override
            public void onNext(PollutionLevel value) {
                System.out.println("Filtered data: " + value);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in DataVisualizerClient: " + t.getMessage());
                finishedLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Filtered data receiving completed.");
                finishedLatch.countDown();
            }
        });

        try {
            LocationFilterRequest filterRequest = LocationFilterRequest.newBuilder()
                    .setLocation("SampleLocation")
                    .build();
            filterRequestObserver.onNext(filterRequest);

            filterRequestObserver.onCompleted();

            // Wait for the server to complete sending data
            if (!finishedLatch.await(1, TimeUnit.MINUTES)) {
                System.out.println("filterDataByLocation can not finish within 1 minutes");
            }
        } catch (RuntimeException e) {
            filterRequestObserver.onError(e);
            throw e;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Method 3
        CountDownLatch favoriteLatch = new CountDownLatch(1);
        StreamObserver<FavoriteLocationRequest> favoriteRequestObserver = asyncStub.setFavoriteLocation(new StreamObserver<FavoriteLocationResponse>() {
            @Override
            public void onNext(FavoriteLocationResponse value) {
                System.out.println("Favorite location response: " + value);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in DataVisualizerClient: " + t.getMessage());
                favoriteLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Favorite location setting completed.");
                favoriteLatch.countDown();
            }
        });

        try {
            FavoriteLocationRequest favoriteRequest = FavoriteLocationRequest.newBuilder()
                    .setLocation("SampleLocation")
                    .build();
            favoriteRequestObserver.onNext(favoriteRequest);

            favoriteRequestObserver.onCompleted();

            // Wait for the server to complete sending data
            if (!favoriteLatch.await(1, TimeUnit.MINUTES)) {
                System.out.println("setFavoriteLocation can not finish within 1 minutes");
            }
        } catch (RuntimeException e) {
            favoriteRequestObserver.onError(e);
            throw e;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            channel.shutdown();
        }
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
        }
    }
}