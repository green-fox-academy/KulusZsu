// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the original list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

import java.util.ArrayList;

public class SecondTrialExam4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(takeSecondElements(list));
  }

  public static ArrayList takeSecondElements(ArrayList list) {
    ArrayList<Integer> secondElementList = new ArrayList<Integer>();

    for (int i = 1; i < list.size(); i++) {
      if (i % 2 == 0) {
        secondElementList.add(i);
      }
    } return secondElementList;
  }

}
