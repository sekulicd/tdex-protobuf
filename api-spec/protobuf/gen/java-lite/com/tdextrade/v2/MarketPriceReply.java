// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.MarketPriceReply}
 */
public  final class MarketPriceReply extends
    com.google.protobuf.GeneratedMessageLite<
        MarketPriceReply, MarketPriceReply.Builder> implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.MarketPriceReply)
    MarketPriceReplyOrBuilder {
  private MarketPriceReply() {
    prices_ = emptyProtobufList();
  }
  public static final int PRICES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.tdextrade.v2.PriceWithFee> prices_;
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tdextrade.v2.PriceWithFee> getPricesList() {
    return prices_;
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  public java.util.List<? extends com.tdextrade.v2.PriceWithFeeOrBuilder> 
      getPricesOrBuilderList() {
    return prices_;
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public int getPricesCount() {
    return prices_.size();
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public com.tdextrade.v2.PriceWithFee getPrices(int index) {
    return prices_.get(index);
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  public com.tdextrade.v2.PriceWithFeeOrBuilder getPricesOrBuilder(
      int index) {
    return prices_.get(index);
  }
  private void ensurePricesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.tdextrade.v2.PriceWithFee> tmp = prices_;
    if (!tmp.isModifiable()) {
      prices_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void setPrices(
      int index, com.tdextrade.v2.PriceWithFee value) {
    value.getClass();
  ensurePricesIsMutable();
    prices_.set(index, value);
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void addPrices(com.tdextrade.v2.PriceWithFee value) {
    value.getClass();
  ensurePricesIsMutable();
    prices_.add(value);
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void addPrices(
      int index, com.tdextrade.v2.PriceWithFee value) {
    value.getClass();
  ensurePricesIsMutable();
    prices_.add(index, value);
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void addAllPrices(
      java.lang.Iterable<? extends com.tdextrade.v2.PriceWithFee> values) {
    ensurePricesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, prices_);
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void clearPrices() {
    prices_ = emptyProtobufList();
  }
  /**
   * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  private void removePrices(int index) {
    ensurePricesIsMutable();
    prices_.remove(index);
  }

  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdextrade.v2.MarketPriceReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.MarketPriceReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.MarketPriceReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdextrade.v2.MarketPriceReply prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdextrade.v2.MarketPriceReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdextrade.v2.MarketPriceReply, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.MarketPriceReply)
      com.tdextrade.v2.MarketPriceReplyOrBuilder {
    // Construct using com.tdextrade.v2.MarketPriceReply.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    @java.lang.Override
    public java.util.List<com.tdextrade.v2.PriceWithFee> getPricesList() {
      return java.util.Collections.unmodifiableList(
          instance.getPricesList());
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    @java.lang.Override
    public int getPricesCount() {
      return instance.getPricesCount();
    }/**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    @java.lang.Override
    public com.tdextrade.v2.PriceWithFee getPrices(int index) {
      return instance.getPrices(index);
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder setPrices(
        int index, com.tdextrade.v2.PriceWithFee value) {
      copyOnWrite();
      instance.setPrices(index, value);
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder setPrices(
        int index, com.tdextrade.v2.PriceWithFee.Builder builderForValue) {
      copyOnWrite();
      instance.setPrices(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(com.tdextrade.v2.PriceWithFee value) {
      copyOnWrite();
      instance.addPrices(value);
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        int index, com.tdextrade.v2.PriceWithFee value) {
      copyOnWrite();
      instance.addPrices(index, value);
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        com.tdextrade.v2.PriceWithFee.Builder builderForValue) {
      copyOnWrite();
      instance.addPrices(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        int index, com.tdextrade.v2.PriceWithFee.Builder builderForValue) {
      copyOnWrite();
      instance.addPrices(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addAllPrices(
        java.lang.Iterable<? extends com.tdextrade.v2.PriceWithFee> values) {
      copyOnWrite();
      instance.addAllPrices(values);
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder clearPrices() {
      copyOnWrite();
      instance.clearPrices();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder removePrices(int index) {
      copyOnWrite();
      instance.removePrices(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdextrade.v2.MarketPriceReply)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdextrade.v2.MarketPriceReply();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "prices_",
            com.tdextrade.v2.PriceWithFee.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdextrade.v2.MarketPriceReply> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdextrade.v2.MarketPriceReply.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdextrade.v2.MarketPriceReply>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:tdextrade.v2.MarketPriceReply)
  private static final com.tdextrade.v2.MarketPriceReply DEFAULT_INSTANCE;
  static {
    MarketPriceReply defaultInstance = new MarketPriceReply();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MarketPriceReply.class, defaultInstance);
  }

  public static com.tdextrade.v2.MarketPriceReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MarketPriceReply> PARSER;

  public static com.google.protobuf.Parser<MarketPriceReply> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

