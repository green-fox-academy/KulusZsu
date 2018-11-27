// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

package exercise.company;

import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("The number of your integers: ");
    int numberOfIntegers = input.nextInt();

    int sum = 0;

    for (int i = 1; i <= numberOfIntegers; i++) {
      System.out.println("Please give me the integer number: " + i);
      Scanner input2 = new Scanner(System.in);
      int numbers = input2.nextInt();
      sum += numbers;
    }
    System.out.println("SUM: " + sum);
    System.out.println("AVG: " + ((double)sum/numberOfIntegers));
  }
}
