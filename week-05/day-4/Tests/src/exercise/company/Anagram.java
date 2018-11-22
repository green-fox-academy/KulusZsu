package exercise.company;

//        Exercise
//        Create a function named is anagram following your current language's style guide.
//        It should take two strings and return a boolean value depending on whether its an anagram or not.

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {

    System.out.println(anagram("alma", "amla"));
  }

  public static boolean anagram(String a, String b) {
    boolean isAnagram = true;
    if (a.length() != b.length()) {
      isAnagram = false;
    } else {
      a = a.toLowerCase();
      b = b.toLowerCase();

      char[] firstArray = a.toCharArray();
      char[] secondArray = b.toCharArray();
      Arrays.sort(firstArray);
      Arrays.sort(secondArray);
      String sortedA = new String(firstArray);
      String sortedB = new String(secondArray);

      if ((sortedA.contentEquals(sortedB) != true)) {
        isAnagram = false;
      }

    }
    return isAnagram;
  }
}
