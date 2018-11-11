//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int num = scanner.nextInt();
        System.out.println("The factorial of your given number is: " + factorio(num));
    }
    public static int factorio(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact *i;
        }
        return fact;
    }
}