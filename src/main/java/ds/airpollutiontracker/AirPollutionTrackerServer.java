package ds.airpollutiontracker;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirPollutionTrackerServer extends AirPollutionTrackerImplBase {
	static int port = 50093;

	public static void main(String[] args) throws InterruptedException, IOException {
		AirPollutionTrackerServer aTracker = new AirPollutionTrackerServer();

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(aTracker).build().start();

			System.out.println("AirPollutionTracker started, listening on " + port);

			registerWithJmDNS();
			server.awaitTermination();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Implementation of method 1. server-side streaming rpc that will receive location, start time and end time. This server will streaming and send back to the history.
	@Override
	public void getAirPollutionHistory(AirPollutionHistoryRequest request,
			StreamObserver<AirPollutionLevel> responseObserver) {
		Instant startTime = Instant.ofEpochMilli(request.getStartTime());
		Instant endTime = Instant.ofEpochMilli(request.getEndTime());
		String location = request.getLocation();

		// Call the generateSampleData() method with startTime and endTime
		List<AirPollutionLevel> pollutionLevels = generateSampleData(startTime, endTime);

		List<AirPollutionLevel> filteredData = pollutionLevels.stream()
				.filter(level -> level.getLocation().equals(location))
				.filter(level -> Instant.parse(level.getTimestamp()).isAfter(startTime))
				.filter(level -> Instant.parse(level.getTimestamp()).isBefore(endTime)).collect(Collectors.toList());

		for (AirPollutionLevel level : filteredData) {
			responseObserver.onNext(level);
		}
		responseObserver.onCompleted();
	}
	
	// it will return an alert message only when the pollution level is larger than the threshold the client gave.
	@Override
	public void getAirPollutionAlerts(AirPollutionAlertsRequest request,
	    StreamObserver<AirPollutionAlertsResponse> responseObserver) {
	    List<AirPollutionAlert> alerts = generateSampleAlerts();

	    int threshold = request.getThreshold();
	    String location = request.getLocation();

	    List<AirPollutionAlert> filteredAlerts = alerts.stream()
	            .filter(alert -> alert.getLocation().equals(location))
	            .filter(alert -> alert.getPollutionLevel() > (float)threshold) // This line has been updated
	            .collect(Collectors.toList());

	    AirPollutionAlertsResponse response = AirPollutionAlertsResponse.newBuilder().addAllAlerts(filteredAlerts)
	            .build();

	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}

	// bidirectional rpc. This method is responsible for monitoring real-time water pollution data for a specified location.
	@Override
	public StreamObserver<AirPollutionMonitorRequest> monitorAirPollution(
			StreamObserver<AirPollutionLevel> responseObserver) {
		return new StreamObserver<AirPollutionMonitorRequest>() {
			@Override
			public void onNext(AirPollutionMonitorRequest request) {
				String location = request.getLocation();

				// Generate sample data for demonstration purposes
				List<AirPollutionLevel> pollutionLevels = generateSampleDataMonitor();

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
	
	// helper method to generate some sample for getWaterPollutionHistory rpc
	private List<AirPollutionLevel> generateSampleData(Instant startTime, Instant endTime) {
		// This method generates sample data for demonstration purposes
		List<AirPollutionLevel> pollutionLevels = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Instant timestamp = startTime
					.plusSeconds(random.nextInt((int) (endTime.getEpochSecond() - startTime.getEpochSecond())));
			AirPollutionLevel level = AirPollutionLevel.newBuilder().setLocation("Dublin " + i)
					.setPollutionType("Polluion type " + i).setPollutionLevel(random.nextFloat() * 200)
					.setTimestamp(timestamp.toString()).build();
			pollutionLevels.add(level);
		}
		for (int i = 0; i < 10; i++) {
			Instant timestamp = startTime
					.plusSeconds(random.nextInt((int) (endTime.getEpochSecond() - startTime.getEpochSecond())));
			AirPollutionLevel level = AirPollutionLevel.newBuilder().setLocation("Dublin " + i)
					.setPollutionType("Polluion type " + i).setPollutionLevel(random.nextFloat() * 200)
					.setTimestamp(timestamp.toString()).build();
			pollutionLevels.add(level);
		}
		return pollutionLevels;
	}
	
	// helper method to generate some sample for monitorWaterPollution rpc
	private List<AirPollutionLevel> generateSampleDataMonitor() {
		// This method generates sample data for demonstration purposes
		List<AirPollutionLevel> pollutionLevels = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			AirPollutionLevel level = AirPollutionLevel.newBuilder().setLocation("Dublin " + i)
					.setPollutionType("Polluion type " + i).setPollutionLevel(random.nextFloat() * 200)
					.setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString()).build();
			pollutionLevels.add(level);
		}
		for (int i = 0; i < 10; i++) {
			AirPollutionLevel level = AirPollutionLevel.newBuilder().setLocation("Dublin " + i)
					.setPollutionType("Polluion type " + i).setPollutionLevel(random.nextFloat() * 200)
					.setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString()).build();
			pollutionLevels.add(level);
		}
		return pollutionLevels;
	}

	// helper method to generate some sample for getWaterPollutionAlert rpc
	private List<AirPollutionAlert> generateSampleAlerts() {
		// This method generates sample alerts for demonstration purposes
		List<AirPollutionAlert> alerts = new ArrayList<>();
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			AirPollutionAlert alert = AirPollutionAlert.newBuilder().setLocation("Dublin " + i)
					.setPollutionType("Pollution type " + i).setPollutionLevel(random.nextFloat() * 300)
					.setTimestamp(Instant.now().minusSeconds(random.nextInt(3600)).toString()).build();
			alerts.add(alert);
		}
		return alerts;
	}

	// JmDNS registration method
	public static void registerWithJmDNS() {
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "air-pollution-tracker", port,
					"AirPollutionTracker service");
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