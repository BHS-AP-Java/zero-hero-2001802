package edu.bhscs;

public class Cake {
  // I have to make a constructor
  public String quality;
  public int weight;

  public Cake(String quality, int weight) {
    this.quality = quality;
    this.weight = weight;
  }

  public void eaten() {
    weight -= 2;
    System.out.println("I eated 2 weight of cake");
    System.out.println("The cake has been eated there is weight of " + weight + " weight left");
  }

  public String getQuality() {
    return quality;
  }

  public Integer getWeight() {
    return weight;
  }
}
