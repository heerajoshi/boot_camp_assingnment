package com.pizza;

public enum Topping {
  TOMATO_SAUCE(5);
  int price;
  Topping(int price) {
    this.price = price;
  }
}
