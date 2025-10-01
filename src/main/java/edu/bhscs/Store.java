package edu.bhscs;

public class Store {
  Bakery myBakery = new Bakery();
  String quality = myBakery.getCakeQuality();
  Integer flourWeight = myBakery.getFlourQuantity();
  public Cake sellCake() {
    return new Cake(quality, flourWeight);
  }
  public Double getCakeValue(){
    return (flourWeight * 1.5);
  };
}
