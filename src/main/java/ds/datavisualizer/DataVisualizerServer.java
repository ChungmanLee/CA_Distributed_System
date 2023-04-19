package ds.datavisualizer;

import java.io.IOException;

import ds.datavisualizer.DataVisualizationGrpc.DataVisualizationImplBase;
import ds.datavisualizer.DataVisualizerServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DataVisualizerServer extends DataVisualizationImplBase{
	public static void main(String[] args) throws InterruptedException, IOException {
		DataVisualizerServer dataVisualizer = new DataVisualizerServer();

		int port = 50251;

		Server server = ServerBuilder.forPort(port)
				.addService(dataVisualizer)
				.build()
				.start();
		
		System.out.println("DataVisualizer started, listening on " + port);
		
		server.awaitTermination();
	}
}
