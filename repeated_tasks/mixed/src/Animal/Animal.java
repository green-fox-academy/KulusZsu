package Animal;

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

  public int play() {
    return thirst += 1;
  }
}
