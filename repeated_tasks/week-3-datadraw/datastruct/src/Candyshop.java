// Accidentally we added "2" and "false" to the list.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the lines
// Create a method called sweets() which takes the list as a parameter.

// Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

import java.util.*;

public class Candyshop {
  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    System.out.println(sweets(arrayList));
  }

  public static ArrayList<Object> sweets(ArrayList<Object> right) {

    for (int i = 0; i < right.size(); i++) {
      if (right.get(i).equals(2)) {
        right.set(i, "Croassan");
      }
      if (right.get(i).equals("false")) {
        right.set(i, "Ice Cream");
      }
    }
    return right;
  }
}
