package edu.bhscs;

public class Cake1 {
  // I have to make a constructor
  Flour1 myFlour = new Flour1();
  public String flavor;
  public int weight;

  public Cake1(String flavor, int weight) {
    this.flavor = flavor;
    this.weight = weight;
  }

  public void buildCake() {
    if (myFlour.getQuality() >= 6) {
      if (myFlour.getQuantity() >= 10) {
        weight = myFlour.getWeight();
      }
    }
  }
  ;

  public void eaten() {
    weight -= 2;
    System.out.println("I eated 2 weight of cake");
    System.out.println("The cake has been eated there is weight of " + weight + " weight left");
  }

  public String getFlavor() {
    return flavor;
  }

  public Integer getWeight() {
    return weight;
  }
}
