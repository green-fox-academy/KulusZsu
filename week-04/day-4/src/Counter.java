// Write a recursive function that takes one parameter: n and counts down from n.
public class Counter {

  public static void main(String[] args) {
    reCursion(6);
  }

  public static void reCursion(int limit) {
    System.out.println(limit);
    if (limit == 1) {
      return;
    }
    reCursion(limit - 1);
  }
}


