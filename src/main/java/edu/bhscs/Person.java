package edu.bhscs;

public class Person {
  public static void main(String[] args) {
    Clerk myClerk = new Clerk();
    Store myStore = new Store();
    Cake boughtCake = myStore.sellCake();
    myClerk.speaken();
    System.out.println("the user has purchased a " + boughtCake.getFlavor() + " cake that weighs " + boughtCake.getWeight() + " weight");
    boughtCake.eaten();

  }
}
