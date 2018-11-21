package main.java.music;

//Violin (4 strings, "Screech")

public class Violin extends StringedInstrument {

  Violin() {
    super.numberOfStrings = 4;
  }

  Violin(int numOfString) {
    super.numberOfStrings = numOfString;
  }

  public String sound() {
    return "Screech";
  }

  public void play() {
    System.out.println("Violin, a " + numberOfStrings + " stringed instrument that goes " + this.sound());
  }
}
