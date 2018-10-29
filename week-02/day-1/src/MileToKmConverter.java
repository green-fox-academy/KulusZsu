import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        double km;
        double mile;

        System.out.println("Please give me the distance in KiloMeters (integer number needed): ");
        km = scanner.nextDouble();

        mile = (km * 0.6214);

        System.out.println("Your KiloMeters in Mile is: " + mile);
    }
}
