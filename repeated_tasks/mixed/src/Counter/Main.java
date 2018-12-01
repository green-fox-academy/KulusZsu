package Counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
  public static void main(String[] args) {
    Counter one = new Counter(0);

    one.add();
    one.get();
    one.addNumber(3);

    System.out.println(one.value);
    System.out.println(one.get());
    System.out.println(one.reset());

  }

  class CounterTest {

    Counter c = new Counter(0);

    @Test
    void addMore() {
      c.add();
      assertEquals(5, c.get());
    }

    @Test
    void addOne() {
      c.add();
      assertEquals(1, c.get());
    }

    @Test
    void getZero() {
      assertEquals(0, c.get());
    }

    @Test
    void getInit() {
      Counter c = new Counter(7);
      assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
      c.add();
      c.reset();
      assertEquals(0, c.get());
    }

    @Test
    void resetToInit() {
      Counter c = new Counter(7);
      c.add();
      c.reset();
      assertEquals(7, c.get());
    }

  }
}
