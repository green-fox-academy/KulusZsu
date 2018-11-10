// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me 5 number in the next row:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int sum = (num1 + num2 + num3 + num4 + num5);
        double avg = (num1 + num2 + num3 + num4 + num5) / 5.;

        System.out.print("Sum: " + sum + ", Average: " + avg);

    }
}