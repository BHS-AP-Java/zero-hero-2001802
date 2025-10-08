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
    baker.f = flour;
    baker.learn(4);
    baker.translateSkill();
    baker.takeJob(bakery);
    baker.takeOrder(10, customer);
    baker.donateToPTSA(ptsa, 10);
    scanner.close();
  }
}
