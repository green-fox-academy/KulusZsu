package exercise.company;

public class Animal {
  int hunger;
  int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = 50;
    this.thirst = 50;
  }

  public int eat() {
    return hunger -=1;
  }

  public int drink() {
    return thirst -=1;

  }

  public int play() {
    return hunger +=1;
    return thirst +=1;
  }
}
