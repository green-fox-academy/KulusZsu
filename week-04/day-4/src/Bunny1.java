// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {

  public static void main(String[] args) {
    System.out.println(ear(6));
  }

  public static int ear(int bunny) {
    if (bunny > 0) {
      return 2 + ear(bunny - 1);
    }
    return 0;
  }
}
