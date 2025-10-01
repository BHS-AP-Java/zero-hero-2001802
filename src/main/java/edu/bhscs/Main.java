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

public class Main {
  public static void main(String[] args) {
    Clerk myClerk = new Clerk();
    Store myStore = new Store();
    Cake boughtCake = myStore.sellCake();
    PTSA myPTSA = new PTSA();
    Bakery myBakery = new Bakery();

    myBakery.getCakeQuality();
    myClerk.speaken();
    myClerk.purchaseCake();
    
    System.out.println(
        "the user has purchased a "
            + boughtCake.getQuality()
            + " cake that weighs "
            + boughtCake.getWeight()
            + " weight");

    boughtCake.eaten();
    System.out.println(myPTSA.donate());
  }
}
