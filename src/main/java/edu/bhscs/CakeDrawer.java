package edu.bhscs;

public class CakeDrawer {

  private String candles = "";

  public void drawCake(int width, int height, int depth, int cQuantity) {
    // cakeCandle(width, cQuantity);
    cakeHWD(width, height, depth);
  }

  public void cakeCandle(int width, int cQuantity) {

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

    // depth

    for (int d = 0; d < depth; d++) {

      for (int i = 0; i < depth - d - 1; i++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int i = 0; i < width; i++) {
        System.out.print("^");
      }
      System.out.print(" ");
      for (int i = 0; i < d + 1; i++) {
        System.out.print("/");
      }
      System.out.println();
    }

    // width/height

    for (int h = 0; h < height; h++) {
      for (int i = 0; i < h; i++) {
        System.out.print(" ");
      }
      System.out.print("—");
      for (int i = 0; i < width; i++) {
        System.out.print("-");
      }
      for (int i = 0; i < depth - h && i >= 0; i++) {
        System.out.print("/");
      }
      System.out.println();
    }
  }
}
