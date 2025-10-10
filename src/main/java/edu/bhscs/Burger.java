/*
 * Daniel Langlois
 * P2
 * Burger
 * Draws a burger
 */



package edu.bhscs;

public class Burger {
  //fields and properties
  Integer size;
  Integer weight;

  //constructor
  Burger(String name){

  }

  // methods
  public Integer beEaten(){
    return weight -= 1;
  }
  private static String breadGuts(int width){
    String guts = "";
    for(var i = 0; i < width; i++){
      guts += "=";
    }
    return guts;
  }
  public void drawSelf(){
    for(int i = 0; i < 10; i++){
      System.out.println(" ---------- ");
      System.out.println("/           \")
      System.out.println(" ====" + breadGuts(10) + "===");

    }

  }
}

