package ds.waterpollutiontracker;

import java.io.IOException;

import ds.waterpollutiontracker.WaterPollutionTrackerServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WaterPollutionTrackerServer {
	public static void main(String[] args) throws InterruptedException, IOException {
		WaterPollutionTrackerServer wTracker = new WaterPollutionTrackerServer();

		int port = 50151;

		Server server = ServerBuilder.forPort(port)
				.addService(wTracker)
				.build()
				.start();

		System.out.println("WaterPollutionTracker, listening on " + port);

		server.awaitTermination();
	}
}
