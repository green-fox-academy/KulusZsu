// - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeElement {

  public static void main(String[] args) {

    int[] s = {1, 2, 3, 8, 5, 6};
    System.out.println(Arrays.toString(s));       // this is just to see all the elements

    s[3] = 4;

    System.out.println(Arrays.toString(s));       // this is just to see all the elements (what changed)
    System.out.println(s[3]);                     // print the fourth element of the Array
  }
}
