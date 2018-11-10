// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me two numers!");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Bigger is: " + num2);
        }
        else if (num1 > num2) {
            System.out.println("Bigger is " + num1);
        }
        else {
            System.out.println("Same numbers!");
        }

    }
}
