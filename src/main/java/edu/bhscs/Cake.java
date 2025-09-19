package edu.bhscs;

public class Cake {
  // I have to make a constructor
  int weight;

  public Cake(String ingredient, Integer status) {

    System.out.println("what a yummy cake " + ingredient + status);
    this.weight = 10;
  }

  public void eaten() {
    this.weight = this.weight - 2;
  }

  public int getWeight() {
    return this.weight;
  }
}
