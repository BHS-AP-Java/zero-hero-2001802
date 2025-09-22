package edu.bhscs;

public class Cake {
  // I have to make a constructor
  public String flavor;
  public int weight;

  public Cake(String flavor, int weight) {
    this.flavor = flavor;
    this.weight = weight;
  }
  public void eaten() {
    weight -= 2;
    System.out.println("The cake has been eated there is weight of " + weight + " weight left");
    System.out.println("I eated 2 weight of cake");
  }

  public String getFlavor() {
    return flavor;
  }
  public Integer getWeight(){
    return weight;
  }
}
