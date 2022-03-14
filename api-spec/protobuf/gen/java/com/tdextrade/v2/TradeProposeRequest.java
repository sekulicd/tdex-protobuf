// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.TradeProposeRequest}
 */
public final class TradeProposeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.TradeProposeRequest)
    TradeProposeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TradeProposeRequest.newBuilder() to construct.
  private TradeProposeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TradeProposeRequest() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TradeProposeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TradeProposeRequest(
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
            com.tdextrade.v2.Market.Builder subBuilder = null;
            if (market_ != null) {
              subBuilder = market_.toBuilder();
            }
            market_ = input.readMessage(com.tdextrade.v2.Market.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(market_);
              market_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            com.tdextrade.v2.SwapRequest.Builder subBuilder = null;
            if (swapRequest_ != null) {
              subBuilder = swapRequest_.toBuilder();
            }
            swapRequest_ = input.readMessage(com.tdextrade.v2.SwapRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(swapRequest_);
              swapRequest_ = subBuilder.buildPartial();
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
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeProposeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeProposeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdextrade.v2.TradeProposeRequest.class, com.tdextrade.v2.TradeProposeRequest.Builder.class);
  }

  public static final int MARKET_FIELD_NUMBER = 1;
  private com.tdextrade.v2.Market market_;
  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   * @return Whether the market field is set.
   */
  @java.lang.Override
  public boolean hasMarket() {
    return market_ != null;
  }
  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   * @return The market.
   */
  @java.lang.Override
  public com.tdextrade.v2.Market getMarket() {
    return market_ == null ? com.tdextrade.v2.Market.getDefaultInstance() : market_;
  }
  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   */
  @java.lang.Override
  public com.tdextrade.v2.MarketOrBuilder getMarketOrBuilder() {
    return getMarket();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tdextrade.v2.TradeType getType() {
    @SuppressWarnings("deprecation")
    com.tdextrade.v2.TradeType result = com.tdextrade.v2.TradeType.valueOf(type_);
    return result == null ? com.tdextrade.v2.TradeType.UNRECOGNIZED : result;
  }

  public static final int SWAP_REQUEST_FIELD_NUMBER = 3;
  private com.tdextrade.v2.SwapRequest swapRequest_;
  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   * @return Whether the swapRequest field is set.
   */
  @java.lang.Override
  public boolean hasSwapRequest() {
    return swapRequest_ != null;
  }
  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   * @return The swapRequest.
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapRequest getSwapRequest() {
    return swapRequest_ == null ? com.tdextrade.v2.SwapRequest.getDefaultInstance() : swapRequest_;
  }
  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  @java.lang.Override
  public com.tdextrade.v2.SwapRequestOrBuilder getSwapRequestOrBuilder() {
    return getSwapRequest();
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
    if (market_ != null) {
      output.writeMessage(1, getMarket());
    }
    if (type_ != com.tdextrade.v2.TradeType.BUY.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (swapRequest_ != null) {
      output.writeMessage(3, getSwapRequest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (market_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMarket());
    }
    if (type_ != com.tdextrade.v2.TradeType.BUY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (swapRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSwapRequest());
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
    if (!(obj instanceof com.tdextrade.v2.TradeProposeRequest)) {
      return super.equals(obj);
    }
    com.tdextrade.v2.TradeProposeRequest other = (com.tdextrade.v2.TradeProposeRequest) obj;

    if (hasMarket() != other.hasMarket()) return false;
    if (hasMarket()) {
      if (!getMarket()
          .equals(other.getMarket())) return false;
    }
    if (type_ != other.type_) return false;
    if (hasSwapRequest() != other.hasSwapRequest()) return false;
    if (hasSwapRequest()) {
      if (!getSwapRequest()
          .equals(other.getSwapRequest())) return false;
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
    if (hasMarket()) {
      hash = (37 * hash) + MARKET_FIELD_NUMBER;
      hash = (53 * hash) + getMarket().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasSwapRequest()) {
      hash = (37 * hash) + SWAP_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getSwapRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.TradeProposeRequest parseFrom(
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
  public static Builder newBuilder(com.tdextrade.v2.TradeProposeRequest prototype) {
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
   * Protobuf type {@code tdextrade.v2.TradeProposeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.TradeProposeRequest)
      com.tdextrade.v2.TradeProposeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeProposeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeProposeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdextrade.v2.TradeProposeRequest.class, com.tdextrade.v2.TradeProposeRequest.Builder.class);
    }

    // Construct using com.tdextrade.v2.TradeProposeRequest.newBuilder()
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
      if (marketBuilder_ == null) {
        market_ = null;
      } else {
        market_ = null;
        marketBuilder_ = null;
      }
      type_ = 0;

      if (swapRequestBuilder_ == null) {
        swapRequest_ = null;
      } else {
        swapRequest_ = null;
        swapRequestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdextrade.v2.TradeProto.internal_static_tdextrade_v2_TradeProposeRequest_descriptor;
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeProposeRequest getDefaultInstanceForType() {
      return com.tdextrade.v2.TradeProposeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeProposeRequest build() {
      com.tdextrade.v2.TradeProposeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdextrade.v2.TradeProposeRequest buildPartial() {
      com.tdextrade.v2.TradeProposeRequest result = new com.tdextrade.v2.TradeProposeRequest(this);
      if (marketBuilder_ == null) {
        result.market_ = market_;
      } else {
        result.market_ = marketBuilder_.build();
      }
      result.type_ = type_;
      if (swapRequestBuilder_ == null) {
        result.swapRequest_ = swapRequest_;
      } else {
        result.swapRequest_ = swapRequestBuilder_.build();
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
      if (other instanceof com.tdextrade.v2.TradeProposeRequest) {
        return mergeFrom((com.tdextrade.v2.TradeProposeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdextrade.v2.TradeProposeRequest other) {
      if (other == com.tdextrade.v2.TradeProposeRequest.getDefaultInstance()) return this;
      if (other.hasMarket()) {
        mergeMarket(other.getMarket());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasSwapRequest()) {
        mergeSwapRequest(other.getSwapRequest());
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
      com.tdextrade.v2.TradeProposeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdextrade.v2.TradeProposeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.tdextrade.v2.Market market_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.Market, com.tdextrade.v2.Market.Builder, com.tdextrade.v2.MarketOrBuilder> marketBuilder_;
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     * @return Whether the market field is set.
     */
    public boolean hasMarket() {
      return marketBuilder_ != null || market_ != null;
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     * @return The market.
     */
    public com.tdextrade.v2.Market getMarket() {
      if (marketBuilder_ == null) {
        return market_ == null ? com.tdextrade.v2.Market.getDefaultInstance() : market_;
      } else {
        return marketBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(com.tdextrade.v2.Market value) {
      if (marketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        market_ = value;
        onChanged();
      } else {
        marketBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(
        com.tdextrade.v2.Market.Builder builderForValue) {
      if (marketBuilder_ == null) {
        market_ = builderForValue.build();
        onChanged();
      } else {
        marketBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public Builder mergeMarket(com.tdextrade.v2.Market value) {
      if (marketBuilder_ == null) {
        if (market_ != null) {
          market_ =
            com.tdextrade.v2.Market.newBuilder(market_).mergeFrom(value).buildPartial();
        } else {
          market_ = value;
        }
        onChanged();
      } else {
        marketBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public Builder clearMarket() {
      if (marketBuilder_ == null) {
        market_ = null;
        onChanged();
      } else {
        market_ = null;
        marketBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public com.tdextrade.v2.Market.Builder getMarketBuilder() {
      
      onChanged();
      return getMarketFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    public com.tdextrade.v2.MarketOrBuilder getMarketOrBuilder() {
      if (marketBuilder_ != null) {
        return marketBuilder_.getMessageOrBuilder();
      } else {
        return market_ == null ?
            com.tdextrade.v2.Market.getDefaultInstance() : market_;
      }
    }
    /**
     * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.Market, com.tdextrade.v2.Market.Builder, com.tdextrade.v2.MarketOrBuilder> 
        getMarketFieldBuilder() {
      if (marketBuilder_ == null) {
        marketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdextrade.v2.Market, com.tdextrade.v2.Market.Builder, com.tdextrade.v2.MarketOrBuilder>(
                getMarket(),
                getParentForChildren(),
                isClean());
        market_ = null;
      }
      return marketBuilder_;
    }

    private int type_ = 0;
    /**
     * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tdextrade.v2.TradeType getType() {
      @SuppressWarnings("deprecation")
      com.tdextrade.v2.TradeType result = com.tdextrade.v2.TradeType.valueOf(type_);
      return result == null ? com.tdextrade.v2.TradeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tdextrade.v2.TradeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.tdextrade.v2.SwapRequest swapRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapRequest, com.tdextrade.v2.SwapRequest.Builder, com.tdextrade.v2.SwapRequestOrBuilder> swapRequestBuilder_;
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     * @return Whether the swapRequest field is set.
     */
    public boolean hasSwapRequest() {
      return swapRequestBuilder_ != null || swapRequest_ != null;
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     * @return The swapRequest.
     */
    public com.tdextrade.v2.SwapRequest getSwapRequest() {
      if (swapRequestBuilder_ == null) {
        return swapRequest_ == null ? com.tdextrade.v2.SwapRequest.getDefaultInstance() : swapRequest_;
      } else {
        return swapRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder setSwapRequest(com.tdextrade.v2.SwapRequest value) {
      if (swapRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        swapRequest_ = value;
        onChanged();
      } else {
        swapRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder setSwapRequest(
        com.tdextrade.v2.SwapRequest.Builder builderForValue) {
      if (swapRequestBuilder_ == null) {
        swapRequest_ = builderForValue.build();
        onChanged();
      } else {
        swapRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder mergeSwapRequest(com.tdextrade.v2.SwapRequest value) {
      if (swapRequestBuilder_ == null) {
        if (swapRequest_ != null) {
          swapRequest_ =
            com.tdextrade.v2.SwapRequest.newBuilder(swapRequest_).mergeFrom(value).buildPartial();
        } else {
          swapRequest_ = value;
        }
        onChanged();
      } else {
        swapRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder clearSwapRequest() {
      if (swapRequestBuilder_ == null) {
        swapRequest_ = null;
        onChanged();
      } else {
        swapRequest_ = null;
        swapRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public com.tdextrade.v2.SwapRequest.Builder getSwapRequestBuilder() {
      
      onChanged();
      return getSwapRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public com.tdextrade.v2.SwapRequestOrBuilder getSwapRequestOrBuilder() {
      if (swapRequestBuilder_ != null) {
        return swapRequestBuilder_.getMessageOrBuilder();
      } else {
        return swapRequest_ == null ?
            com.tdextrade.v2.SwapRequest.getDefaultInstance() : swapRequest_;
      }
    }
    /**
     * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdextrade.v2.SwapRequest, com.tdextrade.v2.SwapRequest.Builder, com.tdextrade.v2.SwapRequestOrBuilder> 
        getSwapRequestFieldBuilder() {
      if (swapRequestBuilder_ == null) {
        swapRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdextrade.v2.SwapRequest, com.tdextrade.v2.SwapRequest.Builder, com.tdextrade.v2.SwapRequestOrBuilder>(
                getSwapRequest(),
                getParentForChildren(),
                isClean());
        swapRequest_ = null;
      }
      return swapRequestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tdextrade.v2.TradeProposeRequest)
  }

  // @@protoc_insertion_point(class_scope:tdextrade.v2.TradeProposeRequest)
  private static final com.tdextrade.v2.TradeProposeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdextrade.v2.TradeProposeRequest();
  }

  public static com.tdextrade.v2.TradeProposeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TradeProposeRequest>
      PARSER = new com.google.protobuf.AbstractParser<TradeProposeRequest>() {
    @java.lang.Override
    public TradeProposeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TradeProposeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TradeProposeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TradeProposeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdextrade.v2.TradeProposeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
