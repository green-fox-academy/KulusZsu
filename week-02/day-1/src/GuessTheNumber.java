// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 8;

        System.out.println("Guess the number 1-10!");

        for (int i = 0; i < 10; i++ ) {
            int number2 = scanner.nextInt();

            if (number1 < number2) {
                System.out.println("The stored number is lower");
            }
            else if (number1 > number2) {
                System.out.println("The stored number is higher");
            }
            else {
                System.out.println("You found the number: " + number1);
            }
        }
    }
}

