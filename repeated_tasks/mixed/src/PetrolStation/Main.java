package PetrolStation;

public class Main {
  public static void main(String[] args) {

    Car car = new Car(0, 100);
    Station station = new Station(350);

    station.refill(car);

    System.out.println("Station-gas after car-filling: " + station.stationGasAfterFill);
    System.out.println("Car-gas after filling: " + station.carGasAfterFill);
  }
}
