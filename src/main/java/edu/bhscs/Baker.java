package edu.bhscs;

public class Baker {
  //not finished creating baker but uses random numbers to determine in part quality of cake
  int randomInt = (int) (Math.random() * 10) + 1;
  int temp = randomInt;

  public int skill = randomInt;

  public Integer getSkill() {
    return skill;
  }
}
