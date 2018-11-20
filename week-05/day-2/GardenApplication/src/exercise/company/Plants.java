package exercise.company;

public class Plants {

  String color;
  double waterLevel;
  double plus;
  double waterMin;
  String type;

  public Plant() {
    waterLevel = 0;
  }

  public boolean isItThirtsty() {
    return (waterLevel < waterMin);
  }

  public void plantStat() {
    if (isItThirtsty()) {
      System.out.println("The " + color + " "type + " needs water");
    } else {
      System.out.println("The " + color + " "type + " doesn't need water");
    }
  }

  public void waterAdd(double waterAmt) {
    waterLevel += plus * waterAmt;
  }
}
