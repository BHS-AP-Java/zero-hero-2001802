package edu.bhscs;

public class Cake {
  // fields and properties
  private String flavor;
  private Flour flour;

  // constructor
  public Cake(String flavor, Flour flour) {
    this.flavor = flavor;
    this.flour = flour;
  }

  // methods
  public String getFlavor() {
    return flavor;
  }
}
