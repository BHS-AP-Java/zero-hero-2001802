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
    // width
    for (int i = 0; i < width; i++) {
      guts += "-";
    }

    // height

    for( var depth2 = depth; depth2 > height; depth2--){
      placeHolder = "";


      for(int n = 0; n < width;n++){
        placeHolder += "^";


      }
      for(var v = 0; v< depth + (depth - height); v++){

        placeHolder += "/";
        String space = " ";
        placeHolder2 = space + "/" + placeHolder;
        c = -1;

      }
      placeHolder3 = placeHolder2.substring(0, placeHolder2.length() -1);
      System.out.println(placeHolder3);
    }
    for (int j = 0; j < height; j++) {
      depth -= 1;
      for (int m = 0; m <= depth; m++) {
        cakeDepth += "/";
        placeHolder += "/";


      }

      System.out.println(guts + cakeDepth);

      cakeDepth = "";
    }
  }
}
