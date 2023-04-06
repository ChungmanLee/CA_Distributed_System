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
public final class WaterPollutionTrackerGrpc {

  private WaterPollutionTrackerGrpc() {}

  public static final String SERVICE_NAME = "smartpollutiontracker.WaterPollutionTracker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionHistoryRequest,
      grpc.distributedca.WaterPollutionLevel> getGetWaterPollutionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterPollutionHistory",
      requestType = grpc.distributedca.WaterPollutionHistoryRequest.class,
      responseType = grpc.distributedca.WaterPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionHistoryRequest,
      grpc.distributedca.WaterPollutionLevel> getGetWaterPollutionHistoryMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionHistoryRequest, grpc.distributedca.WaterPollutionLevel> getGetWaterPollutionHistoryMethod;
    if ((getGetWaterPollutionHistoryMethod = WaterPollutionTrackerGrpc.getGetWaterPollutionHistoryMethod) == null) {
      synchronized (WaterPollutionTrackerGrpc.class) {
        if ((getGetWaterPollutionHistoryMethod = WaterPollutionTrackerGrpc.getGetWaterPollutionHistoryMethod) == null) {
          WaterPollutionTrackerGrpc.getGetWaterPollutionHistoryMethod = getGetWaterPollutionHistoryMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.WaterPollutionHistoryRequest, grpc.distributedca.WaterPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.WaterPollutionTracker", "GetWaterPollutionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionTrackerMethodDescriptorSupplier("GetWaterPollutionHistory"))
                  .build();
          }
        }
     }
     return getGetWaterPollutionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionAlertsRequest,
      grpc.distributedca.WaterPollutionAlertsResponse> getGetWaterPollutionAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterPollutionAlerts",
      requestType = grpc.distributedca.WaterPollutionAlertsRequest.class,
      responseType = grpc.distributedca.WaterPollutionAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionAlertsRequest,
      grpc.distributedca.WaterPollutionAlertsResponse> getGetWaterPollutionAlertsMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionAlertsRequest, grpc.distributedca.WaterPollutionAlertsResponse> getGetWaterPollutionAlertsMethod;
    if ((getGetWaterPollutionAlertsMethod = WaterPollutionTrackerGrpc.getGetWaterPollutionAlertsMethod) == null) {
      synchronized (WaterPollutionTrackerGrpc.class) {
        if ((getGetWaterPollutionAlertsMethod = WaterPollutionTrackerGrpc.getGetWaterPollutionAlertsMethod) == null) {
          WaterPollutionTrackerGrpc.getGetWaterPollutionAlertsMethod = getGetWaterPollutionAlertsMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.WaterPollutionAlertsRequest, grpc.distributedca.WaterPollutionAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.WaterPollutionTracker", "GetWaterPollutionAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionTrackerMethodDescriptorSupplier("GetWaterPollutionAlerts"))
                  .build();
          }
        }
     }
     return getGetWaterPollutionAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionMonitorRequest,
      grpc.distributedca.WaterPollutionLevel> getMonitorWaterPollutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorWaterPollution",
      requestType = grpc.distributedca.WaterPollutionMonitorRequest.class,
      responseType = grpc.distributedca.WaterPollutionLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionMonitorRequest,
      grpc.distributedca.WaterPollutionLevel> getMonitorWaterPollutionMethod() {
    io.grpc.MethodDescriptor<grpc.distributedca.WaterPollutionMonitorRequest, grpc.distributedca.WaterPollutionLevel> getMonitorWaterPollutionMethod;
    if ((getMonitorWaterPollutionMethod = WaterPollutionTrackerGrpc.getMonitorWaterPollutionMethod) == null) {
      synchronized (WaterPollutionTrackerGrpc.class) {
        if ((getMonitorWaterPollutionMethod = WaterPollutionTrackerGrpc.getMonitorWaterPollutionMethod) == null) {
          WaterPollutionTrackerGrpc.getMonitorWaterPollutionMethod = getMonitorWaterPollutionMethod = 
              io.grpc.MethodDescriptor.<grpc.distributedca.WaterPollutionMonitorRequest, grpc.distributedca.WaterPollutionLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartpollutiontracker.WaterPollutionTracker", "MonitorWaterPollution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.distributedca.WaterPollutionLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionTrackerMethodDescriptorSupplier("MonitorWaterPollution"))
                  .build();
          }
        }
     }
     return getMonitorWaterPollutionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterPollutionTrackerStub newStub(io.grpc.Channel channel) {
    return new WaterPollutionTrackerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterPollutionTrackerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterPollutionTrackerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterPollutionTrackerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterPollutionTrackerFutureStub(channel);
  }

  /**
   */
  public static abstract class WaterPollutionTrackerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC to retrieve historical water pollution data
     * </pre>
     */
    public void getWaterPollutionHistory(grpc.distributedca.WaterPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterPollutionHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve water pollution alerts triggered by the system
     * </pre>
     */
    public void getWaterPollutionAlerts(grpc.distributedca.WaterPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterPollutionAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor water pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionMonitorRequest> monitorWaterPollution(
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorWaterPollutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterPollutionHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.distributedca.WaterPollutionHistoryRequest,
                grpc.distributedca.WaterPollutionLevel>(
                  this, METHODID_GET_WATER_POLLUTION_HISTORY)))
          .addMethod(
            getGetWaterPollutionAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.distributedca.WaterPollutionAlertsRequest,
                grpc.distributedca.WaterPollutionAlertsResponse>(
                  this, METHODID_GET_WATER_POLLUTION_ALERTS)))
          .addMethod(
            getMonitorWaterPollutionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.distributedca.WaterPollutionMonitorRequest,
                grpc.distributedca.WaterPollutionLevel>(
                  this, METHODID_MONITOR_WATER_POLLUTION)))
          .build();
    }
  }

  /**
   */
  public static final class WaterPollutionTrackerStub extends io.grpc.stub.AbstractStub<WaterPollutionTrackerStub> {
    private WaterPollutionTrackerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionTrackerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionTrackerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionTrackerStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve historical water pollution data
     * </pre>
     */
    public void getWaterPollutionHistory(grpc.distributedca.WaterPollutionHistoryRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetWaterPollutionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to retrieve water pollution alerts triggered by the system
     * </pre>
     */
    public void getWaterPollutionAlerts(grpc.distributedca.WaterPollutionAlertsRequest request,
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterPollutionAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to monitor water pollution in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionMonitorRequest> monitorWaterPollution(
        io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorWaterPollutionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WaterPollutionTrackerBlockingStub extends io.grpc.stub.AbstractStub<WaterPollutionTrackerBlockingStub> {
    private WaterPollutionTrackerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionTrackerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionTrackerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionTrackerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve historical water pollution data
     * </pre>
     */
    public java.util.Iterator<grpc.distributedca.WaterPollutionLevel> getWaterPollutionHistory(
        grpc.distributedca.WaterPollutionHistoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetWaterPollutionHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to retrieve water pollution alerts triggered by the system
     * </pre>
     */
    public grpc.distributedca.WaterPollutionAlertsResponse getWaterPollutionAlerts(grpc.distributedca.WaterPollutionAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterPollutionAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WaterPollutionTrackerFutureStub extends io.grpc.stub.AbstractStub<WaterPollutionTrackerFutureStub> {
    private WaterPollutionTrackerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionTrackerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionTrackerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionTrackerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC to retrieve water pollution alerts triggered by the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.distributedca.WaterPollutionAlertsResponse> getWaterPollutionAlerts(
        grpc.distributedca.WaterPollutionAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterPollutionAlertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_POLLUTION_HISTORY = 0;
  private static final int METHODID_GET_WATER_POLLUTION_ALERTS = 1;
  private static final int METHODID_MONITOR_WATER_POLLUTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterPollutionTrackerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterPollutionTrackerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_POLLUTION_HISTORY:
          serviceImpl.getWaterPollutionHistory((grpc.distributedca.WaterPollutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel>) responseObserver);
          break;
        case METHODID_GET_WATER_POLLUTION_ALERTS:
          serviceImpl.getWaterPollutionAlerts((grpc.distributedca.WaterPollutionAlertsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionAlertsResponse>) responseObserver);
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
        case METHODID_MONITOR_WATER_POLLUTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorWaterPollution(
              (io.grpc.stub.StreamObserver<grpc.distributedca.WaterPollutionLevel>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WaterPollutionTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterPollutionTrackerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterPollutionTracker");
    }
  }

  private static final class WaterPollutionTrackerFileDescriptorSupplier
      extends WaterPollutionTrackerBaseDescriptorSupplier {
    WaterPollutionTrackerFileDescriptorSupplier() {}
  }

  private static final class WaterPollutionTrackerMethodDescriptorSupplier
      extends WaterPollutionTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterPollutionTrackerMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterPollutionTrackerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterPollutionTrackerFileDescriptorSupplier())
              .addMethod(getGetWaterPollutionHistoryMethod())
              .addMethod(getGetWaterPollutionAlertsMethod())
              .addMethod(getMonitorWaterPollutionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
