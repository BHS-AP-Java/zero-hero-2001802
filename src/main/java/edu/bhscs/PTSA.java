package edu.bhscs;

public class PTSA {
  Clerk1 myClerk = new Clerk1();
  Integer ptsaMoney = myClerk.getClerkCash();

  public String donate() {
    return ("The clerk donated " + ptsaMoney + " money to the PTSA");
  }
}
