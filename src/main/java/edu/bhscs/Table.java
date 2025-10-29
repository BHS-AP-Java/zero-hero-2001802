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
  public void drawTable(int legs, int width, int legHeight){
    for(int w = 0; w < width; w++){
      System.out.print("=");
    }
    System.out.println();

    for(int h = 0; h < legHeight; h++){
      for(int w = 0; w < width; w++){
        for(int i = 0; i < legs; i++){
          int legX = (int) Math.round(i * (width - 1.0) /(legs - 1));
          if(w == legX){
            System.out.print("|");
            break;
          }
          if (i == legs -1){
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

}
