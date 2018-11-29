package exercise.company;

public class Helicopter extends Vehicle implements Flyable{

  @Override
  public void land() {
    System.out.println("This is land-method");
  }

  @Override
  public void fly() {
    System.out.println("This is fly-method");
  }

  @Override
  public void takeOff() {
    System.out.println("This is takeOff method");
  }
}
