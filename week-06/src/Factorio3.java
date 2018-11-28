//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int number = scanner.nextInt();
    System.out.println(factorio(number));
  }

  public static int factorio(int number) {
    int factorio = 1;
    for (int i = 1; i <= number; i++) {
      factorio *= i;
    }
    return factorio;
  }
}
