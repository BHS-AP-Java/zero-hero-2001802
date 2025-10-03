package edu.bhscs;

public class Bakery {
  Baker myBaker = new Baker();
  Flour myFlour = new Flour();
  Integer flourQuality = myFlour.getQuality();
  Integer flourQuantity = myFlour.getQuantity();
  Integer bakerSkill = myBaker.getSkill();
  String cakeQuality;

  public Integer getFlourQuantity() {
    return flourQuantity;
  }

  public String getCakeQuality() {
    if (flourQuality >= 7) {
      cakeQuality = "good";
      if (bakerSkill >= 7) {
        cakeQuality = "great!";
      }
    }
    if (flourQuality < 7) {
      cakeQuality = "bad";
      if (bakerSkill >= 7) {
        cakeQuality = "good";
      }
    }
    return cakeQuality;
  }
}
