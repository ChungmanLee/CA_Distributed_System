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
public final class AirPollutionTrackerGrpc {

  private AirPollutionTrackerGrpc() {}

  public static final String SERVICE_NAME = "smartpollutiontracker.AirPollutionTracker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionHistoryRequest,
      grpc.distributedca.AirPollutionLevel> getGetAirPollutionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirPollutionHistory",
      requestType = grpc.distributedca.AirPollutionHistoryRequest.class,
      responseType = grpc.distributedca.AirPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionHistoryRequest,
      grpc.distributedca.AirPollutionLevel> getGetAirPollutionHistoryMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionHistoryRequest, grpc.distributedca.AirPollutionLevel> getGetAirPollutionHistoryMethod;
    if ((getGetAirPollutionHistoryMethod = AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getGetAirPollutionHistoryMethod = AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod) == null) {
          AirPollutionTrackerGrpc.getGetAirPollutionHistoryMethod = getGetAirPollutionHistoryMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.AirPollutionHistoryRequest, grpc.distributedca.AirPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.AirPollutionTracker", "GetAirPollutionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionTrackerMethodDescriptorSupplier("GetAirPollutionHistory"))
                  .build();
          }
        }
     }
     return getGetAirPollutionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionAlertsRequest,
      grpc.distributedca.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirPollutionAlerts",
      requestType = grpc.distributedca.AirPollutionAlertsRequest.class,
      responseType = grpc.distributedca.AirPollutionAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionAlertsRequest,
      grpc.distributedca.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionAlertsRequest, grpc.distributedca.AirPollutionAlertsResponse> getGetAirPollutionAlertsMethod;
    if ((getGetAirPollutionAlertsMethod = AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getGetAirPollutionAlertsMethod = AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod) == null) {
          AirPollutionTrackerGrpc.getGetAirPollutionAlertsMethod = getGetAirPollutionAlertsMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.AirPollutionAlertsRequest, grpc.distributedca.AirPollutionAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.AirPollutionTracker", "GetAirPollutionAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionTrackerMethodDescriptorSupplier("GetAirPollutionAlerts"))
                  .build();
          }
        }
     }
     return getGetAirPollutionAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionMonitorRequest,
      grpc.distributedca.AirPollutionLevel> getMonitorAirPollutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorAirPollution",
      requestType = grpc.distributedca.AirPollutionMonitorRequest.class,
      responseType = grpc.distributedca.AirPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionMonitorRequest,
      grpc.distributedca.AirPollutionLevel> getMonitorAirPollutionMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.AirPollutionMonitorRequest, grpc.distributedca.AirPollutionLevel> getMonitorAirPollutionMethod;
    if ((getMonitorAirPollutionMethod = AirPollutionTrackerGrpc.getMonitorAirPollutionMethod) == null) {
      synchronized (AirPollutionTrackerGrpc.class) {
        if ((getMonitorAirPollutionMethod = AirPollutionTrackerGrpc.getMonitorAirPollutionMethod) == null) {
          AirPollutionTrackerGrpc.getMonitorAirPollutionMethod = getMonitorAirPollutionMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.AirPollutionMonitorRequest, grpc.distributedca.AirPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.AirPollutionTracker", "MonitorAirPollution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.AirPollutionLevel.getDefaultInstance()))
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
    public void getAirPollutionHistory(grpc.distributedca.AirPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirPollutionHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public void getAirPollutionAlerts(grpc.distributedca.AirPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirPollutionAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor air pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionMonitorRequest> monitorAirPollution(
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorAirPollutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAirPollutionHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.distributedca.AirPollutionHistoryRequest,
                grpc.distributedca.AirPollutionLevel>(
                  this, METHODID_GET_AIR_POLLUTION_HISTORY)))
          .addMethod(
            getGetAirPollutionAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.distributedca.AirPollutionAlertsRequest,
                grpc.distributedca.AirPollutionAlertsResponse>(
                  this, METHODID_GET_AIR_POLLUTION_ALERTS)))
          .addMethod(
            getMonitorAirPollutionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.distributedca.AirPollutionMonitorRequest,
                grpc.distributedca.AirPollutionLevel>(
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
    public void getAirPollutionHistory(grpc.distributedca.AirPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAirPollutionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public void getAirPollutionAlerts(grpc.distributedca.AirPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirPollutionAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor air pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionMonitorRequest> monitorAirPollution(
        io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel> responseObserver) {
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
    public java.util.Iterator<grpc.distributedca.AirPollutionLevel> getAirPollutionHistory(
        grpc.distributedca.AirPollutionHistoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAirPollutionHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to retrieve air pollution alerts triggered by the system
     * </pre>
     */
    public grpc.distributedca.AirPollutionAlertsResponse getAirPollutionAlerts(grpc.distributedca.AirPollutionAlertsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<grpc.distributedca.AirPollutionAlertsResponse> getAirPollutionAlerts(
        grpc.distributedca.AirPollutionAlertsRequest request) {
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
          serviceImpl.getAirPollutionHistory((grpc.distributedca.AirPollutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel>) responseObserver);
          break;
        case METHODID_GET_AIR_POLLUTION_ALERTS:
          serviceImpl.getAirPollutionAlerts((grpc.distributedca.AirPollutionAlertsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionAlertsResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<grpc.distributedca.AirPollutionLevel>) responseObserver);
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
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.getDescriptor();
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
