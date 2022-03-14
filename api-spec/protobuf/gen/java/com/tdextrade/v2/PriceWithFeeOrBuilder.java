// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/types.proto

package com.tdextrade.v2;

public interface PriceWithFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdextrade.v2.PriceWithFee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tdextrade.v2.Price price = 1 [json_name = "price"];</code>
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   * <code>.tdextrade.v2.Price price = 1 [json_name = "price"];</code>
   * @return The price.
   */
  com.tdextrade.v2.Price getPrice();
  /**
   * <code>.tdextrade.v2.Price price = 1 [json_name = "price"];</code>
   */
  com.tdextrade.v2.PriceOrBuilder getPriceOrBuilder();

  /**
   * <code>.tdextrade.v2.Fee fee = 2 [json_name = "fee"];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.tdextrade.v2.Fee fee = 2 [json_name = "fee"];</code>
   * @return The fee.
   */
  com.tdextrade.v2.Fee getFee();
  /**
   * <code>.tdextrade.v2.Fee fee = 2 [json_name = "fee"];</code>
   */
  com.tdextrade.v2.FeeOrBuilder getFeeOrBuilder();

  /**
   * <code>uint64 amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  long getAmount();

  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <code>.tdextrade.v2.Balance balance = 5 [json_name = "balance"];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <code>.tdextrade.v2.Balance balance = 5 [json_name = "balance"];</code>
   * @return The balance.
   */
  com.tdextrade.v2.Balance getBalance();
  /**
   * <code>.tdextrade.v2.Balance balance = 5 [json_name = "balance"];</code>
   */
  com.tdextrade.v2.BalanceOrBuilder getBalanceOrBuilder();
}
