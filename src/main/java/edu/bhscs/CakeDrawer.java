package edu.bhscs;

public class CakeDrawer {

  public static void drawCake(int width, int height){
    String guts = "";
    for (int i = 0; i < width; i++){
      guts += "-";
    }
    for (int j=0;j < height; j++){
      System.out.println(guts);
    }
  }
}
