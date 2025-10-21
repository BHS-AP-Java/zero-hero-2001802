package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player(scanner);
    Customer customer = new Customer(player);
    Bakery bakery = new Bakery("My bakery");
    PTSA ptsa = new PTSA();
    Flour flour = new Flour("the best flower ever");
    Baker baker = new Baker("User", player);
    CakeDrawer myCake = new CakeDrawer();
    String data;
    data = player.getCakeData();
    int width = Integer.parseInt(data);
    baker.f = flour;
    baker.learn(6);
    baker.translateSkill();
    baker.takeJob(bakery);
    baker.takeOrder(10, customer);
    baker.donateToPTSA(ptsa, 10);
    myCake.drawCake(width, 5, 5, 4);
    scanner.close();
  }
}
