// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.CompleteTradeRequest}
 */
public final class CompleteTradeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.CompleteTradeRequest)
    CompleteTradeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteTradeRequest.newBuilder() to construct.
  private CompleteTradeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteTradeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteTradeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteTradeRequest(
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
            com.tdextrade.v2.SwapComplete.Builder subBuilder = null;
            if (swapComplete_ != null) {
              subBuilder = swapComplete_.toBuilder();
            }
            swapComplete_ = input.readMessage(com.tdextrade.v2.SwapComplete.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(swapComplete_);
              swapComplete_ = subBuilder.buildPartial();
            }

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
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_CompleteTradeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_CompleteTradeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdextrade.v2.CompleteTradeRequest.class, com.tdextrade.v2.CompleteTradeRequest.Builder.class);
  }

  public static final int SWAP_COMPLETE_FIELD_NUMBER = 1;
  private com.tdextrade.v2.SwapComplete swapComplete_;
  /**
   * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
   * @return Whether the swapComplete field is set.
   */
  @java.lang.Override
  public boolean hasSwapComplete() {
    return swapComplete_ != null;
  }
  /**
   * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
   * @return The swapComplete.
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapComplete getSwapComplete() {
    return swapComplete_ == null ? com.tdextrade.v2.SwapComplete.getDefaultInstance() : swapComplete_;
  }
  /**
   * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapCompleteOrBuilder getSwapCompleteOrBuilder() {
    return getSwapComplete();
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
    if (swapComplete_ != null) {
      output.writeMessage(1, getSwapComplete());
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
    if (swapComplete_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSwapComplete());
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
    if (!(obj instanceof com.tdextrade.v2.CompleteTradeRequest)) {
      return super.equals(obj);
    }
    com.tdextrade.v2.CompleteTradeRequest other = (com.tdextrade.v2.CompleteTradeRequest) obj;

    if (hasSwapComplete() != other.hasSwapComplete()) return false;
    if (hasSwapComplete()) {
      if (!getSwapComplete()
          .equals(other.getSwapComplete())) return false;
    }
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
    if (hasSwapComplete()) {
      hash = (37 * hash) + SWAP_COMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + getSwapComplete().hashCode();
    }
    if (hasSwapFail()) {
      hash = (37 * hash) + SWAP_FAIL_FIELD_NUMBER;
      hash = (53 * hash) + getSwapFail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.CompleteTradeRequest parseFrom(
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
  public static Builder newBuilder(com.tdextrade.v2.CompleteTradeRequest prototype) {
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
   * Protobuf type {@code tdextrade.v2.CompleteTradeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.CompleteTradeRequest)
      com.tdextrade.v2.CompleteTradeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_CompleteTradeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_CompleteTradeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdextrade.v2.CompleteTradeRequest.class, com.tdextrade.v2.CompleteTradeRequest.Builder.class);
    }

    // Construct using com.tdextrade.v2.CompleteTradeRequest.newBuilder()
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
      if (swapCompleteBuilder_ == null) {
        swapComplete_ = null;
      } else {
        swapComplete_ = null;
        swapCompleteBuilder_ = null;
      }
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
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_CompleteTradeRequest_descriptor;
    }

    @java.lang.Override
    public com.tdextrade.v2.CompleteTradeRequest getDefaultInstanceForType() {
      return com.tdextrade.v2.CompleteTradeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdextrade.v2.CompleteTradeRequest build() {
      com.tdextrade.v2.CompleteTradeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdextrade.v2.CompleteTradeRequest buildPartial() {
      com.tdextrade.v2.CompleteTradeRequest result = new com.tdextrade.v2.CompleteTradeRequest(this);
      if (swapCompleteBuilder_ == null) {
        result.swapComplete_ = swapComplete_;
      } else {
        result.swapComplete_ = swapCompleteBuilder_.build();
      }
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
      if (other instanceof com.tdextrade.v2.CompleteTradeRequest) {
        return mergeFrom((com.tdextrade.v2.CompleteTradeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdextrade.v2.CompleteTradeRequest other) {
      if (other == com.tdextrade.v2.CompleteTradeRequest.getDefaultInstance()) return this;
      if (other.hasSwapComplete()) {
        mergeSwapComplete(other.getSwapComplete());
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
      com.tdextrade.v2.CompleteTradeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdextrade.v2.CompleteTradeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.tdextrade.v2.SwapComplete swapComplete_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapComplete, com.tdextrade.v2.SwapComplete.Builder, com.tdextrade.v2.SwapCompleteOrBuilder> swapCompleteBuilder_;
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     * @return Whether the swapComplete field is set.
     */
    public boolean hasSwapComplete() {
      return swapCompleteBuilder_ != null || swapComplete_ != null;
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     * @return The swapComplete.
     */
    public com.tdextrade.v2.SwapComplete getSwapComplete() {
      if (swapCompleteBuilder_ == null) {
        return swapComplete_ == null ? com.tdextrade.v2.SwapComplete.getDefaultInstance() : swapComplete_;
      } else {
        return swapCompleteBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public Builder setSwapComplete(com.tdextrade.v2.SwapComplete value) {
      if (swapCompleteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        swapComplete_ = value;
        onChanged();
      } else {
        swapCompleteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public Builder setSwapComplete(
        com.tdextrade.v2.SwapComplete.Builder builderForValue) {
      if (swapCompleteBuilder_ == null) {
        swapComplete_ = builderForValue.build();
        onChanged();
      } else {
        swapCompleteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public Builder mergeSwapComplete(com.tdextrade.v2.SwapComplete value) {
      if (swapCompleteBuilder_ == null) {
        if (swapComplete_ != null) {
          swapComplete_ =
            com.tdextrade.v2.SwapComplete.newBuilder(swapComplete_).mergeFrom(value).buildPartial();
        } else {
          swapComplete_ = value;
        }
        onChanged();
      } else {
        swapCompleteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public Builder clearSwapComplete() {
      if (swapCompleteBuilder_ == null) {
        swapComplete_ = null;
        onChanged();
      } else {
        swapComplete_ = null;
        swapCompleteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public com.tdextrade.v2.SwapComplete.Builder getSwapCompleteBuilder() {
      
      onChanged();
      return getSwapCompleteFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    public com.tdextrade.v2.SwapCompleteOrBuilder getSwapCompleteOrBuilder() {
      if (swapCompleteBuilder_ != null) {
        return swapCompleteBuilder_.getMessageOrBuilder();
      } else {
        return swapComplete_ == null ?
            com.tdextrade.v2.SwapComplete.getDefaultInstance() : swapComplete_;
      }
    }
    /**
     * <code>.tdextrade.v2.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapComplete, com.tdextrade.v2.SwapComplete.Builder, com.tdextrade.v2.SwapCompleteOrBuilder> 
        getSwapCompleteFieldBuilder() {
      if (swapCompleteBuilder_ == null) {
        swapCompleteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdextrade.v2.SwapComplete, com.tdextrade.v2.SwapComplete.Builder, com.tdextrade.v2.SwapCompleteOrBuilder>(
                getSwapComplete(),
                getParentForChildren(),
                isClean());
        swapComplete_ = null;
      }
      return swapCompleteBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tdextrade.v2.CompleteTradeRequest)
  }

  // @@protoc_insertion_point(class_scope:tdextrade.v2.CompleteTradeRequest)
  private static final com.tdextrade.v2.CompleteTradeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdextrade.v2.CompleteTradeRequest();
  }

  public static com.tdextrade.v2.CompleteTradeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteTradeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompleteTradeRequest>() {
    @java.lang.Override
    public CompleteTradeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteTradeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteTradeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteTradeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdextrade.v2.CompleteTradeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

