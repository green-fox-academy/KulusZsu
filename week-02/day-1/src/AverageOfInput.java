// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int summary;
        double average;

        System.out.println("Please give me five numbers in a row:");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();

        summary = (num1+num2+num3+num4+num5);
        average = (num1+num2+num3+num4+num5)/5;

        System.out.println("Sum: " + summary);
        System.out.println("Average: " + average);


    }
}
