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
  }
}
