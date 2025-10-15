package edu.bhscs;

public class Cake {
  // fields and properties
  private String flavor;
  private String quality;
  private Flour flour;
  private String color;

  // constructor
  public Cake(String flavor, Flour flour, String quality, String color) {
    this.flavor = flavor;
    this.quality = quality;
    this.flour = flour;
    this.color = color;
  }

  // methods

  public String getFlavor() {
    return flavor;
  }

  public String getQuality() {
    return quality;
  }

  public String getColor() {
    System.out.println(color);
    return color;
  }
}
