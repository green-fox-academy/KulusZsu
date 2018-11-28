//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int givenNumber = scanner.nextInt();
    System.out.println(sum(givenNumber));
  }

  public static int sum(int givenNumber) {
    int countedNumbers = 0;
    for (int i = 0; i <= givenNumber; i++) {
      countedNumbers += i;
    }
    return countedNumbers;
  }
}
