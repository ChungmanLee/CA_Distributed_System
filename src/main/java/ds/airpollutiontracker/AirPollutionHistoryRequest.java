// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airpollutiontracker.proto

package ds.airpollutiontracker;

/**
 * Protobuf type {@code airpollutiontracker.AirPollutionHistoryRequest}
 */
public  final class AirPollutionHistoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:airpollutiontracker.AirPollutionHistoryRequest)
    AirPollutionHistoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AirPollutionHistoryRequest.newBuilder() to construct.
  private AirPollutionHistoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AirPollutionHistoryRequest() {
    startTime_ = 0L;
    endTime_ = 0L;
    location_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AirPollutionHistoryRequest(
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
          case 8: {

            startTime_ = input.readInt64();
            break;
          }
          case 16: {

            endTime_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.airpollutiontracker.AirPollutionTrackerImpl.internal_static_airpollutiontracker_AirPollutionHistoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.airpollutiontracker.AirPollutionTrackerImpl.internal_static_airpollutiontracker_AirPollutionHistoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.airpollutiontracker.AirPollutionHistoryRequest.class, ds.airpollutiontracker.AirPollutionHistoryRequest.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private long startTime_;
  /**
   * <code>int64 start_time = 1;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private long endTime_;
  /**
   * <code>int64 end_time = 2;</code>
   */
  public long getEndTime() {
    return endTime_;
  }

  public static final int LOCATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 3;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (startTime_ != 0L) {
      output.writeInt64(1, startTime_);
    }
    if (endTime_ != 0L) {
      output.writeInt64(2, endTime_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, location_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startTime_);
    }
    if (endTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, endTime_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, location_);
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
    if (!(obj instanceof ds.airpollutiontracker.AirPollutionHistoryRequest)) {
      return super.equals(obj);
    }
    ds.airpollutiontracker.AirPollutionHistoryRequest other = (ds.airpollutiontracker.AirPollutionHistoryRequest) obj;

    boolean result = true;
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && (getEndTime()
        == other.getEndTime());
    result = result && getLocation()
        .equals(other.getLocation());
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
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTime());
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airpollutiontracker.AirPollutionHistoryRequest parseFrom(
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
  public static Builder newBuilder(ds.airpollutiontracker.AirPollutionHistoryRequest prototype) {
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
   * Protobuf type {@code airpollutiontracker.AirPollutionHistoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:airpollutiontracker.AirPollutionHistoryRequest)
      ds.airpollutiontracker.AirPollutionHistoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.airpollutiontracker.AirPollutionTrackerImpl.internal_static_airpollutiontracker_AirPollutionHistoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.airpollutiontracker.AirPollutionTrackerImpl.internal_static_airpollutiontracker_AirPollutionHistoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.airpollutiontracker.AirPollutionHistoryRequest.class, ds.airpollutiontracker.AirPollutionHistoryRequest.Builder.class);
    }

    // Construct using ds.airpollutiontracker.AirPollutionHistoryRequest.newBuilder()
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
      startTime_ = 0L;

      endTime_ = 0L;

      location_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.airpollutiontracker.AirPollutionTrackerImpl.internal_static_airpollutiontracker_AirPollutionHistoryRequest_descriptor;
    }

    @java.lang.Override
    public ds.airpollutiontracker.AirPollutionHistoryRequest getDefaultInstanceForType() {
      return ds.airpollutiontracker.AirPollutionHistoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.airpollutiontracker.AirPollutionHistoryRequest build() {
      ds.airpollutiontracker.AirPollutionHistoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.airpollutiontracker.AirPollutionHistoryRequest buildPartial() {
      ds.airpollutiontracker.AirPollutionHistoryRequest result = new ds.airpollutiontracker.AirPollutionHistoryRequest(this);
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      result.location_ = location_;
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
      if (other instanceof ds.airpollutiontracker.AirPollutionHistoryRequest) {
        return mergeFrom((ds.airpollutiontracker.AirPollutionHistoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.airpollutiontracker.AirPollutionHistoryRequest other) {
      if (other == ds.airpollutiontracker.AirPollutionHistoryRequest.getDefaultInstance()) return this;
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getEndTime() != 0L) {
        setEndTime(other.getEndTime());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
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
      ds.airpollutiontracker.AirPollutionHistoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.airpollutiontracker.AirPollutionHistoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startTime_ ;
    /**
     * <code>int64 start_time = 1;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>int64 start_time = 1;</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_time = 1;</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long endTime_ ;
    /**
     * <code>int64 end_time = 2;</code>
     */
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <code>int64 end_time = 2;</code>
     */
    public Builder setEndTime(long value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 end_time = 2;</code>
     */
    public Builder clearEndTime() {
      
      endTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 3;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 3;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 3;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 3;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:airpollutiontracker.AirPollutionHistoryRequest)
  }

  // @@protoc_insertion_point(class_scope:airpollutiontracker.AirPollutionHistoryRequest)
  private static final ds.airpollutiontracker.AirPollutionHistoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.airpollutiontracker.AirPollutionHistoryRequest();
  }

  public static ds.airpollutiontracker.AirPollutionHistoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AirPollutionHistoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<AirPollutionHistoryRequest>() {
    @java.lang.Override
    public AirPollutionHistoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AirPollutionHistoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AirPollutionHistoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AirPollutionHistoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.airpollutiontracker.AirPollutionHistoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
