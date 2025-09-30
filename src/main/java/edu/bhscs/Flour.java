package edu.bhscs;

public class Flour {
  public int weight = 60;
  public int quantity = 20;
  public int price;
  public int quality = 8;

  public void goesBad(){
    this.quality = 0;
  };

  public Integer getWeight(){
    return weight;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Integer getPrice() {
    return price;
  }

  public Integer getQuality() {
    return quality;
  }
}