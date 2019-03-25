package com.pizza;

class Pizza {
  private int basePrice = 50;
  private Toppings toppings;

  Pizza() {
    this.toppings = new Toppings();
     this.basePrice = basePrice;
  }



  void add(Topping topping) {
    toppings.add(topping);

  }

   int getTotalPrice() {
    return this.basePrice + toppings.totalPrice();
  }
}


