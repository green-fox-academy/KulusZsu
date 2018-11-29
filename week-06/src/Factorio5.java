//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int input = scanner.nextInt();
    System.out.println(factorio(input));
  }

  public static int factorio(int input) {
    int factorial = 1;
    for (int i = 1; i <= input; i++) {
      factorial *= i;
    } return factorial;
  }
}
