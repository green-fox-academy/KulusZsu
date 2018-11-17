// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElements {

  public static void main(String[] args) {

    String[] abc = new String[] {"first", "second", "third"};
    System.out.println(Arrays.toString(abc));

    String cba = abc[0];
    abc[0] = abc[2];
    abc[2] = cba;
    System.out.println(Arrays.toString(abc));
  }
}
