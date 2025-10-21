package edu.bhscs;

import java.util.Scanner;

public class Player {
  // fields and properties
  private Scanner scanner;
  int accomplishments;
  public String question2 = "how wide is your cake?";

  // Constructor
  public Player(Scanner scanner) {
    this.scanner = scanner;
  }

  // Methods
  public void accomplish(int amount) {
    this.accomplishments += amount;
  }
  ;

  public String giveAnswer(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }

  public String getCakeData() {
    System.out.println(question2);
    String width = scanner.nextLine();
    return width;
  }
}
