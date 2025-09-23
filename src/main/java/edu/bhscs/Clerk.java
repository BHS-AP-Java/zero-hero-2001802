package edu.bhscs;

public class Clerk {
  Store myStore = new Store();
  Cake boughtCake = myStore.sellCake();
  public void speaken(){
    System.out.println("Would you like to buy a " + boughtCake.getFlavor() + " cake that weighs " + boughtCake.getWeight() + " weight?");
  }
}