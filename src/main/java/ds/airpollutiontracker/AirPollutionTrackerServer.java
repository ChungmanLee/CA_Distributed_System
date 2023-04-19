package ds.airpollutiontracker;

import java.io.IOException;

import ds.airpollutiontracker.AirPollutionTrackerGrpc.AirPollutionTrackerImplBase;
import ds.airpollutiontracker.AirPollutionTrackerServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirPollutionTrackerServer extends AirPollutionTrackerImplBase{
	public static void main(String[] args) throws InterruptedException, IOException {
		AirPollutionTrackerServer aTracker = new AirPollutionTrackerServer();

		int port = 50351;
		
		Server server = ServerBuilder.forPort(port)
				.addService(aTracker)
				.build()
				.start();

		System.out.println("AirPollutionTracker started, listening on " + port);

		server.awaitTermination();
		
	}
}
