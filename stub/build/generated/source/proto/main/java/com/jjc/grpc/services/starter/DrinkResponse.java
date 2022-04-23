// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jjc/grpc/services/bar_service.proto

package com.jjc.grpc.services.starter;

/**
 * Protobuf type {@code barservice.DrinkResponse}
 */
public final class DrinkResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:barservice.DrinkResponse)
    DrinkResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DrinkResponse.newBuilder() to construct.
  private DrinkResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrinkResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DrinkResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DrinkResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.jjc.grpc.services.starter.Container.Builder subBuilder = null;
            if (container_ != null) {
              subBuilder = container_.toBuilder();
            }
            container_ = input.readMessage(com.jjc.grpc.services.starter.Container.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(container_);
              container_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.jjc.grpc.services.starter.Bill.Builder subBuilder = null;
            if (bill_ != null) {
              subBuilder = bill_.toBuilder();
            }
            bill_ = input.readMessage(com.jjc.grpc.services.starter.Bill.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bill_);
              bill_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jjc.grpc.services.starter.BarService.internal_static_barservice_DrinkResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jjc.grpc.services.starter.BarService.internal_static_barservice_DrinkResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jjc.grpc.services.starter.DrinkResponse.class, com.jjc.grpc.services.starter.DrinkResponse.Builder.class);
  }

  public static final int CONTAINER_FIELD_NUMBER = 1;
  private com.jjc.grpc.services.starter.Container container_;
  /**
   * <code>.barservice.Container container = 1;</code>
   * @return Whether the container field is set.
   */
  @java.lang.Override
  public boolean hasContainer() {
    return container_ != null;
  }
  /**
   * <code>.barservice.Container container = 1;</code>
   * @return The container.
   */
  @java.lang.Override
  public com.jjc.grpc.services.starter.Container getContainer() {
    return container_ == null ? com.jjc.grpc.services.starter.Container.getDefaultInstance() : container_;
  }
  /**
   * <code>.barservice.Container container = 1;</code>
   */
  @java.lang.Override
  public com.jjc.grpc.services.starter.ContainerOrBuilder getContainerOrBuilder() {
    return getContainer();
  }

  public static final int BILL_FIELD_NUMBER = 2;
  private com.jjc.grpc.services.starter.Bill bill_;
  /**
   * <code>.barservice.Bill bill = 2;</code>
   * @return Whether the bill field is set.
   */
  @java.lang.Override
  public boolean hasBill() {
    return bill_ != null;
  }
  /**
   * <code>.barservice.Bill bill = 2;</code>
   * @return The bill.
   */
  @java.lang.Override
  public com.jjc.grpc.services.starter.Bill getBill() {
    return bill_ == null ? com.jjc.grpc.services.starter.Bill.getDefaultInstance() : bill_;
  }
  /**
   * <code>.barservice.Bill bill = 2;</code>
   */
  @java.lang.Override
  public com.jjc.grpc.services.starter.BillOrBuilder getBillOrBuilder() {
    return getBill();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (container_ != null) {
      output.writeMessage(1, getContainer());
    }
    if (bill_ != null) {
      output.writeMessage(2, getBill());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (container_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContainer());
    }
    if (bill_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBill());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.jjc.grpc.services.starter.DrinkResponse)) {
      return super.equals(obj);
    }
    com.jjc.grpc.services.starter.DrinkResponse other = (com.jjc.grpc.services.starter.DrinkResponse) obj;

    if (hasContainer() != other.hasContainer()) return false;
    if (hasContainer()) {
      if (!getContainer()
          .equals(other.getContainer())) return false;
    }
    if (hasBill() != other.hasBill()) return false;
    if (hasBill()) {
      if (!getBill()
          .equals(other.getBill())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasContainer()) {
      hash = (37 * hash) + CONTAINER_FIELD_NUMBER;
      hash = (53 * hash) + getContainer().hashCode();
    }
    if (hasBill()) {
      hash = (37 * hash) + BILL_FIELD_NUMBER;
      hash = (53 * hash) + getBill().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jjc.grpc.services.starter.DrinkResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.jjc.grpc.services.starter.DrinkResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code barservice.DrinkResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:barservice.DrinkResponse)
      com.jjc.grpc.services.starter.DrinkResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jjc.grpc.services.starter.BarService.internal_static_barservice_DrinkResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jjc.grpc.services.starter.BarService.internal_static_barservice_DrinkResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jjc.grpc.services.starter.DrinkResponse.class, com.jjc.grpc.services.starter.DrinkResponse.Builder.class);
    }

    // Construct using com.jjc.grpc.services.starter.DrinkResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (containerBuilder_ == null) {
        container_ = null;
      } else {
        container_ = null;
        containerBuilder_ = null;
      }
      if (billBuilder_ == null) {
        bill_ = null;
      } else {
        bill_ = null;
        billBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jjc.grpc.services.starter.BarService.internal_static_barservice_DrinkResponse_descriptor;
    }

    @java.lang.Override
    public com.jjc.grpc.services.starter.DrinkResponse getDefaultInstanceForType() {
      return com.jjc.grpc.services.starter.DrinkResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.jjc.grpc.services.starter.DrinkResponse build() {
      com.jjc.grpc.services.starter.DrinkResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jjc.grpc.services.starter.DrinkResponse buildPartial() {
      com.jjc.grpc.services.starter.DrinkResponse result = new com.jjc.grpc.services.starter.DrinkResponse(this);
      if (containerBuilder_ == null) {
        result.container_ = container_;
      } else {
        result.container_ = containerBuilder_.build();
      }
      if (billBuilder_ == null) {
        result.bill_ = bill_;
      } else {
        result.bill_ = billBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jjc.grpc.services.starter.DrinkResponse) {
        return mergeFrom((com.jjc.grpc.services.starter.DrinkResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jjc.grpc.services.starter.DrinkResponse other) {
      if (other == com.jjc.grpc.services.starter.DrinkResponse.getDefaultInstance()) return this;
      if (other.hasContainer()) {
        mergeContainer(other.getContainer());
      }
      if (other.hasBill()) {
        mergeBill(other.getBill());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.jjc.grpc.services.starter.DrinkResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jjc.grpc.services.starter.DrinkResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.jjc.grpc.services.starter.Container container_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jjc.grpc.services.starter.Container, com.jjc.grpc.services.starter.Container.Builder, com.jjc.grpc.services.starter.ContainerOrBuilder> containerBuilder_;
    /**
     * <code>.barservice.Container container = 1;</code>
     * @return Whether the container field is set.
     */
    public boolean hasContainer() {
      return containerBuilder_ != null || container_ != null;
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     * @return The container.
     */
    public com.jjc.grpc.services.starter.Container getContainer() {
      if (containerBuilder_ == null) {
        return container_ == null ? com.jjc.grpc.services.starter.Container.getDefaultInstance() : container_;
      } else {
        return containerBuilder_.getMessage();
      }
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public Builder setContainer(com.jjc.grpc.services.starter.Container value) {
      if (containerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        container_ = value;
        onChanged();
      } else {
        containerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public Builder setContainer(
        com.jjc.grpc.services.starter.Container.Builder builderForValue) {
      if (containerBuilder_ == null) {
        container_ = builderForValue.build();
        onChanged();
      } else {
        containerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public Builder mergeContainer(com.jjc.grpc.services.starter.Container value) {
      if (containerBuilder_ == null) {
        if (container_ != null) {
          container_ =
            com.jjc.grpc.services.starter.Container.newBuilder(container_).mergeFrom(value).buildPartial();
        } else {
          container_ = value;
        }
        onChanged();
      } else {
        containerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public Builder clearContainer() {
      if (containerBuilder_ == null) {
        container_ = null;
        onChanged();
      } else {
        container_ = null;
        containerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public com.jjc.grpc.services.starter.Container.Builder getContainerBuilder() {
      
      onChanged();
      return getContainerFieldBuilder().getBuilder();
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    public com.jjc.grpc.services.starter.ContainerOrBuilder getContainerOrBuilder() {
      if (containerBuilder_ != null) {
        return containerBuilder_.getMessageOrBuilder();
      } else {
        return container_ == null ?
            com.jjc.grpc.services.starter.Container.getDefaultInstance() : container_;
      }
    }
    /**
     * <code>.barservice.Container container = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jjc.grpc.services.starter.Container, com.jjc.grpc.services.starter.Container.Builder, com.jjc.grpc.services.starter.ContainerOrBuilder> 
        getContainerFieldBuilder() {
      if (containerBuilder_ == null) {
        containerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.jjc.grpc.services.starter.Container, com.jjc.grpc.services.starter.Container.Builder, com.jjc.grpc.services.starter.ContainerOrBuilder>(
                getContainer(),
                getParentForChildren(),
                isClean());
        container_ = null;
      }
      return containerBuilder_;
    }

    private com.jjc.grpc.services.starter.Bill bill_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jjc.grpc.services.starter.Bill, com.jjc.grpc.services.starter.Bill.Builder, com.jjc.grpc.services.starter.BillOrBuilder> billBuilder_;
    /**
     * <code>.barservice.Bill bill = 2;</code>
     * @return Whether the bill field is set.
     */
    public boolean hasBill() {
      return billBuilder_ != null || bill_ != null;
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     * @return The bill.
     */
    public com.jjc.grpc.services.starter.Bill getBill() {
      if (billBuilder_ == null) {
        return bill_ == null ? com.jjc.grpc.services.starter.Bill.getDefaultInstance() : bill_;
      } else {
        return billBuilder_.getMessage();
      }
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public Builder setBill(com.jjc.grpc.services.starter.Bill value) {
      if (billBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bill_ = value;
        onChanged();
      } else {
        billBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public Builder setBill(
        com.jjc.grpc.services.starter.Bill.Builder builderForValue) {
      if (billBuilder_ == null) {
        bill_ = builderForValue.build();
        onChanged();
      } else {
        billBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public Builder mergeBill(com.jjc.grpc.services.starter.Bill value) {
      if (billBuilder_ == null) {
        if (bill_ != null) {
          bill_ =
            com.jjc.grpc.services.starter.Bill.newBuilder(bill_).mergeFrom(value).buildPartial();
        } else {
          bill_ = value;
        }
        onChanged();
      } else {
        billBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public Builder clearBill() {
      if (billBuilder_ == null) {
        bill_ = null;
        onChanged();
      } else {
        bill_ = null;
        billBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public com.jjc.grpc.services.starter.Bill.Builder getBillBuilder() {
      
      onChanged();
      return getBillFieldBuilder().getBuilder();
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    public com.jjc.grpc.services.starter.BillOrBuilder getBillOrBuilder() {
      if (billBuilder_ != null) {
        return billBuilder_.getMessageOrBuilder();
      } else {
        return bill_ == null ?
            com.jjc.grpc.services.starter.Bill.getDefaultInstance() : bill_;
      }
    }
    /**
     * <code>.barservice.Bill bill = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jjc.grpc.services.starter.Bill, com.jjc.grpc.services.starter.Bill.Builder, com.jjc.grpc.services.starter.BillOrBuilder> 
        getBillFieldBuilder() {
      if (billBuilder_ == null) {
        billBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.jjc.grpc.services.starter.Bill, com.jjc.grpc.services.starter.Bill.Builder, com.jjc.grpc.services.starter.BillOrBuilder>(
                getBill(),
                getParentForChildren(),
                isClean());
        bill_ = null;
      }
      return billBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:barservice.DrinkResponse)
  }

  // @@protoc_insertion_point(class_scope:barservice.DrinkResponse)
  private static final com.jjc.grpc.services.starter.DrinkResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jjc.grpc.services.starter.DrinkResponse();
  }

  public static com.jjc.grpc.services.starter.DrinkResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrinkResponse>
      PARSER = new com.google.protobuf.AbstractParser<DrinkResponse>() {
    @java.lang.Override
    public DrinkResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DrinkResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrinkResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrinkResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jjc.grpc.services.starter.DrinkResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

