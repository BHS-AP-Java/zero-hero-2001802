package edu.bhscs;
import java.util.Scanner;
public class Player {
  // fields and properties
  String name;
  Scanner s;
  // Constructor
  public Player(String name){
    this.name = name;
    this.s = new Scanner(System.in);
  }
  // Methods
  public void answerQuestions(){
    System.out.println("whats your question?");
    String question = this.s.next();
    System.out.println(question + " is a dumb question");
  }
  public String giveAnswer(String question){
    System.out.println(question);
    return s.nexLine();
  }
}
