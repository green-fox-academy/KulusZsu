import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class matrew {

    public static void main(String[] args) {

        Path source = Paths.get("read.txt");
        Path output = Paths.get("write.txt");
        int[] numbers = {1, 2, 3, 4};
        try {
            System.out.println(numbers[5]);   /* lista 5 indexét keresnénk, de nincs olyan, tehát hiba lesz*/

        /* List<String> lines = Files.readAllLines(source);        --> beolvassa a fájlokat
        Files.write(output, lines);
        */

        } catch (IndexOutOfBoundsException e) {    /* catch kapja el a hibát és Rja ki, hogy mi az*/
            System.out.println("Index out of bounds, Err: " + e);
        } catch (Exception e) {
            System.out.println("Error happened");
        } finally {                                     /* ez mindig lefut, akkor is, ha előtte vhol hiba volt*/
            System.out.println("Finally");
        }
        System.out.println("Afterwards");
        boolean a = false;
    }
}

/*
unhandledexception
példa kezeletlen hibaüzenetre!
kezeletlen hiba, mert ha a user 0-t ad meg, akkor értelmetlen az osztás, alábbi hibaüzenet jelzi:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at UnhandledException.main(UnhandledException.java:8)

import java.util.Scanner;

public class UnhandledException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

    int result = 12 / divisor; // If the input value for divisor was 0 the program breaks
    System.out.println(result); // The program doesn't reach this line if the input was 0
  }
}

 */

/*
péda jólkezelt hibára
felhasználó helytelen értékmegadás esetén értelmezhető válaszüzenetet kap

import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        try { // Prevents the program breaking when attempting dividing by zero
            int result = 12 / divisor; // If the input value for divisor was 0 it stops the try block
            System.out.println(result); // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
        }
    }
}

*/