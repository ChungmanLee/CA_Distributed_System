// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollutiontracking.proto

package grpc.distributedca;

/**
 * Protobuf type {@code smartpollutiontracker.PollutionLevel}
 */
public  final class PollutionLevel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartpollutiontracker.PollutionLevel)
    PollutionLevelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollutionLevel.newBuilder() to construct.
  private PollutionLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollutionLevel() {
    value_ = 0F;
    unit_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PollutionLevel(
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
          case 13: {

            value_ = input.readFloat();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            unit_ = s;
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
    return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_PollutionLevel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_PollutionLevel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.distributedca.PollutionLevel.class, grpc.distributedca.PollutionLevel.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private float value_;
  /**
   * <code>float value = 1;</code>
   */
  public float getValue() {
    return value_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private volatile java.lang.Object unit_;
  /**
   * <code>string unit = 2;</code>
   */
  public java.lang.String getUnit() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unit_ = s;
      return s;
    }
  }
  /**
   * <code>string unit = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUnitBytes() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unit_ = b;
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
    if (value_ != 0F) {
      output.writeFloat(1, value_);
    }
    if (!getUnitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, unit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, value_);
    }
    if (!getUnitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, unit_);
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
    if (!(obj instanceof grpc.distributedca.PollutionLevel)) {
      return super.equals(obj);
    }
    grpc.distributedca.PollutionLevel other = (grpc.distributedca.PollutionLevel) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getValue())
        == java.lang.Float.floatToIntBits(
            other.getValue()));
    result = result && getUnit()
        .equals(other.getUnit());
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + getUnit().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.distributedca.PollutionLevel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.distributedca.PollutionLevel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.distributedca.PollutionLevel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.distributedca.PollutionLevel parseFrom(
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
  public static Builder newBuilder(grpc.distributedca.PollutionLevel prototype) {
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
   * Protobuf type {@code smartpollutiontracker.PollutionLevel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartpollutiontracker.PollutionLevel)
      grpc.distributedca.PollutionLevelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_PollutionLevel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_PollutionLevel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.distributedca.PollutionLevel.class, grpc.distributedca.PollutionLevel.Builder.class);
    }

    // Construct using grpc.distributedca.PollutionLevel.newBuilder()
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
      value_ = 0F;

      unit_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.distributedca.SmartPollutionTrackingSystemImpl.internal_static_smartpollutiontracker_PollutionLevel_descriptor;
    }

    @java.lang.Override
    public grpc.distributedca.PollutionLevel getDefaultInstanceForType() {
      return grpc.distributedca.PollutionLevel.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.distributedca.PollutionLevel build() {
      grpc.distributedca.PollutionLevel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.distributedca.PollutionLevel buildPartial() {
      grpc.distributedca.PollutionLevel result = new grpc.distributedca.PollutionLevel(this);
      result.value_ = value_;
      result.unit_ = unit_;
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
      if (other instanceof grpc.distributedca.PollutionLevel) {
        return mergeFrom((grpc.distributedca.PollutionLevel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.distributedca.PollutionLevel other) {
      if (other == grpc.distributedca.PollutionLevel.getDefaultInstance()) return this;
      if (other.getValue() != 0F) {
        setValue(other.getValue());
      }
      if (!other.getUnit().isEmpty()) {
        unit_ = other.unit_;
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
      grpc.distributedca.PollutionLevel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.distributedca.PollutionLevel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float value_ ;
    /**
     * <code>float value = 1;</code>
     */
    public float getValue() {
      return value_;
    }
    /**
     * <code>float value = 1;</code>
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object unit_ = "";
    /**
     * <code>string unit = 2;</code>
     */
    public java.lang.String getUnit() {
      java.lang.Object ref = unit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string unit = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUnitBytes() {
      java.lang.Object ref = unit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string unit = 2;</code>
     */
    public Builder setUnit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string unit = 2;</code>
     */
    public Builder clearUnit() {
      
      unit_ = getDefaultInstance().getUnit();
      onChanged();
      return this;
    }
    /**
     * <code>string unit = 2;</code>
     */
    public Builder setUnitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      unit_ = value;
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


    // @@protoc_insertion_point(builder_scope:smartpollutiontracker.PollutionLevel)
  }

  // @@protoc_insertion_point(class_scope:smartpollutiontracker.PollutionLevel)
  private static final grpc.distributedca.PollutionLevel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.distributedca.PollutionLevel();
  }

  public static grpc.distributedca.PollutionLevel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollutionLevel>
      PARSER = new com.google.protobuf.AbstractParser<PollutionLevel>() {
    @java.lang.Override
    public PollutionLevel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PollutionLevel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PollutionLevel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollutionLevel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.distributedca.PollutionLevel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

