package exercise.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Station station = new Station();
    Car taxi = new Car();

    taxi.capacity = 10;
    taxi.cargasAmount = 40;

    station.refill(taxi);

    System.out.println(taxi.cargasAmount);
    System.out.println(taxi.capacity);
  }
}
