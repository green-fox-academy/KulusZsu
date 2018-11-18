// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.

// Expected output: "What I cannot create I do not understand."

import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {

    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    System.out.println(quoteSwap(list));
  }

  public static String quoteSwap(ArrayList<String> fixed) {

    Collections.swap(fixed, 2, 5);        // swapping the elements

    String quote = "";

    for (String thing : fixed) {               // creating the space after the words for-each loop

      quote += thing + " ";
    }
    return quote;
  }
}
