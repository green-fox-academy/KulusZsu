// példa kezeletlen hibaüzenetre!

import java.util.Scanner;

public class UnhandledException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

    int result = 12 / divisor; // If the input value for divisor was 0 the program breaks
    System.out.println(result); // The program doesn't reach this line if the input was 0
  }
}

/* kezeletlen hiba, mert ha a user 0-t ad meg, akkor értelmetlen az osztás, alábbi hibaüzenet jelzi:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at UnhandledException.main(UnhandledException.java:8)
 */