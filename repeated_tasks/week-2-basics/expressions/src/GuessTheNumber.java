// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello user, guess the number!");

        int storednum = 8;
        int num = scanner.nextInt();

        if (num < storednum) {
            System.out.println("The stored number is higher!");
        }
        else if (num > storednum) {
            System.out.println("The stored number is lower!");
        }
        else {
            System.out.println("You found the number: " + storednum);
        }
    }
}
