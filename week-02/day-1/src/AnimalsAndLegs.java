import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        double chicks;
        double pigs;
        double chicklegs;
        double piglegs;

        System.out.println("Please give me the number of your Chickens: ");
        chicks = scanner.nextDouble();

        chicklegs = (chicks * 2);

        System.out.println("Please give me the number of your Pigs: ");
        pigs = scanner.nextDouble();

        piglegs = (pigs * 4);

        System.out.println("All the legs of your animals: " + (chicklegs + piglegs));
    }
}