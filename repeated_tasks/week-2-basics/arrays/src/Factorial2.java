//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial2 {

  public static void main(String[] args) {
    System.out.println(factorio(5));
  }

  public static int factorio(int fact) {
    int num = 1;
    for (int i = 1; i <= fact; i++) {
      num *= i;
    } return num;
  }
}
