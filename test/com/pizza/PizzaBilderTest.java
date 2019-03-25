package com.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaBilderTest {


  @Test
  void ShouldReturnTheTotalPriceOfPizza() {

    Pizza pizza = new Pizza();
    PizzaBilder pizzaBilder = new PizzaBilder(pizza);

    pizzaBilder.WithTopping(Topping.CHICKEN)
            .WithTopping(Topping.EXTRACHEESE)
            .WithTopping(Topping.VEGETABLE);

    int totalAmount = pizza.getTotalPrice();

    assertEquals(125,totalAmount);
  }
}