// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/swap.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.SwapComplete}
 */
public  final class SwapComplete extends
    com.google.protobuf.GeneratedMessageLite<
        SwapComplete, SwapComplete.Builder> implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.SwapComplete)
    SwapCompleteOrBuilder {
  private SwapComplete() {
    id_ = "";
    acceptId_ = "";
    transaction_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();
    
  }

  public static final int ACCEPT_ID_FIELD_NUMBER = 2;
  private java.lang.String acceptId_;
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @return The acceptId.
   */
  @java.lang.Override
  public java.lang.String getAcceptId() {
    return acceptId_;
  }
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @return The bytes for acceptId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcceptIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(acceptId_);
  }
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @param value The acceptId to set.
   */
  private void setAcceptId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    acceptId_ = value;
  }
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   */
  private void clearAcceptId() {
    
    acceptId_ = getDefaultInstance().getAcceptId();
  }
  /**
   * <pre>
   * indetifier of the SwapAccept message
   * </pre>
   *
   * <code>string accept_id = 2 [json_name = "acceptId"];</code>
   * @param value The bytes for acceptId to set.
   */
  private void setAcceptIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    acceptId_ = value.toStringUtf8();
    
  }

  public static final int TRANSACTION_FIELD_NUMBER = 3;
  private java.lang.String transaction_;
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  @java.lang.Override
  public java.lang.String getTransaction() {
    return transaction_;
  }
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The bytes for transaction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(transaction_);
  }
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @param value The transaction to set.
   */
  private void setTransaction(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    transaction_ = value;
  }
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   */
  private void clearTransaction() {
    
    transaction_ = getDefaultInstance().getTransaction();
  }
  /**
   * <pre>
   * The signed transaction base64 encoded containing the Proposers's signed
   * inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @param value The bytes for transaction to set.
   */
  private void setTransactionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    transaction_ = value.toStringUtf8();
    
  }

  public static com.tdextrade.v2.SwapComplete parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdextrade.v2.SwapComplete parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.SwapComplete parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdextrade.v2.SwapComplete parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdextrade.v2.SwapComplete prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdextrade.v2.SwapComplete}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdextrade.v2.SwapComplete, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.SwapComplete)
      com.tdextrade.v2.SwapCompleteOrBuilder {
    // Construct using com.tdextrade.v2.SwapComplete.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return The acceptId.
     */
    @java.lang.Override
    public java.lang.String getAcceptId() {
      return instance.getAcceptId();
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return The bytes for acceptId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAcceptIdBytes() {
      return instance.getAcceptIdBytes();
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @param value The acceptId to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptId(
        java.lang.String value) {
      copyOnWrite();
      instance.setAcceptId(value);
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptId() {
      copyOnWrite();
      instance.clearAcceptId();
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapAccept message
     * </pre>
     *
     * <code>string accept_id = 2 [json_name = "acceptId"];</code>
     * @param value The bytes for acceptId to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAcceptIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The transaction.
     */
    @java.lang.Override
    public java.lang.String getTransaction() {
      return instance.getTransaction();
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The bytes for transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionBytes() {
      return instance.getTransactionBytes();
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransaction(
        java.lang.String value) {
      copyOnWrite();
      instance.setTransaction(value);
      return this;
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransaction() {
      copyOnWrite();
      instance.clearTransaction();
      return this;
    }
    /**
     * <pre>
     * The signed transaction base64 encoded containing the Proposers's signed
     * inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The bytes for transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTransactionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdextrade.v2.SwapComplete)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdextrade.v2.SwapComplete();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "acceptId_",
            "transaction_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdextrade.v2.SwapComplete> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdextrade.v2.SwapComplete.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdextrade.v2.SwapComplete>(
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


  // @@protoc_insertion_point(class_scope:tdextrade.v2.SwapComplete)
  private static final com.tdextrade.v2.SwapComplete DEFAULT_INSTANCE;
  static {
    SwapComplete defaultInstance = new SwapComplete();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SwapComplete.class, defaultInstance);
  }

  public static com.tdextrade.v2.SwapComplete getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SwapComplete> PARSER;

  public static com.google.protobuf.Parser<SwapComplete> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

