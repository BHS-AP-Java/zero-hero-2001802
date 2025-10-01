package edu.bhscs;

public class Baker {
  int randomInt = (int) (Math.random() * 10) + 1;

  public int skill = randomInt;


  public Integer getSkill() {
    return skill;
  }
}
