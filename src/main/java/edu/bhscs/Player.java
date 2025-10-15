package edu.bhscs;

import java.util.Scanner;

public class Player {
  // fields and properties
  private Scanner scanner;
  int accomplishments;

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
}
