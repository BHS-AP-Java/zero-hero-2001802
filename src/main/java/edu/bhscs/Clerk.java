package edu.bhscs;

public class Clerk {
  public int ClerkCash = 0;
  public String cakePrice;
  Store myStore = new Store();
  Cake boughtCake = myStore.sellCake();
  Double cakeValue = myStore.getCakeValue();

  public String cakeQualityMult(){
    cakePrice = boughtCake.getQuality();
    return cakePrice;
  }


  public void speaken() {
    System.out.println("cake is for sale at the store currently");
    System.out.println(
        "Would you like to buy a "
            + boughtCake.getQuality()
            + " cake that weighs "
            + boughtCake.getWeight()
            + " weight?, it costs " + cakeValue);
  }

  public Double purchaseCake() {
    ClerkCash += cakeValue;
    System.out.println("User paid " + cakeValue + " money");
    System.out.println("The clerk now has " + ClerkCash + " money in the register");
    return (cakeValue);
  }

  public Double getClerkCash() {
    return ClerkCash + cakeValue;
  }
}
