// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Please give me a number:");

        number = scanner.nextInt();

        if (number % 2 == 0) {System.out.println("This number is: Odd");}
        if (number % 2 == 1) {System.out.println("This number is: Even");}

    }
}



