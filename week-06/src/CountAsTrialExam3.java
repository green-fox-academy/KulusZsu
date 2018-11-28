// Create a function that takes a string parameter,
// counts the occurrences of the letter "a", and returns it as a number.

// example: on the input "Apple" the function should return 1 - print this result
// example: on the input "Avocado" the function should return 2 - print this result
// example: on the input "Blueberry" the function should return 0 - print this result

public class CountAsTrialExam3 {
  public static void main(String[] args) {

    String one = "Apple";
    String two = "Avocado";
    String three = "Blueberry";

    System.out.println(occurCounter(one));
    System.out.println(occurCounter(two));
    System.out.println(occurCounter(three));
  }

  public static int occurCounter(String input) {
    int countedOccurNum = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
        countedOccurNum++;
      }
    } return countedOccurNum;
  }
}
