import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the number of the chickens:" );
        int chickens = scanner.nextInt();

        System.out.println("Please give me the number of the pigs:" );
        int pigs = scanner.nextInt();

        int chicklegs = chickens * 2;
        int piglegs = pigs * 4;
        int sum = chicklegs + piglegs;

        System.out.print("Your chickens and pigs have together: " + sum + " legs.");

    }
}
