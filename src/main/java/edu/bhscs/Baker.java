package edu.bhscs;

public class Baker {

  Player p;
  Flour f;
  Store placeOfWork;
  int cash;

  // constructor
  Baker(Player p) {
    this.p = p;
  }

  // methods

  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("What cake do you want?");
    return new Cake(answer, this.f);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }
}
