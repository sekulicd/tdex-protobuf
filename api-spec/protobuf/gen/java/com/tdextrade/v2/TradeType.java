// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf enum {@code tdextrade.v2.TradeType}
 */
public enum TradeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BUY = 0;</code>
   */
  BUY(0),
  /**
   * <code>SELL = 1;</code>
   */
  SELL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BUY = 0;</code>
   */
  public static final int BUY_VALUE = 0;
  /**
   * <code>SELL = 1;</code>
   */
  public static final int SELL_VALUE = 1;


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
  public static TradeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TradeType forNumber(int value) {
    switch (value) {
      case 0: return BUY;
      case 1: return SELL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradeType>() {
          public TradeType findValueByNumber(int number) {
            return TradeType.forNumber(number);
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
    return com.tdextrade.v2.TradeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TradeType[] VALUES = values();

  public static TradeType valueOf(
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

  private TradeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tdextrade.v2.TradeType)
}

