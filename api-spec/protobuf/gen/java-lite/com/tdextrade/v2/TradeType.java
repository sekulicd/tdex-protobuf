// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

/**
 * Protobuf enum {@code tdextrade.v2.TradeType}
 */
public enum TradeType
    implements com.google.protobuf.Internal.EnumLite {
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


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TradeType valueOf(int value) {
    return forNumber(value);
  }

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
          @java.lang.Override
          public TradeType findValueByNumber(int number) {
            return TradeType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return TradeTypeVerifier.INSTANCE;
  }

  private static final class TradeTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TradeTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return TradeType.forNumber(number) != null;
          }
        };

  private final int value;

  private TradeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tdextrade.v2.TradeType)
}

