// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


public class SumDigit {

  public static void main(String[] args) {
    System.out.println(reCursiveSum(126));
  }

  public static int reCursiveSum(int n) {
    if (n > 0) {
      // it works with 3 digits only: return reCursiveSum(n % 10) + (n % 10) + (n / 10 % 10);
      return reCursiveSum(n / 10) + n % 10;  //this is from scerios, this works undependently the digits
    } else {
     return n;
    }
  }
}

