package com.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pizzaTest {

  @Test
  void ShouldReturnTheTotalPriceOfPizza() {
    Pizza pizza = new Pizza();
    pizza.add(Topping.TOMATO_SAUCE);
    int price = pizza.getTotalPrice();

    assertEquals(55,price);

  }
}