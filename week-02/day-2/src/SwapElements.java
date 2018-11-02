// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Arrays;
public class SwapElements {

    public static void main(String[] args) {

        String[] abc = new String[]{"first", "second", "third"};
        System.out.println(Arrays.toString(abc));

        String[] swap = {abc[2], abc[1], abc[0]};
        System.out.println(Arrays.toString(swap));
        }
    }

