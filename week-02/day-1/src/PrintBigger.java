// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Please give me two numbers:");

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("The bigger is the second one, which was: " + number2);
        }
        if (number1 > number2) {
            System.out.println("The bigger is the first one, which was: " + number1);
        }
    }
}
