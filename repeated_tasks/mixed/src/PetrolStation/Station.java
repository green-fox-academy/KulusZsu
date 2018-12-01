package PetrolStation;

public class Station {
  int gasAmount;
  int stationGasAfterFill;
  int carGasAfterFill;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    stationGasAfterFill = gasAmount - car.capacity;
    carGasAfterFill = car.carGasAmount + car.capacity;
  }
}
