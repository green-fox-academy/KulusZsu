package exercise.company;

public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public int eat() {
    return hunger -= 1;
  }

  public int drink() {
    return thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }
}
