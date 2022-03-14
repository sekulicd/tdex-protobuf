// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.TradeCompleteReply}
 */
public final class TradeCompleteReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.TradeCompleteReply)
    TradeCompleteReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TradeCompleteReply.newBuilder() to construct.
  private TradeCompleteReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TradeCompleteReply() {
    txid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TradeCompleteReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TradeCompleteReply(
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
            java.lang.String s = input.readStringRequireUtf8();

            txid_ = s;
            break;
          }
          case 18: {
            com.tdextrade.v2.SwapFail.Builder subBuilder = null;
            if (swapFail_ != null) {
              subBuilder = swapFail_.toBuilder();
            }
            swapFail_ = input.readMessage(com.tdextrade.v2.SwapFail.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(swapFail_);
              swapFail_ = subBuilder.buildPartial();
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
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeCompleteReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeCompleteReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdextrade.v2.TradeCompleteReply.class, com.tdextrade.v2.TradeCompleteReply.Builder.class);
  }

  public static final int TXID_FIELD_NUMBER = 1;
  private volatile java.lang.Object txid_;
  /**
   * <code>string txid = 1 [json_name = "txid"];</code>
   * @return The txid.
   */
  @java.lang.Override
  public java.lang.String getTxid() {
    java.lang.Object ref = txid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txid_ = s;
      return s;
    }
  }
  /**
   * <code>string txid = 1 [json_name = "txid"];</code>
   * @return The bytes for txid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxidBytes() {
    java.lang.Object ref = txid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SWAP_FAIL_FIELD_NUMBER = 2;
  private com.tdextrade.v2.SwapFail swapFail_;
  /**
   * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   * @return Whether the swapFail field is set.
   */
  @java.lang.Override
  public boolean hasSwapFail() {
    return swapFail_ != null;
  }
  /**
   * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   * @return The swapFail.
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapFail getSwapFail() {
    return swapFail_ == null ? com.tdextrade.v2.SwapFail.getDefaultInstance() : swapFail_;
  }
  /**
   * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapFailOrBuilder getSwapFailOrBuilder() {
    return getSwapFail();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, txid_);
    }
    if (swapFail_ != null) {
      output.writeMessage(2, getSwapFail());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, txid_);
    }
    if (swapFail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSwapFail());
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
    if (!(obj instanceof com.tdextrade.v2.TradeCompleteReply)) {
      return super.equals(obj);
    }
    com.tdextrade.v2.TradeCompleteReply other = (com.tdextrade.v2.TradeCompleteReply) obj;

    if (!getTxid()
        .equals(other.getTxid())) return false;
    if (hasSwapFail() != other.hasSwapFail()) return false;
    if (hasSwapFail()) {
      if (!getSwapFail()
          .equals(other.getSwapFail())) return false;
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
    hash = (37 * hash) + TXID_FIELD_NUMBER;
    hash = (53 * hash) + getTxid().hashCode();
    if (hasSwapFail()) {
      hash = (37 * hash) + SWAP_FAIL_FIELD_NUMBER;
      hash = (53 * hash) + getSwapFail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeCompleteReply parseFrom(
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
  public static Builder newBuilder(com.tdextrade.v2.TradeCompleteReply prototype) {
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
   * Protobuf type {@code tdextrade.v2.TradeCompleteReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.TradeCompleteReply)
      com.tdextrade.v2.TradeCompleteReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeCompleteReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeCompleteReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdextrade.v2.TradeCompleteReply.class, com.tdextrade.v2.TradeCompleteReply.Builder.class);
    }

    // Construct using com.tdextrade.v2.TradeCompleteReply.newBuilder()
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
      txid_ = "";

      if (swapFailBuilder_ == null) {
        swapFail_ = null;
      } else {
        swapFail_ = null;
        swapFailBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeCompleteReply_descriptor;
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeCompleteReply getDefaultInstanceForType() {
      return com.tdextrade.v2.TradeCompleteReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeCompleteReply build() {
      com.tdextrade.v2.TradeCompleteReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeCompleteReply buildPartial() {
      com.tdextrade.v2.TradeCompleteReply result = new com.tdextrade.v2.TradeCompleteReply(this);
      result.txid_ = txid_;
      if (swapFailBuilder_ == null) {
        result.swapFail_ = swapFail_;
      } else {
        result.swapFail_ = swapFailBuilder_.build();
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
      if (other instanceof com.tdextrade.v2.TradeCompleteReply) {
        return mergeFrom((com.tdextrade.v2.TradeCompleteReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdextrade.v2.TradeCompleteReply other) {
      if (other == com.tdextrade.v2.TradeCompleteReply.getDefaultInstance()) return this;
      if (!other.getTxid().isEmpty()) {
        txid_ = other.txid_;
        onChanged();
      }
      if (other.hasSwapFail()) {
        mergeSwapFail(other.getSwapFail());
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
      com.tdextrade.v2.TradeCompleteReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdextrade.v2.TradeCompleteReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object txid_ = "";
    /**
     * <code>string txid = 1 [json_name = "txid"];</code>
     * @return The txid.
     */
    public java.lang.String getTxid() {
      java.lang.Object ref = txid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string txid = 1 [json_name = "txid"];</code>
     * @return The bytes for txid.
     */
    public com.google.protobuf.ByteString
        getTxidBytes() {
      java.lang.Object ref = txid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string txid = 1 [json_name = "txid"];</code>
     * @param value The txid to set.
     * @return This builder for chaining.
     */
    public Builder setTxid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      txid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string txid = 1 [json_name = "txid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxid() {
      
      txid_ = getDefaultInstance().getTxid();
      onChanged();
      return this;
    }
    /**
     * <code>string txid = 1 [json_name = "txid"];</code>
     * @param value The bytes for txid to set.
     * @return This builder for chaining.
     */
    public Builder setTxidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      txid_ = value;
      onChanged();
      return this;
    }

    private com.tdextrade.v2.SwapFail swapFail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapFail, com.tdextrade.v2.SwapFail.Builder, com.tdextrade.v2.SwapFailOrBuilder> swapFailBuilder_;
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     * @return Whether the swapFail field is set.
     */
    public boolean hasSwapFail() {
      return swapFailBuilder_ != null || swapFail_ != null;
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     * @return The swapFail.
     */
    public com.tdextrade.v2.SwapFail getSwapFail() {
      if (swapFailBuilder_ == null) {
        return swapFail_ == null ? com.tdextrade.v2.SwapFail.getDefaultInstance() : swapFail_;
      } else {
        return swapFailBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder setSwapFail(com.tdextrade.v2.SwapFail value) {
      if (swapFailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        swapFail_ = value;
        onChanged();
      } else {
        swapFailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder setSwapFail(
        com.tdextrade.v2.SwapFail.Builder builderForValue) {
      if (swapFailBuilder_ == null) {
        swapFail_ = builderForValue.build();
        onChanged();
      } else {
        swapFailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder mergeSwapFail(com.tdextrade.v2.SwapFail value) {
      if (swapFailBuilder_ == null) {
        if (swapFail_ != null) {
          swapFail_ =
            com.tdextrade.v2.SwapFail.newBuilder(swapFail_).mergeFrom(value).buildPartial();
        } else {
          swapFail_ = value;
        }
        onChanged();
      } else {
        swapFailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder clearSwapFail() {
      if (swapFailBuilder_ == null) {
        swapFail_ = null;
        onChanged();
      } else {
        swapFail_ = null;
        swapFailBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public com.tdextrade.v2.SwapFail.Builder getSwapFailBuilder() {
      
      onChanged();
      return getSwapFailFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public com.tdextrade.v2.SwapFailOrBuilder getSwapFailOrBuilder() {
      if (swapFailBuilder_ != null) {
        return swapFailBuilder_.getMessageOrBuilder();
      } else {
        return swapFail_ == null ?
            com.tdextrade.v2.SwapFail.getDefaultInstance() : swapFail_;
      }
    }
    /**
     * <code>.tdextrade.v2.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapFail, com.tdextrade.v2.SwapFail.Builder, com.tdextrade.v2.SwapFailOrBuilder> 
        getSwapFailFieldBuilder() {
      if (swapFailBuilder_ == null) {
        swapFailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdextrade.v2.SwapFail, com.tdextrade.v2.SwapFail.Builder, com.tdextrade.v2.SwapFailOrBuilder>(
                getSwapFail(),
                getParentForChildren(),
                isClean());
        swapFail_ = null;
      }
      return swapFailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tdextrade.v2.TradeCompleteReply)
  }

  // @@protoc_insertion_point(class_scope:tdextrade.v2.TradeCompleteReply)
  private static final com.tdextrade.v2.TradeCompleteReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdextrade.v2.TradeCompleteReply();
  }

  public static com.tdextrade.v2.TradeCompleteReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TradeCompleteReply>
      PARSER = new com.google.protobuf.AbstractParser<TradeCompleteReply>() {
    @java.lang.Override
    public TradeCompleteReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TradeCompleteReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TradeCompleteReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TradeCompleteReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdextrade.v2.TradeCompleteReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

