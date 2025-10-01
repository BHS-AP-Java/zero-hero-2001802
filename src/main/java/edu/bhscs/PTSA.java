package edu.bhscs;

public class PTSA {
  Clerk myClerk = new Clerk();
  Integer ptsaMoney = myClerk.getClerkCash();

  public String donate(){
    return("The clerk donated " + ptsaMoney + " money to the PTSA");
  }

}
