// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jjc/grpc/services/bar_service.proto

package com.jjc.grpc.services.starter;

public interface DrinksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:barservice.DrinksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .barservice.Drink drinks = 1;</code>
   */
  java.util.List<com.jjc.grpc.services.starter.Drink> 
      getDrinksList();
  /**
   * <code>repeated .barservice.Drink drinks = 1;</code>
   */
  com.jjc.grpc.services.starter.Drink getDrinks(int index);
  /**
   * <code>repeated .barservice.Drink drinks = 1;</code>
   */
  int getDrinksCount();
  /**
   * <code>repeated .barservice.Drink drinks = 1;</code>
   */
  java.util.List<? extends com.jjc.grpc.services.starter.DrinkOrBuilder> 
      getDrinksOrBuilderList();
  /**
   * <code>repeated .barservice.Drink drinks = 1;</code>
   */
  com.jjc.grpc.services.starter.DrinkOrBuilder getDrinksOrBuilder(
      int index);
}