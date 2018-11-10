// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int surface = 2 * ((a * b) + (b * c) + (a * c));
        int volume = a * b * c;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);


    }
}
