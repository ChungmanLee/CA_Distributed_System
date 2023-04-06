package grpc.distributedca;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: pollutiontracking.proto")
public final class DataVisualizationGrpc {

  private DataVisualizationGrpc() {}

  public static final String SERVICE_NAME = "smartpollutiontracker.DataVisualization";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.PollutionStatisticsRequest,
      grpc.distributedca.PollutionStatistics> getGetPollutionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPollutionStatistics",
      requestType = grpc.distributedca.PollutionStatisticsRequest.class,
      responseType = grpc.distributedca.PollutionStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.PollutionStatisticsRequest,
      grpc.distributedca.PollutionStatistics> getGetPollutionStatisticsMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.PollutionStatisticsRequest, grpc.distributedca.PollutionStatistics> getGetPollutionStatisticsMethod;
    if ((getGetPollutionStatisticsMethod = DataVisualizationGrpc.getGetPollutionStatisticsMethod) == null) {
      synchronized (DataVisualizationGrpc.class) {
        if ((getGetPollutionStatisticsMethod = DataVisualizationGrpc.getGetPollutionStatisticsMethod) == null) {
          DataVisualizationGrpc.getGetPollutionStatisticsMethod = getGetPollutionStatisticsMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.PollutionStatisticsRequest, grpc.distributedca.PollutionStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.DataVisualization", "GetPollutionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.PollutionStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.PollutionStatistics.getDefaultInstance()))
                  .setSchemaDescriptor(new DataVisualizationMethodDescriptorSupplier("GetPollutionStatistics"))
                  .build();
          }
        }
     }
     return getGetPollutionStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.LocationFilterRequest,
      grpc.distributedca.PollutionLevel> getFilterDataByLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterDataByLocation",
      requestType = grpc.distributedca.LocationFilterRequest.class,
      responseType = grpc.distributedca.PollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.LocationFilterRequest,
      grpc.distributedca.PollutionLevel> getFilterDataByLocationMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.LocationFilterRequest, grpc.distributedca.PollutionLevel> getFilterDataByLocationMethod;
    if ((getFilterDataByLocationMethod = DataVisualizationGrpc.getFilterDataByLocationMethod) == null) {
      synchronized (DataVisualizationGrpc.class) {
        if ((getFilterDataByLocationMethod = DataVisualizationGrpc.getFilterDataByLocationMethod) == null) {
          DataVisualizationGrpc.getFilterDataByLocationMethod = getFilterDataByLocationMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.LocationFilterRequest, grpc.distributedca.PollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.DataVisualization", "FilterDataByLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.LocationFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.PollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new DataVisualizationMethodDescriptorSupplier("FilterDataByLocation"))
                  .build();
          }
        }
     }
     return getFilterDataByLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.FavoriteLocationRequest,
      grpc.distributedca.FavoriteLocationResponse> getSetFavoriteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFavoriteLocation",
      requestType = grpc.distributedca.FavoriteLocationRequest.class,
      responseType = grpc.distributedca.FavoriteLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.FavoriteLocationRequest,
      grpc.distributedca.FavoriteLocationResponse> getSetFavoriteLocationMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.FavoriteLocationRequest, grpc.distributedca.FavoriteLocationResponse> getSetFavoriteLocationMethod;
    if ((getSetFavoriteLocationMethod = DataVisualizationGrpc.getSetFavoriteLocationMethod) == null) {
      synchronized (DataVisualizationGrpc.class) {
        if ((getSetFavoriteLocationMethod = DataVisualizationGrpc.getSetFavoriteLocationMethod) == null) {
          DataVisualizationGrpc.getSetFavoriteLocationMethod = getSetFavoriteLocationMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.FavoriteLocationRequest, grpc.distributedca.FavoriteLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.DataVisualization", "SetFavoriteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.FavoriteLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.FavoriteLocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataVisualizationMethodDescriptorSupplier("SetFavoriteLocation"))
                  .build();
          }
        }
     }
     return getSetFavoriteLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataVisualizationStub newStub(io.grpc.Channel channel) {
    return new DataVisualizationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataVisualizationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataVisualizationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataVisualizationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataVisualizationFutureStub(channel);
  }

  /**
   */
  public static abstract class DataVisualizationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server-side streaming RPC to retrieve pollution statistics
     * </pre>
     */
    public void getPollutionStatistics(grpc.distributedca.PollutionStatisticsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.PollutionStatistics> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPollutionStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to filter pollution data by location
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.LocationFilterRequest> filterDataByLocation(
        io.grpc.stub.StreamObserver<grpc.distributedca.PollutionLevel> responseObserver) {
      return asyncUnimplementedStreamingCall(getFilterDataByLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set favorite locations
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.FavoriteLocationRequest> setFavoriteLocation(
        io.grpc.stub.StreamObserver<grpc.distributedca.FavoriteLocationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetFavoriteLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPollutionStatisticsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.distributedca.PollutionStatisticsRequest,
                grpc.distributedca.PollutionStatistics>(
                  this, METHODID_GET_POLLUTION_STATISTICS)))
          .addMethod(
            getFilterDataByLocationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.distributedca.LocationFilterRequest,
                grpc.distributedca.PollutionLevel>(
                  this, METHODID_FILTER_DATA_BY_LOCATION)))
          .addMethod(
            getSetFavoriteLocationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.distributedca.FavoriteLocationRequest,
                grpc.distributedca.FavoriteLocationResponse>(
                  this, METHODID_SET_FAVORITE_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class DataVisualizationStub extends io.grpc.stub.AbstractStub<DataVisualizationStub> {
    private DataVisualizationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataVisualizationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC to retrieve pollution statistics
     * </pre>
     */
    public void getPollutionStatistics(grpc.distributedca.PollutionStatisticsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.PollutionStatistics> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPollutionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to filter pollution data by location
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.LocationFilterRequest> filterDataByLocation(
        io.grpc.stub.StreamObserver<grpc.distributedca.PollutionLevel> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFilterDataByLocationMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set favorite locations
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.FavoriteLocationRequest> setFavoriteLocation(
        io.grpc.stub.StreamObserver<grpc.distributedca.FavoriteLocationResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSetFavoriteLocationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DataVisualizationBlockingStub extends io.grpc.stub.AbstractStub<DataVisualizationBlockingStub> {
    private DataVisualizationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataVisualizationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC to retrieve pollution statistics
     * </pre>
     */
    public java.util.Iterator<grpc.distributedca.PollutionStatistics> getPollutionStatistics(
        grpc.distributedca.PollutionStatisticsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPollutionStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataVisualizationFutureStub extends io.grpc.stub.AbstractStub<DataVisualizationFutureStub> {
    private DataVisualizationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataVisualizationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_POLLUTION_STATISTICS = 0;
  private static final int METHODID_FILTER_DATA_BY_LOCATION = 1;
  private static final int METHODID_SET_FAVORITE_LOCATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataVisualizationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataVisualizationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POLLUTION_STATISTICS:
          serviceImpl.getPollutionStatistics((grpc.distributedca.PollutionStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.distributedca.PollutionStatistics>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILTER_DATA_BY_LOCATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.filterDataByLocation(
              (io.grpc.stub.StreamObserver<grpc.distributedca.PollutionLevel>) responseObserver);
        case METHODID_SET_FAVORITE_LOCATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setFavoriteLocation(
              (io.grpc.stub.StreamObserver<grpc.distributedca.FavoriteLocationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataVisualizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataVisualizationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataVisualization");
    }
  }

  private static final class DataVisualizationFileDescriptorSupplier
      extends DataVisualizationBaseDescriptorSupplier {
    DataVisualizationFileDescriptorSupplier() {}
  }

  private static final class DataVisualizationMethodDescriptorSupplier
      extends DataVisualizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataVisualizationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataVisualizationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataVisualizationFileDescriptorSupplier())
              .addMethod(getGetPollutionStatisticsMethod())
              .addMethod(getFilterDataByLocationMethod())
              .addMethod(getSetFavoriteLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
