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

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine(); // Read user input
    System.out.println("Username is: " + userName);
    myObj.close();// Output user input
    
    Clerk myClerk = new Clerk();
    Store myStore = new Store();
    Cake boughtCake = myStore.sellCake();
    PTSA myPTSA = new PTSA();
    Bakery myBakery = new Bakery();

    myBakery.getCakeQuality();
    myClerk.speaken();
    myClerk.purchaseCake();

    System.out.println(
        userName + " has purchased a "
            + boughtCake.getQuality()
            + " cake that weighs "
            + boughtCake.getWeight()
            + " weight");

    boughtCake.eaten();
    System.out.println(myPTSA.donate());
  }
}
