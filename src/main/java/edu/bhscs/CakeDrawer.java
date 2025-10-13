package edu.bhscs;

public class CakeDrawer {
  private String candles = "";
  private String guts = "";
  private String cakeDepth = "";

  public void drawCake(int width, int height, int depth, int cQuantity) {
    //cakeCandle(width, cQuantity);
    cakeHWD(width, height, depth);
  }

  public void cakeCandle(int width, int cQuantity){

    int spacing = width / cQuantity / 2;
    for (int k = 0; k < cQuantity; k++) {
      for (int p = 0; p < spacing; p++) {
        candles += " ";
        if (p == spacing - 1) {

          candles += "|";
        }
      }
    }
    System.out.println(candles);
  }

  public void cakeHWD(int width, int height, int depth) {
    // width
    for (int i = 0; i < width; i++) {
      guts += "-";
    }

    // height
    for (int j = 0; j < height; j++) {
      for (int m = 0; m < depth; m++) {
        depth -= 2;

        cakeDepth += "/";
      }

      System.out.println(guts + cakeDepth);
    }
  }
}
