/*
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4
 */

package exercise.company;

public class Tree extends Plants {

  Tree(String color, String type) {
    this.color = color;
    this.waterLevel = 0;
    this.plus = 0.4;
    this.waterMin = 10;
    this.type = "tree";
  }
}
