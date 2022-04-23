// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jjc/grpc/services/bar_service.proto

package com.jjc.grpc.services.starter;

public interface BillOrBuilder extends
    // @@protoc_insertion_point(interface_extends:barservice.Bill)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>uint64 orderAmount = 2;</code>
   * @return The orderAmount.
   */
  long getOrderAmount();

  /**
   * <code>.google.protobuf.Timestamp orderTimestamp = 3;</code>
   * @return Whether the orderTimestamp field is set.
   */
  boolean hasOrderTimestamp();
  /**
   * <code>.google.protobuf.Timestamp orderTimestamp = 3;</code>
   * @return The orderTimestamp.
   */
  com.google.protobuf.Timestamp getOrderTimestamp();
  /**
   * <code>.google.protobuf.Timestamp orderTimestamp = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getOrderTimestampOrBuilder();
}
