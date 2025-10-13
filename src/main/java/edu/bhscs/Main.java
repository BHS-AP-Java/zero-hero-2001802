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
    CakeDrawer drawCake = new CakeDrawer();
    drawCake.drawCake(8, 4,5,4);
    baker.f = flour;
    baker.learn(6);
    baker.translateSkill();
    baker.takeJob(bakery);
    baker.takeOrder(10, customer);
    baker.donateToPTSA(ptsa, 10);
    scanner.close();
  }
}
