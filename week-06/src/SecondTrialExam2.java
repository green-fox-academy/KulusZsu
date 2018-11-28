// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the original list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

import java.util.ArrayList;

public class SecondTrialExam2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(function(list));
  }

  public static ArrayList function(ArrayList<Integer> list) {
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    ArrayList<Integer> selectedList = new ArrayList<Integer>();

    for (int i = 1; i < list.size(); i++) {
      if (i % 2 == 0) {
        selectedList.add(i);
      }
    } return selectedList;
  }
}
