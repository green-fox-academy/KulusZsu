// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Please give me a number!");

      int num = scanner.nextInt();

      try {
        int num2 = 10 / num;
        System.out.println(num2);
      } catch (ArithmeticException e) {
        System.out.println("Fail! - No dividing by zero!");
      }
    }
  }

