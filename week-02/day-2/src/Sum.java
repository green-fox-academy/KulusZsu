//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
import java.util.Scanner;
public class Sum {

    public static int sumFunction(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {
           sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Num;

        System.out.println("Please give me the number: ");

        Num = scanner.nextInt();

        System.out.println(sumFunction(Num));
    }

}
