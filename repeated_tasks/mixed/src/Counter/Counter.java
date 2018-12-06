package Counter;

public class Counter {
  int value;

  public Counter() {

    this.value = 0;
  }

  public Counter(int value) {
    this.value = value;
  }

  public int addNumber(int number) {
    return this.value + number;
  }

  public int add() {
    return value += 1;
  }

  public int get() {
    return this.value;
  }

  public int reset() {
    return value = 0;
  }
}
