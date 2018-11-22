// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");

    int number = scanner.nextInt();

    try {
      int result = 12 / number;
      System.out.println(result);
    } catch (Exception ex) {
      System.out.println("Sorry, I can't devide zero!");
    }
  }
}
