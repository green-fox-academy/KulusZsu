package exercise.company;

public class Shifter implements CharSequence {
  String string;
  int shiftnumber;

  public Shifter(String string, int shiftnumber) {
    this.string = string;
    this.shiftnumber = shiftnumber;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + shiftnumber);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}

