// Create a program that prints all the even numbers between 0 and 500


public class PrintEven {

    public static void main(String[] args) {

        int numbers = 500;

        for(int i = 1; i < numbers + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
