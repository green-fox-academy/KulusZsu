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

public class PrintParams2 {

  public static void main(String[] args) {
    printParams("first", "second", "third", "fourth");
  }

  public static void printParams(String... params) {
    for (int i = 0; i < params.length; i++) {
      System.out.println(params[i] + "");
    }
  }
}
