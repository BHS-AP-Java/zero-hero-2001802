package edu.bhscs;

public class CakeDrawer {
  private String candles = "";
  private String guts = "";
  private String cakeDepth = "";
  private String placeHolder = "";
  private String placeHolder2 = "";
  private String placeHolder3;
  private int c = 0;

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
      
  }
}
