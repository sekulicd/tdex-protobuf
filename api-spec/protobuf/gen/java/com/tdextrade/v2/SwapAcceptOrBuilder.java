// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/swap.proto

package com.tdextrade.v2;

public interface SwapAcceptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdextrade.v2.SwapAccept)
    com.google.protobuf.MessageOrBuilder {

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
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  java.lang.String getTransaction();
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
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
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  int getInputBlindingKeyCount();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  int getOutputBlindingKeyCount();
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
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
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */

  com.google.protobuf.ByteString getOutputBlindingKeyOrThrow(
      java.lang.String key);
}
