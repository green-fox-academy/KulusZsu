//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int givenNumber = scanner.nextInt();
    System.out.println(factorio(givenNumber));
  }

  public static int factorio(int givenNumber) {
    int factorialNumber = 1;
    for (int i = 1; i <= givenNumber; i++) {
      factorialNumber *= i;
    } return factorialNumber;
  }
}
