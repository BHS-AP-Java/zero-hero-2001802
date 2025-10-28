package edu.bhscs;

public class Table {
  /*make a table with legs that can be spaced apart and can but doesnt necessarily have to be centered on a potential cake
  fields and properties*/
  int legs;
  int width;

  // constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
  }

  // methods

  public void drawTable(int legs, int width, int legHeight) {
    int legSpacing = width/legs;

    for(int w = 0; w < width ; w++){
      System.out.print("=");
    }
    for(int h = 0; h < legHeight -1; h++){


      System.out.println();
      int l;
      for(int m =0; m < legs; m++){
        for(l=0; l < legSpacing ; l++){
          if (l == 0) {
            System.out.print("|");
          }
          if(m == legSpacing -1){
            l+= 1;
          }
          System.out.print(" ");

        }

      }
    }
    System.out.println();
  }
}
