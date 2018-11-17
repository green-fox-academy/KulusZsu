//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Sum2 {

  public static void main(String[] args) {
    System.out.println(sum(4));
  }

  public static int sum(int num) {
    int sum = 0;
    for (int i = 0; i < num; i++) {
      sum += i;
    } return sum;
  }
}
