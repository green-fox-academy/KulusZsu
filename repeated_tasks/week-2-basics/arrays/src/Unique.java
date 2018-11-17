//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
// System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

public class Unique {

  public static void main(String[] args) {

    int[] list = {1, 11, 34, 11, 52, 61, 1, 34};
    int n = list.length;
    uniq(list, n);
  }

  public static void uniq(int[] list, int n) {
    String toReturn = " ";
    for (int i = 0; i < n; i++) {                 // Pick all elements one by one
      int j;                                      // Check if the picked element is already printed
      for (j = 0; j < i; j++)
        if (list[i] == list[j])
          break;
      if (i == j)                                  // If not printed earlier, then print it
        System.out.println(list[i] + " ");
    }
  }
}
