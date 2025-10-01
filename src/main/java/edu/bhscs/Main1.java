// Daniel Langlois
// P2
// Bake Sale
// 9/29/2025

/*
 * Make a bake sale
 * Person buys a cake from a clerk who works at a store for money and then eats the purchased cake
 */

// constructor
// method
// fields
package edu.bhscs;

public class Main1 {
  public static void main(String[] args) {
    Clerk1 myClerk = new Clerk1();
    Store1 myStore = new Store1();
    Cake1 boughtCake = myStore.sellCake();
    Flour1 myFlour = new Flour1();

    myClerk.speaken();
    myClerk.purchaseCake();
    System.out.println(
        "the user has purchased a "
            + boughtCake.getFlavor()
            + " cake that weighs "
            + boughtCake.getWeight()
            + " weight");

    boughtCake.eaten();
  }
}
