// Daniel Langlois
// P2
// Bake Sale
// 9/29/2025

/*
 * Make a bake sale
 * Person buys a cake from a clerk who works at a store for money and then eats the purchased cake
 */

package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    Clerk myClerk = new Clerk();
    Store myStore = new Store();
    Cake boughtCake = myStore.sellCake();

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
