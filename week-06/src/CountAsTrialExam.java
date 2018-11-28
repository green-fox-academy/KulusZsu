// Create a function that takes a string parameter,
// counts the occurrences of the letter "a", and returns it as a number.

// example: on the input "Apple" the function should return 1 - print this result
// example: on the input "Avocado" the function should return 2 - print this result
// example: on the input "Blueberry" the function should return 0 - print this result

public class CountAsTrialExam {
  public static void main(String[] args) {
    System.out.println(counterFunction("Apple"));
    System.out.println(counterFunction("Avocado"));
    System.out.println(counterFunction("Blueberry"));
  }

  public static int counterFunction(String input) {
    int countOfA = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
        countOfA++;
      }
    } return countOfA;
  }
}
