// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/trade.proto

package com.tdextrade.v2;

public interface TradeProposeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdextrade.v2.TradeProposeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   * @return Whether the market field is set.
   */
  boolean hasMarket();
  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   * @return The market.
   */
  com.tdextrade.v2.Market getMarket();
  /**
   * <code>.tdextrade.v2.Market market = 1 [json_name = "market"];</code>
   */
  com.tdextrade.v2.MarketOrBuilder getMarketOrBuilder();

  /**
   * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.tdextrade.v2.TradeType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.tdextrade.v2.TradeType getType();

  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   * @return Whether the swapRequest field is set.
   */
  boolean hasSwapRequest();
  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   * @return The swapRequest.
   */
  com.tdextrade.v2.SwapRequest getSwapRequest();
  /**
   * <code>.tdextrade.v2.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  com.tdextrade.v2.SwapRequestOrBuilder getSwapRequestOrBuilder();
}
