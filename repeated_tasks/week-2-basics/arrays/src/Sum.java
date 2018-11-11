//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please give me a number!");
       int num = scanner.nextInt();
       System.out.println(sum(num));
   }
   public static int sum(int num) {
       int sum = 0;
       for (int i = 0; i <= num; i++) {
            sum += i;
       }
       return sum;
   }
}

