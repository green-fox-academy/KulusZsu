// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {

  public static void main(String[] args) {
    System.out.println(reCursive(5));
  }

  public static int reCursive(int number) {
    if (number < 0) {
      return number;
    } else {
      return reCursive(number - 1) + number;
    }
  }
}

