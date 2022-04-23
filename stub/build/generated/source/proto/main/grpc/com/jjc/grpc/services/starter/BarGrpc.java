package com.jjc.grpc.services.starter;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The simple service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: com/jjc/grpc/services/bar_service.proto")
public final class BarGrpc {

  private BarGrpc() {}

  public static final String SERVICE_NAME = "barservice.Bar";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinkRequest,
      com.jjc.grpc.services.starter.DrinkResponse> getOrderDrinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderDrink",
      requestType = com.jjc.grpc.services.starter.DrinkRequest.class,
      responseType = com.jjc.grpc.services.starter.DrinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinkRequest,
      com.jjc.grpc.services.starter.DrinkResponse> getOrderDrinkMethod() {
    io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinkRequest, com.jjc.grpc.services.starter.DrinkResponse> getOrderDrinkMethod;
    if ((getOrderDrinkMethod = BarGrpc.getOrderDrinkMethod) == null) {
      synchronized (BarGrpc.class) {
        if ((getOrderDrinkMethod = BarGrpc.getOrderDrinkMethod) == null) {
          BarGrpc.getOrderDrinkMethod = getOrderDrinkMethod =
              io.grpc.MethodDescriptor.<com.jjc.grpc.services.starter.DrinkRequest, com.jjc.grpc.services.starter.DrinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderDrink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.DrinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.DrinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarMethodDescriptorSupplier("orderDrink"))
              .build();
        }
      }
    }
    return getOrderDrinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinksRequest,
      com.jjc.grpc.services.starter.DrinksResponse> getOrderMultipleDrinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderMultipleDrinks",
      requestType = com.jjc.grpc.services.starter.DrinksRequest.class,
      responseType = com.jjc.grpc.services.starter.DrinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinksRequest,
      com.jjc.grpc.services.starter.DrinksResponse> getOrderMultipleDrinksMethod() {
    io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.DrinksRequest, com.jjc.grpc.services.starter.DrinksResponse> getOrderMultipleDrinksMethod;
    if ((getOrderMultipleDrinksMethod = BarGrpc.getOrderMultipleDrinksMethod) == null) {
      synchronized (BarGrpc.class) {
        if ((getOrderMultipleDrinksMethod = BarGrpc.getOrderMultipleDrinksMethod) == null) {
          BarGrpc.getOrderMultipleDrinksMethod = getOrderMultipleDrinksMethod =
              io.grpc.MethodDescriptor.<com.jjc.grpc.services.starter.DrinksRequest, com.jjc.grpc.services.starter.DrinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderMultipleDrinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.DrinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.DrinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarMethodDescriptorSupplier("orderMultipleDrinks"))
              .build();
        }
      }
    }
    return getOrderMultipleDrinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.PaymentRequest,
      com.jjc.grpc.services.starter.PaymentResponse> getPayBillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payBill",
      requestType = com.jjc.grpc.services.starter.PaymentRequest.class,
      responseType = com.jjc.grpc.services.starter.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.PaymentRequest,
      com.jjc.grpc.services.starter.PaymentResponse> getPayBillMethod() {
    io.grpc.MethodDescriptor<com.jjc.grpc.services.starter.PaymentRequest, com.jjc.grpc.services.starter.PaymentResponse> getPayBillMethod;
    if ((getPayBillMethod = BarGrpc.getPayBillMethod) == null) {
      synchronized (BarGrpc.class) {
        if ((getPayBillMethod = BarGrpc.getPayBillMethod) == null) {
          BarGrpc.getPayBillMethod = getPayBillMethod =
              io.grpc.MethodDescriptor.<com.jjc.grpc.services.starter.PaymentRequest, com.jjc.grpc.services.starter.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "payBill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjc.grpc.services.starter.PaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BarMethodDescriptorSupplier("payBill"))
              .build();
        }
      }
    }
    return getPayBillMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BarStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarStub>() {
        @java.lang.Override
        public BarStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarStub(channel, callOptions);
        }
      };
    return BarStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarBlockingStub>() {
        @java.lang.Override
        public BarBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarBlockingStub(channel, callOptions);
        }
      };
    return BarBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BarFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BarFutureStub>() {
        @java.lang.Override
        public BarFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BarFutureStub(channel, callOptions);
        }
      };
    return BarFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The simple service definition.
   * </pre>
   */
  public static abstract class BarImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Orders a requested drink from the bar counter
     * </pre>
     */
    public void orderDrink(com.jjc.grpc.services.starter.DrinkRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderDrinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Orders multiple requested drinks from the bar counter
     * </pre>
     */
    public void orderMultipleDrinks(com.jjc.grpc.services.starter.DrinksRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMultipleDrinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pay a certain bill with a specific amount
     * </pre>
     */
    public void payBill(com.jjc.grpc.services.starter.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.PaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPayBillMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderDrinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.jjc.grpc.services.starter.DrinkRequest,
                com.jjc.grpc.services.starter.DrinkResponse>(
                  this, METHODID_ORDER_DRINK)))
          .addMethod(
            getOrderMultipleDrinksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.jjc.grpc.services.starter.DrinksRequest,
                com.jjc.grpc.services.starter.DrinksResponse>(
                  this, METHODID_ORDER_MULTIPLE_DRINKS)))
          .addMethod(
            getPayBillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.jjc.grpc.services.starter.PaymentRequest,
                com.jjc.grpc.services.starter.PaymentResponse>(
                  this, METHODID_PAY_BILL)))
          .build();
    }
  }

  /**
   * <pre>
   * The simple service definition.
   * </pre>
   */
  public static final class BarStub extends io.grpc.stub.AbstractAsyncStub<BarStub> {
    private BarStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarStub(channel, callOptions);
    }

    /**
     * <pre>
     * Orders a requested drink from the bar counter
     * </pre>
     */
    public void orderDrink(com.jjc.grpc.services.starter.DrinkRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderDrinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Orders multiple requested drinks from the bar counter
     * </pre>
     */
    public void orderMultipleDrinks(com.jjc.grpc.services.starter.DrinksRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMultipleDrinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pay a certain bill with a specific amount
     * </pre>
     */
    public void payBill(com.jjc.grpc.services.starter.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.PaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPayBillMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The simple service definition.
   * </pre>
   */
  public static final class BarBlockingStub extends io.grpc.stub.AbstractBlockingStub<BarBlockingStub> {
    private BarBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Orders a requested drink from the bar counter
     * </pre>
     */
    public com.jjc.grpc.services.starter.DrinkResponse orderDrink(com.jjc.grpc.services.starter.DrinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderDrinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Orders multiple requested drinks from the bar counter
     * </pre>
     */
    public com.jjc.grpc.services.starter.DrinksResponse orderMultipleDrinks(com.jjc.grpc.services.starter.DrinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMultipleDrinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pay a certain bill with a specific amount
     * </pre>
     */
    public com.jjc.grpc.services.starter.PaymentResponse payBill(com.jjc.grpc.services.starter.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPayBillMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The simple service definition.
   * </pre>
   */
  public static final class BarFutureStub extends io.grpc.stub.AbstractFutureStub<BarFutureStub> {
    private BarFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BarFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Orders a requested drink from the bar counter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjc.grpc.services.starter.DrinkResponse> orderDrink(
        com.jjc.grpc.services.starter.DrinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderDrinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Orders multiple requested drinks from the bar counter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjc.grpc.services.starter.DrinksResponse> orderMultipleDrinks(
        com.jjc.grpc.services.starter.DrinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMultipleDrinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pay a certain bill with a specific amount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjc.grpc.services.starter.PaymentResponse> payBill(
        com.jjc.grpc.services.starter.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPayBillMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER_DRINK = 0;
  private static final int METHODID_ORDER_MULTIPLE_DRINKS = 1;
  private static final int METHODID_PAY_BILL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER_DRINK:
          serviceImpl.orderDrink((com.jjc.grpc.services.starter.DrinkRequest) request,
              (io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinkResponse>) responseObserver);
          break;
        case METHODID_ORDER_MULTIPLE_DRINKS:
          serviceImpl.orderMultipleDrinks((com.jjc.grpc.services.starter.DrinksRequest) request,
              (io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.DrinksResponse>) responseObserver);
          break;
        case METHODID_PAY_BILL:
          serviceImpl.payBill((com.jjc.grpc.services.starter.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.jjc.grpc.services.starter.PaymentResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjc.grpc.services.starter.BarService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bar");
    }
  }

  private static final class BarFileDescriptorSupplier
      extends BarBaseDescriptorSupplier {
    BarFileDescriptorSupplier() {}
  }

  private static final class BarMethodDescriptorSupplier
      extends BarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BarMethodDescriptorSupplier(String methodName) {
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
      synchronized (BarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BarFileDescriptorSupplier())
              .addMethod(getOrderDrinkMethod())
              .addMethod(getOrderMultipleDrinksMethod())
              .addMethod(getPayBillMethod())
              .build();
        }
      }
    }
    return result;
  }
}
