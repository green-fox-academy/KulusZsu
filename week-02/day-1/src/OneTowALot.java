// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

import java.util.Scanner;

public class OneTowALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Pease give me a number:");

        number = scanner.nextInt();

        if (number == 0 || number < 0) {
            System.out.println("Not enough");
        }
        if (number == 1) {
            System.out.println("One");
        }
        if (number == 2) {
            System.out.println("Two");
        }
        if (number > 2) {
            System.out.println("A lot");
        }

    }
}
