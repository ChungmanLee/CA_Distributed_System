package ds.airpollutiontracker;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerBlockingStub;
import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerStub;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.net.InetAddress;

public class AirPollutionTrackerClient {
    static String serviceType = "_http._tcp.local.";
    static String resolvedIP;
    static int port;

    public static void main(String[] args) {
        discoverServiceWithJmDNS();

        ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();

        AirPollutionTrackerBlockingStub blockingStub = AirPollutionTrackerGrpc.newBlockingStub(channel);
        AirPollutionTrackerStub asyncStub = AirPollutionTrackerGrpc.newStub(channel);

        // Method 1
        AirPollutionAlertsRequest alertRequest = AirPollutionAlertsRequest.newBuilder()
                .setLocation("Dublin 1")
                .setThreshold(10)
                .build();

        AirPollutionAlertsResponse alertsResponse = blockingStub.getAirPollutionAlerts(alertRequest);
        System.out.println("Alerts sent by the server: " + alertsResponse.getAlertsList());

        // Method 2
        AirPollutionHistoryRequest historyRequest = AirPollutionHistoryRequest.newBuilder()
                .setStartTime(Instant.now().minusSeconds(3600).toEpochMilli()) // Replace with desired start time in milliseconds
                .setEndTime(Instant.now().toEpochMilli()) // Replace with desired end time in milliseconds
                .setLocation("Dublin 2")
                .build();

        Iterator<AirPollutionLevel> historyResponseIterator = blockingStub.getAirPollutionHistory(historyRequest);
        while (historyResponseIterator.hasNext()) {
            AirPollutionLevel historyResponse = historyResponseIterator.next();
            System.out.println("History message sent by the server: " + historyResponse);
        }

        // Method 3
        AirPollutionMonitorRequest monitorRequest = AirPollutionMonitorRequest.newBuilder()
                .setLocation("Dublin 3")
                .build();

        CountDownLatch finishedLatch = new CountDownLatch(1);

        StreamObserver<AirPollutionMonitorRequest> monitorRequestObserver = asyncStub.monitorAirPollution(new StreamObserver<AirPollutionLevel>() {
            @Override
            public void onNext(AirPollutionLevel value) {
                System.out.println("Received real-time data: " + value);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in AirPollutionTrackerClient: " + t.getMessage());
                finishedLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Real-time data receiving completed.");
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
            	System.out.println("Air pollution monitoring did not complete within 1 minute.");
            }
        } catch (RuntimeException e) {
            monitorRequestObserver.onError(e);
            throw e;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            channel.shutdown();
        }
    }

    public static void discoverServiceWithJmDNS() {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(serviceType, new ServiceDiscoverer());

            // Wait for the service to be discovered
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // JmDNS service discovery method
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
            resolvedIP = info.getHostAddresses()[0];
            System.out.println("IP Resolved - " + resolvedIP + ":" + port);
        }
    }
}