package edu.bhscs;

public class Person {
  public static void main(String[] args) {
    Store store = new Store();
    Cake boughtCake = store.sellCake();
    System.out.println("the user has purchased a " + boughtCake.getFlavor() + " cake");
    boughtCake.eaten();
  }
}
