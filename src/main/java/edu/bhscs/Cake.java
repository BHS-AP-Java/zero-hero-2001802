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
    color = flavor + " color";
    if (flavor == "qwerty") {
      color = "this cake is not qwerty but instead vanilla and white color";
    }
    return color;
  }

  public void draw(int width, int height, int depth) {
    drawCake(width, height, depth);
    drawTable(width, height, depth);
  }

  private String candles = "";

  public void drawCake(int width, int height, int depth) {
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

  public void drawTable(int width, int height, int depth) {
    Table myTable = new Table(3, 20);
    //this.draw(t);
    int center = width / 2;
    myTable.drawTable(3, width*2, 6, center/2);
  }
}
