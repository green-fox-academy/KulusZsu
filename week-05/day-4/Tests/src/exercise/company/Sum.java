package exercise.company;

import java.util.ArrayList;

public class Sum {

  ArrayList<Integer> listOfNums;

  public Sum() {
    this.listOfNums = new ArrayList<>();          //empty constructor, empty array list will be created
    listOfNums.add(null);
  }

  public Sum(int numOfElements) {               //constructor, which in iterating all the elements and give them backa
    for (int i = 0; i < numOfElements; i++) {
      this.listOfNums.add(i);
    }
  }

  public Object sum() {                            //method which summarizes the numbers in the list
    int result = 0;
    if (this.listOfNums.get(0) == null) {
      return null;
    } else
      for (int i = 0; i < this.listOfNums.size(); i++) {
        result += i;
      }
    return result;
  }
}
