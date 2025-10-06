package edu.bhscs;

public class Flour {
  // uses random to create flour quality and weight
  // quality and weight determine price
  int flourQuality = (int) (Math.random() * 10) + 1;
  int flourQuantity = (int) (Math.random() * 50) + 1;

  public int quality = flourQuality;
  public int quantity = flourQuantity;

  public Integer getQuality() {
    return quality;
  }

  public Integer getQuantity() {
    return quantity;
  }
  ;
}
