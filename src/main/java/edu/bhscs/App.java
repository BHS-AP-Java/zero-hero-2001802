package edu.bhscs;

public class App {
  public static void main(String[] args) {
    /*
    Scanner scanner = new Scanner(System.in);
    CakeDrawer myDrawer = new CakeDrawer();

    CakeDrawer myCake = new CakeDrawer();
    Player player = new Player(scanner);
    String data;
    String data2;
    data = player.getCakeData();
    int width = Integer.parseInt(data);
    data2 = player.getCakeData2();
    int height = Integer.parseInt(data2);
    myDrawer.draw(width, height, height);
    */
    date10_27();
  }

  public static void date10_27() {

    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(5, 5, 5);
  }
}
