import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give meg the distance in KM!");
        int distance = scanner.nextInt();

        double distinmile = (distance * 0.62);

        System.out.println("The distance in Miles: " + distinmile);
    }
}
