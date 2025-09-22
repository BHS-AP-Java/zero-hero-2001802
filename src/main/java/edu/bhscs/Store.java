package edu.bhscs;

public class Store {

  public Cake sellCake(){
    System.out.println("chololate cake is for sale at the store currently");
    return new Cake("Chocolate", 10);
  }
}
