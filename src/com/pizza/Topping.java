package com.pizza;

public enum Topping {
  TOMATO_SAUCE(5),
  VEGETABLE(20),
  CHICKEN(30),
  MOZZARELLA(10),
  EXTRACHEESE(25),
  JALAPENO(40);
  int price;

  Topping(int price) {
    this.price = price;
  }
}
