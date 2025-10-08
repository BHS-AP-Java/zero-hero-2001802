package edu.bhscs;

import java.util.Scanner;

public class Player {
  // fields and properties
  private Scanner scanner;

  // Constructor
  public Player(Scanner scanner) {
    this.scanner = scanner;
  }

  // Methods
  public String giveAnswer(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }
}
