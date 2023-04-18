package ds.airpollutiontracker;

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
    comments = "Source: airpollutiontracker.proto")
public final class AirPollutionTrackerGrpc {

  private AirPollutionTrackerGrpc() {}

  public static final String SERVICE_NAME = "airpollutiontracker.AirPollutionTracker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionHistoryRequest,
      ds.airpollutiontracker.AirPollutionLevel> getGetAirPollutionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirPollutionHistory",
      requestType = ds.airpollutiontracker.AirPollutionHistoryRequest.class,
      responseType = ds.airpollutiontracker.AirPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionHistoryRequest,
      ds.airpollutiontracker.AirPollutionLevel> getGetAirPollutionHistoryMethod() {
    io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionHistoryRequest, ds.airpollutiontracker.AirPollutionLevel> getGetAirPollutionHistoryMethod;
    if ((getGetAirPollutionHistoryMethod = AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getGetAirPollutionHistoryMethod = AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod) == null) {
          AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod = getGetAirPollutionHistoryMethod = 
              io.grpc.MethodDescriptor.<ds.airpollutiontracker.AirPollutionHistoryRequest, ds.airpollutiontracker.AirPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airpollutiontracker.AirPollutionTracker", "GetAirPollutionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionTrackerMethodDescriptorSupplier("GetAirPollutionHistory"))
                  .build();
          }
        }
     }
     return getGetAirPollutionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionAlertsRequest,
      ds.airpollutiontracker.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirPollutionAlerts",
      requestType = ds.airpollutiontracker.AirPollutionAlertsRequest.class,
      responseType = ds.airpollutiontracker.AirPollutionAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionAlertsRequest,
      ds.airpollutiontracker.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod() {
    io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionAlertsRequest, ds.airpollutiontracker.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod;
    if ((getGetAirPollutionAlertsMethod = AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getGetAirPollutionAlertsMethod = AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod) == null) {
          AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod = getGetAirPollutionAlertsMethod = 
              io.grpc.MethodDescriptor.<ds.airpollutiontracker.AirPollutionAlertsRequest, ds.airpollutiontracker.AirPollutionAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airpollutiontracker.AirPollutionTracker", "GetAirPollutionAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionTrackerMethodDescriptorSupplier("GetAirPollutionAlerts"))
                  .build();
          }
        }
     }
     return getGetAirPollutionAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionMonitorRequest,
      ds.airpollutiontracker.AirPollutionLevel> getMonitorAirPollutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorAirPollution",
      requestType = ds.airpollutiontracker.AirPollutionMonitorRequest.class,
      responseType = ds.airpollutiontracker.AirPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionMonitorRequest,
      ds.airpollutiontracker.AirPollutionLevel> getMonitorAirPollutionMethod() {
    io.grpc.MethodDescriptor<ds.airpollutiontracker.AirPollutionMonitorRequest, ds.airpollutiontracker.AirPollutionLevel> getMonitorAirPollutionMethod;
    if ((getMonitorAirPollutionMethod = AirPollutionTrackerGrpc.getMonitorAirPollutionMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getMonitorAirPollutionMethod = AirPollutionTrackerGrpc.getMonitorAirPollutionMethod) == null) {
          AirPollutionTrackerGrpc.getMonitorAirPollutionMethod = getMonitorAirPollutionMethod = 
              io.grpc.MethodDescriptor.<ds.airpollutiontracker.AirPollutionMonitorRequest, ds.airpollutiontracker.AirPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airpollutiontracker.AirPollutionTracker", "MonitorAirPollution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airpollutiontracker.AirPollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionTrackerMethodDescriptorSupplier("MonitorAirPollution"))
                  .build();
          }
        }
     }
     return getMonitorAirPollutionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirPollutionTrackerStub newStub(io.grpc.Channel channel) {
    return new AirPollutionTrackerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirPollutionTrackerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirPollutionTrackerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirPollutionTrackerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirPollutionTrackerFutureStub(channel);
  }

  /**
   */
  public static abstract class AirPollutionTrackerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC to retrieve historical air pollution data
     * </pre>
     */
    public void getAirPollutionHistory(ds.airpollutiontracker.AirPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirPollutionHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public void getAirPollutionAlerts(ds.airpollutiontracker.AirPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirPollutionAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor air pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionMonitorRequest> monitorAirPollution(
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorAirPollutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAirPollutionHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.airpollutiontracker.AirPollutionHistoryRequest,
                ds.airpollutiontracker.AirPollutionLevel>(
                  this, METHODID_GET_AIR_POLLUTION_HISTORY)))
          .addMethod(
            getGetAirPollutionAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.airpollutiontracker.AirPollutionAlertsRequest,
                ds.airpollutiontracker.AirPollutionAlertsResponse>(
                  this, METHODID_GET_AIR_POLLUTION_ALERTS)))
          .addMethod(
            getMonitorAirPollutionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.airpollutiontracker.AirPollutionMonitorRequest,
                ds.airpollutiontracker.AirPollutionLevel>(
                  this, METHODID_MONITOR_AIR_POLLUTION)))
          .build();
    }
  }

  /**
   */
  public static final class AirPollutionTrackerStub extends io.grpc.stub.AbstractStub<AirPollutionTrackerStub> {
    private AirPollutionTrackerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionTrackerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionTrackerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionTrackerStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve historical air pollution data
     * </pre>
     */
    public void getAirPollutionHistory(ds.airpollutiontracker.AirPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAirPollutionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public void getAirPollutionAlerts(ds.airpollutiontracker.AirPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirPollutionAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor air pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionMonitorRequest> monitorAirPollution(
        io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorAirPollutionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AirPollutionTrackerBlockingStub extends io.grpc.stub.AbstractStub<AirPollutionTrackerBlockingStub> {
    private AirPollutionTrackerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionTrackerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionTrackerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionTrackerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve historical air pollution data
     * </pre>
     */
    public java.util.Iterator<ds.airpollutiontracker.AirPollutionLevel> getAirPollutionHistory(
        ds.airpollutiontracker.AirPollutionHistoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAirPollutionHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public ds.airpollutiontracker.AirPollutionAlertsResponse getAirPollutionAlerts(ds.airpollutiontracker.AirPollutionAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirPollutionAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AirPollutionTrackerFutureStub extends io.grpc.stub.AbstractStub<AirPollutionTrackerFutureStub> {
    private AirPollutionTrackerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionTrackerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionTrackerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionTrackerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.airpollutiontracker.AirPollutionAlertsResponse> getAirPollutionAlerts(
        ds.airpollutiontracker.AirPollutionAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirPollutionAlertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AIR_POLLUTION_HISTORY = 0;
  private static final int METHODID_GET_AIR_POLLUTION_ALERTS = 1;
  private static final int METHODID_MONITOR_AIR_POLLUTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirPollutionTrackerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirPollutionTrackerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AIR_POLLUTION_HISTORY:
          serviceImpl.getAirPollutionHistory((ds.airpollutiontracker.AirPollutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel>) responseObserver);
          break;
        case METHODID_GET_AIR_POLLUTION_ALERTS:
          serviceImpl.getAirPollutionAlerts((ds.airpollutiontracker.AirPollutionAlertsRequest) request,
              (io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionAlertsResponse>) responseObserver);
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
        case METHODID_MONITOR_AIR_POLLUTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorAirPollution(
              (io.grpc.stub.StreamObserver<ds.airpollutiontracker.AirPollutionLevel>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AirPollutionTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirPollutionTrackerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.airpollutiontracker.AirPollutionTrackerImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirPollutionTracker");
    }
  }

  private static final class AirPollutionTrackerFileDescriptorSupplier
      extends AirPollutionTrackerBaseDescriptorSupplier {
    AirPollutionTrackerFileDescriptorSupplier() {}
  }

  private static final class AirPollutionTrackerMethodDescriptorSupplier
      extends AirPollutionTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirPollutionTrackerMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirPollutionTrackerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirPollutionTrackerFileDescriptorSupplier())
              .addMethod(getGetAirPollutionHistoryMethod())
              .addMethod(getGetAirPollutionAlertsMethod())
              .addMethod(getMonitorAirPollutionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
