package main.java.music;

//Bass Guitar (4 strings, "Duum-duum-duum")

public class BassGuitar extends StringedInstrument {

  BassGuitar() {
    super.numberOfStrings = 4;
    }

    BassGuitar(int numOfString) {
    super.numberOfStrings = numOfString;
    }

    public String sound() {
    return "Duum-duum-duum";
    }

  public void play() {
    System.out.println("BassGuitar, a " + numberOfStrings + " stringed instrument that goes " + this.sound());
  }
}
