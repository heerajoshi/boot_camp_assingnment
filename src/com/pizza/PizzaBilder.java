package com.pizza;

public class PizzaBilder {

  Pizza pizza;

  public PizzaBilder(Pizza pizza) {
    this.pizza = new Pizza();
  }

  PizzaBilder WithTopping(Topping topping){
    pizza.add(topping);
    return this;
  }

  Pizza bulid(){
    return pizza;
  }
}
