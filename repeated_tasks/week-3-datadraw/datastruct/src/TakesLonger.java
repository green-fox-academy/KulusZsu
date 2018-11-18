// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
  public static void main(String... args){

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String missing = " always takes longer than ";

    StringBuilder expand = new StringBuilder(quote);

    expand.insert(21, missing);

    quote = expand.toString();

    System.out.println(quote);
  }
}
