package main.java.music;

//Electric Guitar (6 strings, "Twang")

public class ElectricGuitar extends StringedInstrument {

  ElectricGuitar() {
    super.numberOfStrings = 6;
  }

  ElectricGuitar(int numOfString) {
    super.numberOfStrings = numOfString;
  }

  public String sound() {
    return "Twang";
  }

  public void play() {
    System.out.println("ElectricGuitar, a " + numberOfStrings + " stringed instrument that goes " + this.sound());
  }
}

