// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(aj));
                                                  // from the stackowerflow
    for (int i = 0; i < aj.length / 2; i++) {     // for loop for examining all the elements of the aj
      int temp = aj[i];                           // temporary temp to the array for loop
      aj[i] = aj[aj.length - i - 1];              // swapping the elements until reaching the midpoint
      aj[aj.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(aj));
  }
}
