package edu.bhscs;

public class Awesome {
  // we need to construct something awesome

  String name;
  String knowledge;
  

  public Awesome(String name) {
    System.out.println("I am awseome " + name);
    this.name = name;
  }

  String getName() {
    return (this.name);
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getKnowledge() {
    return this.knowledge;
  }
}
