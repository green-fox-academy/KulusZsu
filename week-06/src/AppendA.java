// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

import java.util.Arrays;

public  class AppendA {

  public static void main(String[] args) {

    String[] animals = {"koal", "pand", "zebr"};
    System.out.println(Arrays.toString(animals)); //eredeti felsorolva dobozban

    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";
      System.out.println(animals[i] + "");        //listázva
    }
    System.out.println(Arrays.toString(animals)); //felsorolva dobozban
  }
}
