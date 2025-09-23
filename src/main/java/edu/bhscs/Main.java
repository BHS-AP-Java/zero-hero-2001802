// Daniel Langlois
// P2
// Zero-Hero
// 09/12/2025

/*
 * DESCRIPTION: Whatever Mr Reiber says INPUT: We dont know about input yet OUTPUT:Some cool words
 * in the terminal EDGE CASE: They are all edge cases
 */

package edu.bhscs;

public class Main {

  // this is an example of a 'char' constant
  // because it is global, it should be in capital letters
  public static final float MYFLOAT = 69.420f;
  public static final char A = 'a';

  public static void main(String[] args) {
    int someNumber = 67;

    System.out.println("67!" + A + someNumber); // intuitive output
    System.out.println(A + "?" + A + someNumber); // intuitive output
    System.out.println(A + A + someNumber); // unintuitive output, expected aa67; result 261; reason
    // when there is not a string inn the argument, adds
    // unicode character value instead of character (97 + 97
    // + 67 = 261)
    System.out.println();
    System.out.println("this is neet");
    System.out.println();
    System.out.println();
    System.out.println("Ok I am done");
    Integer myInt;
    Integer myInt2 = 2;
    Awesome steve = new Awesome("Steve");
    Awesome sue = new Awesome("Sue");
    Awesome andrew = new Awesome("Andrew");
    Awesome john = new Awesome("John");
    Awesome mark = new Awesome("Mark");
    Awesome joel = new Awesome("Joel");
    System.out.println(steve.getName());
    System.out.println(sue.getName());
    System.out.println(andrew.getName());
    System.out.println(john.getName());
    System.out.println(mark.getName());
    System.out.println(joel.getName());
    steve.learnSomething("+1 cake");
    john.learnSomething("+1 cake");
    System.out.println(steve.getKnowledge());
    System.out.println(john.getKnowledge());
    for (myInt = 0; myInt < 9; myInt++) {
      myInt2++;
      System.out.println(myInt2);
    }
  }
}
