package exercise.company;

public class Counter {

  int number;

  public Counter() {
    this.number = 0;
  }

  public Counter(int number) {
    this.number = number;
  }

  public int add(int number) {
    return number += 10;
  }

  public int add() {
    return number += 1;
  }

  public int get() {
    return this.number;
  }

  public int reset() {
    int number = 0;
    return number;
  }
}
