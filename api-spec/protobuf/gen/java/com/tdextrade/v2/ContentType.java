// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/transport.proto

package com.tdextrade.v2;

/**
 * Protobuf enum {@code tdextrade.v2.ContentType}
 */
public enum ContentType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON = 0;</code>
   */
  JSON(0),
  /**
   * <code>GRPC = 1;</code>
   */
  GRPC(1),
  /**
   * <code>GRPCWEB = 2;</code>
   */
  GRPCWEB(2),
  /**
   * <code>GRPCWEBTEXT = 3;</code>
   */
  GRPCWEBTEXT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON = 0;</code>
   */
  public static final int JSON_VALUE = 0;
  /**
   * <code>GRPC = 1;</code>
   */
  public static final int GRPC_VALUE = 1;
  /**
   * <code>GRPCWEB = 2;</code>
   */
  public static final int GRPCWEB_VALUE = 2;
  /**
   * <code>GRPCWEBTEXT = 3;</code>
   */
  public static final int GRPCWEBTEXT_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ContentType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContentType forNumber(int value) {
    switch (value) {
      case 0: return JSON;
      case 1: return GRPC;
      case 2: return GRPCWEB;
      case 3: return GRPCWEBTEXT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContentType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContentType>() {
          public ContentType findValueByNumber(int number) {
            return ContentType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.tdextrade.v2.TransportProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ContentType[] VALUES = values();

  public static ContentType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tdextrade.v2.ContentType)
}

