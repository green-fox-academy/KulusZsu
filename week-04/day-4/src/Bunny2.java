// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {

  public static void main(String[] args) {
    System.out.println(ear(8));
  }

  public static int ear(int bunny) {
    if (bunny % 2 == 0 && bunny != 0) {                // bunny is even but not zero
      return 3 + ear(bunny - 1);                // if bunny is even add number 3
    } else if (bunny % 2 != 0 && bunny != 0) {         // bunny is odd but not zero
      return 2 + ear(bunny - 1);                // add number 2 to the odded bunnies
    } else {
      return 0;                                       // stop element
    }
  }
}
