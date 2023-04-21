package ds.waterpollutiontracker;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import ds.waterpollutiontracker.WaterPollutionTrackerGrpc.WaterPollutionTrackerBlockingStub;
import ds.waterpollutiontracker.WaterPollutionTrackerGrpc.WaterPollutionTrackerStub;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.net.InetAddress;

public class WaterPollutionTrackerClient {
	static String serviceType = "_http._tcp.local.";
    static String resolvedIP;
    static int port;
    public static void main(String[] args) {
    	discoverServiceWithJmDNS();

    	ManagedChannel channel = ManagedChannelBuilder.forAddress(resolvedIP, port).usePlaintext().build();

        WaterPollutionTrackerBlockingStub blockingStub = WaterPollutionTrackerGrpc.newBlockingStub(channel);
        WaterPollutionTrackerStub asyncStub = WaterPollutionTrackerGrpc.newStub(channel);

        // Method 1
        WaterPollutionAlertsRequest alertRequest = WaterPollutionAlertsRequest.newBuilder()
                .setLocation("Dublin 1")
                .setThreshold(10)
                .build();

        WaterPollutionAlertsResponse alertsResponse = blockingStub.getWaterPollutionAlerts(alertRequest);
        System.out.println("Alerts sent by the server: " + alertsResponse.getAlertsList());

        // Method 2
        WaterPollutionHistoryRequest historyRequest = WaterPollutionHistoryRequest.newBuilder()
                .setStartTime(Instant.now().minusSeconds(3600).toEpochMilli()) // Replace with desired start time in milliseconds
                .setEndTime(Instant.now().toEpochMilli()) // Replace with desired end time in milliseconds
                .setLocation("Dublin 2")
                .build();

        Iterator<WaterPollutionLevel> historyResponseIterator = blockingStub.getWaterPollutionHistory(historyRequest);
        while (historyResponseIterator.hasNext()) {
            WaterPollutionLevel historyResponse = historyResponseIterator.next();
            System.out.println("History message sent by the server: " + historyResponse);
        }

     // Method 3
        WaterPollutionMonitorRequest monitorRequest = WaterPollutionMonitorRequest.newBuilder()
                .setLocation("Dublin 3")
                .build();

        CountDownLatch finishedLatch = new CountDownLatch(1);

        StreamObserver<WaterPollutionMonitorRequest> monitorRequestObserver = asyncStub.monitorWaterPollution(new StreamObserver<WaterPollutionLevel>() {
            @Override
            public void onNext(WaterPollutionLevel value) {
                System.out.println("Received real-time data: " + value);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered in WaterPollutionTrackerClient: " + t.getMessage());
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
                System.out.println("monitorWaterPollution can not finish within 1 minutes");
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
