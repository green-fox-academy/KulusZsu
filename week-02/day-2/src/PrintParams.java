//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class PrintParams {

    public static int sum(int... numbers) {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        sum(2, 4);
        sum(2,3,4);
        sum(2,3,4,5,6,10,67);
    }
}
