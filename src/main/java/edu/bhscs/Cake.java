package edu.bhscs;

public class Cake {
  // fields and properties
  private String flavor;
  private String quality;
  private Flour flour;


  // constructor
  public Cake(String flavor, Flour flour, String quality) {
    this.flavor = flavor;
    this.quality = quality;
    this.flour = flour;
  }

  // methods
  public String getFlavor() {
    return flavor;
  }

  public String getQuality() {
    return quality;
  }
}
