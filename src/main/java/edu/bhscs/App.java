package edu.bhscs;

import java.util.Scanner;
public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Cake myCake = new Cake("",this.f,"string","string");
    Player player = new Player(scanner);
    String data;
    String data2;
    data = player.getCakeData();
    int width = Integer.parseInt(data);
    data2 = player.getCakeData2();
    int height = Integer.parseInt(data2);
    myCake.draw(width, height, height);

    //date10_27();
  }

  public static void date10_27() {

    Baker bob = new Baker("Bob");
    Table t = new Table(3, 199);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(20, 5, 5);
  }
}
