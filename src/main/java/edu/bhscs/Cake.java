package edu.bhscs;

public class Cake {
  // I have to make a constructor
  private String flavor;
  private int weight;

  public Cake(String flavor, int weight){
    this.flavor = flavor;
    this.weight = weight;
  }

  public void eaten(){
    weight -=2;
    System.out.println("The cake has been eated there is weight of " + weight + " weight left");
  }

  public String getFlavor(){
    return flavor;
  }
}