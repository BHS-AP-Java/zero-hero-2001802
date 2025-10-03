package edu.bhscs;

public class PTSA {
  Clerk myClerk = new Clerk();
  Double ptsaMoney = myClerk.getClerkCash();

  public String donate() {
    return ("The clerk donated " + ptsaMoney + " money to the PTSA");
  }
}
