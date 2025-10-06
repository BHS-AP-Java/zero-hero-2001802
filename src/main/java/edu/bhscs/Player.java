package edu.bhscs;

public class Player {
  Store myStore = new Store();
  Cake boughtCake = myStore.sellCake();
  public void buyCake(){
    System.out.println("User has purchased a " + boughtCake.getQuality()
        + " cake that weighs " + boughtCake.getWeight() + " weight");
  }
}
