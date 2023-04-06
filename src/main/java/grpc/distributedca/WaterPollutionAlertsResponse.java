// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollutiontracking.proto

package grpc.distributedca;

/**
 * Protobuf type {@code smartpollutiontracker.WaterPollutionAlertsResponse}
 */
public  final class WaterPollutionAlertsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartpollutiontracker.WaterPollutionAlertsResponse)
    WaterPollutionAlertsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WaterPollutionAlertsResponse.newBuilder() to construct.
  private WaterPollutionAlertsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WaterPollutionAlertsResponse() {
    alerts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WaterPollutionAlertsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              alerts_ = new java.util.ArrayList<grpc.distributedca.WaterPollutionAlert>();
              mutable_bitField0_ |= 0x00000001;
            }
            alerts_.add(
                input.readMessage(grpc.distributedca.WaterPollutionAlert.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        alerts_ = java.util.Collections.unmodifiableList(alerts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.distributedca.WaterPollutionAlertsResponse.class, grpc.distributedca.WaterPollutionAlertsResponse.Builder.class);
  }

  public static final int ALERTS_FIELD_NUMBER = 1;
  private java.util.List<grpc.distributedca.WaterPollutionAlert> alerts_;
  /**
   * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
   */
  public java.util.List<grpc.distributedca.WaterPollutionAlert> getAlertsList() {
    return alerts_;
  }
  /**
   * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
   */
  public java.util.List<? extends grpc.distributedca.WaterPollutionAlertOrBuilder> 
      getAlertsOrBuilderList() {
    return alerts_;
  }
  /**
   * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
   */
  public int getAlertsCount() {
    return alerts_.size();
  }
  /**
   * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
   */
  public grpc.distributedca.WaterPollutionAlert getAlerts(int index) {
    return alerts_.get(index);
  }
  /**
   * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
   */
  public grpc.distributedca.WaterPollutionAlertOrBuilder getAlertsOrBuilder(
      int index) {
    return alerts_.get(index);
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
    for (int i = 0; i < alerts_.size(); i++) {
      output.writeMessage(1, alerts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < alerts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, alerts_.get(i));
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
    if (!(obj instanceof grpc.distributedca.WaterPollutionAlertsResponse)) {
      return super.equals(obj);
    }
    grpc.distributedca.WaterPollutionAlertsResponse other = (grpc.distributedca.WaterPollutionAlertsResponse) obj;

    boolean result = true;
    result = result && getAlertsList()
        .equals(other.getAlertsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAlertsCount() > 0) {
      hash = (37 * hash) + ALERTS_FIELD_NUMBER;
      hash = (53 * hash) + getAlertsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.distributedca.WaterPollutionAlertsResponse parseFrom(
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
  public static Builder newBuilder(grpc.distributedca.WaterPollutionAlertsResponse prototype) {
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
   * Protobuf type {@code smartpollutiontracker.WaterPollutionAlertsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartpollutiontracker.WaterPollutionAlertsResponse)
      grpc.distributedca.WaterPollutionAlertsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.distributedca.WaterPollutionAlertsResponse.class, grpc.distributedca.WaterPollutionAlertsResponse.Builder.class);
    }

    // Construct using grpc.distributedca.WaterPollutionAlertsResponse.newBuilder()
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
        getAlertsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (alertsBuilder_ == null) {
        alerts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        alertsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor;
    }

    @java.lang.Override
    public grpc.distributedca.WaterPollutionAlertsResponse getDefaultInstanceForType() {
      return grpc.distributedca.WaterPollutionAlertsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.distributedca.WaterPollutionAlertsResponse build() {
      grpc.distributedca.WaterPollutionAlertsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.distributedca.WaterPollutionAlertsResponse buildPartial() {
      grpc.distributedca.WaterPollutionAlertsResponse result = new grpc.distributedca.WaterPollutionAlertsResponse(this);
      int from_bitField0_ = bitField0_;
      if (alertsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          alerts_ = java.util.Collections.unmodifiableList(alerts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alerts_ = alerts_;
      } else {
        result.alerts_ = alertsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.distributedca.WaterPollutionAlertsResponse) {
        return mergeFrom((grpc.distributedca.WaterPollutionAlertsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.distributedca.WaterPollutionAlertsResponse other) {
      if (other == grpc.distributedca.WaterPollutionAlertsResponse.getDefaultInstance()) return this;
      if (alertsBuilder_ == null) {
        if (!other.alerts_.isEmpty()) {
          if (alerts_.isEmpty()) {
            alerts_ = other.alerts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlertsIsMutable();
            alerts_.addAll(other.alerts_);
          }
          onChanged();
        }
      } else {
        if (!other.alerts_.isEmpty()) {
          if (alertsBuilder_.isEmpty()) {
            alertsBuilder_.dispose();
            alertsBuilder_ = null;
            alerts_ = other.alerts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            alertsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlertsFieldBuilder() : null;
          } else {
            alertsBuilder_.addAllMessages(other.alerts_);
          }
        }
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
      grpc.distributedca.WaterPollutionAlertsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.distributedca.WaterPollutionAlertsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.distributedca.WaterPollutionAlert> alerts_ =
      java.util.Collections.emptyList();
    private void ensureAlertsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        alerts_ = new java.util.ArrayList<grpc.distributedca.WaterPollutionAlert>(alerts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.distributedca.WaterPollutionAlert, grpc.distributedca.WaterPollutionAlert.Builder, grpc.distributedca.WaterPollutionAlertOrBuilder> alertsBuilder_;

    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public java.util.List<grpc.distributedca.WaterPollutionAlert> getAlertsList() {
      if (alertsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alerts_);
      } else {
        return alertsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public int getAlertsCount() {
      if (alertsBuilder_ == null) {
        return alerts_.size();
      } else {
        return alertsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public grpc.distributedca.WaterPollutionAlert getAlerts(int index) {
      if (alertsBuilder_ == null) {
        return alerts_.get(index);
      } else {
        return alertsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder setAlerts(
        int index, grpc.distributedca.WaterPollutionAlert value) {
      if (alertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlertsIsMutable();
        alerts_.set(index, value);
        onChanged();
      } else {
        alertsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder setAlerts(
        int index, grpc.distributedca.WaterPollutionAlert.Builder builderForValue) {
      if (alertsBuilder_ == null) {
        ensureAlertsIsMutable();
        alerts_.set(index, builderForValue.build());
        onChanged();
      } else {
        alertsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder addAlerts(grpc.distributedca.WaterPollutionAlert value) {
      if (alertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlertsIsMutable();
        alerts_.add(value);
        onChanged();
      } else {
        alertsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder addAlerts(
        int index, grpc.distributedca.WaterPollutionAlert value) {
      if (alertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlertsIsMutable();
        alerts_.add(index, value);
        onChanged();
      } else {
        alertsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder addAlerts(
        grpc.distributedca.WaterPollutionAlert.Builder builderForValue) {
      if (alertsBuilder_ == null) {
        ensureAlertsIsMutable();
        alerts_.add(builderForValue.build());
        onChanged();
      } else {
        alertsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder addAlerts(
        int index, grpc.distributedca.WaterPollutionAlert.Builder builderForValue) {
      if (alertsBuilder_ == null) {
        ensureAlertsIsMutable();
        alerts_.add(index, builderForValue.build());
        onChanged();
      } else {
        alertsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder addAllAlerts(
        java.lang.Iterable<? extends grpc.distributedca.WaterPollutionAlert> values) {
      if (alertsBuilder_ == null) {
        ensureAlertsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alerts_);
        onChanged();
      } else {
        alertsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder clearAlerts() {
      if (alertsBuilder_ == null) {
        alerts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        alertsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public Builder removeAlerts(int index) {
      if (alertsBuilder_ == null) {
        ensureAlertsIsMutable();
        alerts_.remove(index);
        onChanged();
      } else {
        alertsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public grpc.distributedca.WaterPollutionAlert.Builder getAlertsBuilder(
        int index) {
      return getAlertsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public grpc.distributedca.WaterPollutionAlertOrBuilder getAlertsOrBuilder(
        int index) {
      if (alertsBuilder_ == null) {
        return alerts_.get(index);  } else {
        return alertsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public java.util.List<? extends grpc.distributedca.WaterPollutionAlertOrBuilder> 
         getAlertsOrBuilderList() {
      if (alertsBuilder_ != null) {
        return alertsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alerts_);
      }
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public grpc.distributedca.WaterPollutionAlert.Builder addAlertsBuilder() {
      return getAlertsFieldBuilder().addBuilder(
          grpc.distributedca.WaterPollutionAlert.getDefaultInstance());
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public grpc.distributedca.WaterPollutionAlert.Builder addAlertsBuilder(
        int index) {
      return getAlertsFieldBuilder().addBuilder(
          index, grpc.distributedca.WaterPollutionAlert.getDefaultInstance());
    }
    /**
     * <code>repeated .smartpollutiontracker.WaterPollutionAlert alerts = 1;</code>
     */
    public java.util.List<grpc.distributedca.WaterPollutionAlert.Builder> 
         getAlertsBuilderList() {
      return getAlertsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.distributedca.WaterPollutionAlert, grpc.distributedca.WaterPollutionAlert.Builder, grpc.distributedca.WaterPollutionAlertOrBuilder> 
        getAlertsFieldBuilder() {
      if (alertsBuilder_ == null) {
        alertsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.distributedca.WaterPollutionAlert, grpc.distributedca.WaterPollutionAlert.Builder, grpc.distributedca.WaterPollutionAlertOrBuilder>(
                alerts_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        alerts_ = null;
      }
      return alertsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smartpollutiontracker.WaterPollutionAlertsResponse)
  }

  // @@protoc_insertion_point(class_scope:smartpollutiontracker.WaterPollutionAlertsResponse)
  private static final grpc.distributedca.WaterPollutionAlertsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.distributedca.WaterPollutionAlertsResponse();
  }

  public static grpc.distributedca.WaterPollutionAlertsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WaterPollutionAlertsResponse>
      PARSER = new com.google.protobuf.AbstractParser<WaterPollutionAlertsResponse>() {
    @java.lang.Override
    public WaterPollutionAlertsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WaterPollutionAlertsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WaterPollutionAlertsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WaterPollutionAlertsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.distributedca.WaterPollutionAlertsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

