/*
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
 */

package exercise.company;

public class Flower extends Plants {

  Flower(String color, String flower) {
    this.color = color;
    this.waterLevel = 0;
    this.plus = 0.75;
    this.waterMin = 5;
    this.type = "flower";
  }
}


