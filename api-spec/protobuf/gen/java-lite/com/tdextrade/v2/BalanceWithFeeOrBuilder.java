// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/types.proto

package com.tdextrade.v2;

public interface BalanceWithFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdextrade.v2.BalanceWithFee)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.tdextrade.v2.Balance balance = 1 [json_name = "balance"];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <code>.tdextrade.v2.Balance balance = 1 [json_name = "balance"];</code>
   * @return The balance.
   */
  com.tdextrade.v2.Balance getBalance();

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
}
