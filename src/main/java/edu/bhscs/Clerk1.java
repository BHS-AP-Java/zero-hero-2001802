package edu.bhscs;

public class Clerk1 {
  public int ClerkCash = 0;
  public int Value = 42;
  Store1 myStore = new Store1();
  Cake1 boughtCake = myStore.sellCake();

  public void speaken() {
    System.out.println("cake is for sale at the store currently");
    System.out.println(
        "Would you like to buy a "
            + boughtCake.getFlavor()
            + " cake that weighs "
            + boughtCake.getWeight()
            + " weight?, it costs 42$");
  }

  public Integer purchaseCake() {
    ClerkCash += Value;
    System.out.println("User paid " + Value + " money");
    System.out.println("The clerk now has " + ClerkCash + " money in the register");
    return (Value);
  }
}
