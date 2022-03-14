// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/swap.proto

package com.tdexswap.v1;

public interface SwapRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdexswap.v1.SwapRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The proposer's quantity
   * </pre>
   *
   * <code>uint64 amount_p = 2 [json_name = "amountP"];</code>
   * @return The amountP.
   */
  long getAmountP();

  /**
   * <pre>
   * The proposer's asset hash
   * </pre>
   *
   * <code>string asset_p = 3 [json_name = "assetP"];</code>
   * @return The assetP.
   */
  java.lang.String getAssetP();
  /**
   * <pre>
   * The proposer's asset hash
   * </pre>
   *
   * <code>string asset_p = 3 [json_name = "assetP"];</code>
   * @return The bytes for assetP.
   */
  com.google.protobuf.ByteString
      getAssetPBytes();

  /**
   * <pre>
   * The responder's quantity
   * </pre>
   *
   * <code>uint64 amount_r = 4 [json_name = "amountR"];</code>
   * @return The amountR.
   */
  long getAmountR();

  /**
   * <pre>
   * The responder's asset hash
   * </pre>
   *
   * <code>string asset_r = 5 [json_name = "assetR"];</code>
   * @return The assetR.
   */
  java.lang.String getAssetR();
  /**
   * <pre>
   * The responder's asset hash
   * </pre>
   *
   * <code>string asset_r = 5 [json_name = "assetR"];</code>
   * @return The bytes for assetR.
   */
  com.google.protobuf.ByteString
      getAssetRBytes();

  /**
   * <pre>
   * The proposer's unsigned transaction in PSBT format (base64 string)
   * </pre>
   *
   * <code>string transaction = 6 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  java.lang.String getTransaction();
  /**
   * <pre>
   * The proposer's unsigned transaction in PSBT format (base64 string)
   * </pre>
   *
   * <code>string transaction = 6 [json_name = "transaction"];</code>
   * @return The bytes for transaction.
   */
  com.google.protobuf.ByteString
      getTransactionBytes();

  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 7 [json_name = "inputBlindingKey"];</code>
   */
  int getInputBlindingKeyCount();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 7 [json_name = "inputBlindingKey"];</code>
   */
  boolean containsInputBlindingKey(
      java.lang.String key);
  /**
   * Use {@link #getInputBlindingKeyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getInputBlindingKey();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 7 [json_name = "inputBlindingKey"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getInputBlindingKeyMap();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 7 [json_name = "inputBlindingKey"];</code>
   */

  com.google.protobuf.ByteString getInputBlindingKeyOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue);
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 7 [json_name = "inputBlindingKey"];</code>
   */

  com.google.protobuf.ByteString getInputBlindingKeyOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 8 [json_name = "outputBlindingKey"];</code>
   */
  int getOutputBlindingKeyCount();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 8 [json_name = "outputBlindingKey"];</code>
   */
  boolean containsOutputBlindingKey(
      java.lang.String key);
  /**
   * Use {@link #getOutputBlindingKeyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getOutputBlindingKey();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 8 [json_name = "outputBlindingKey"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getOutputBlindingKeyMap();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 8 [json_name = "outputBlindingKey"];</code>
   */

  com.google.protobuf.ByteString getOutputBlindingKeyOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue);
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 8 [json_name = "outputBlindingKey"];</code>
   */

  com.google.protobuf.ByteString getOutputBlindingKeyOrThrow(
      java.lang.String key);
}