// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/transport.proto

package com.tdextrade.v2;

public interface SupportedContentTypesReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdextrade.v2.SupportedContentTypesReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the acceptedTypes.
   */
  java.util.List<com.tdextrade.v2.ContentType> getAcceptedTypesList();
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return The count of acceptedTypes.
   */
  int getAcceptedTypesCount();
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the element to return.
   * @return The acceptedTypes at the given index.
   */
  com.tdextrade.v2.ContentType getAcceptedTypes(int index);
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the enum numeric values on the wire for acceptedTypes.
   */
  java.util.List<java.lang.Integer>
  getAcceptedTypesValueList();
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of acceptedTypes at the given index.
   */
  int getAcceptedTypesValue(int index);
}