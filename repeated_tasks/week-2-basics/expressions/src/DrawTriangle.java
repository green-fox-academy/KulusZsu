// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");

        String star = "*";
        int num = scanner.nextInt();

        for (int i = 1; i < num + 1; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
