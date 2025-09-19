package edu.bhscs;

public class Main2 {
  public static float NAME_OF_THIS_FLOAT = 69.42f;
  public static char A = 'a';

  public static void main(String[] args) {
    System.out.println(A);
    System.out.println(pushup("Garlic"));
    System.out.println(pushup("Garlic"));
    System.out.println(pushup("Garlic"));
  }

  public static String pushup(String food) {
    return "sweat " + food;
  }
}
