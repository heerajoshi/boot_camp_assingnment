package com.pizza;

import java.util.ArrayList;
import java.util.List;

class Toppings {

  private static final List<Topping> toppings = new ArrayList();
  private int totalPrice;

   Toppings() {
    this.totalPrice = 0;
  }

  void add(Topping topping) {
    toppings.add(topping);
  }

  int totalPrice() {
    for (Topping topping : toppings) {
      totalPrice += topping.price;
    }
    return totalPrice;
  }
}
