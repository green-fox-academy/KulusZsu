package Sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie one = new Sharpie("blue", 50);
    one.use();
    one.use();

    Sharpie two = new Sharpie("yello", 30);
    two.use();

    System.out.println(one.inkAmount + " " + one.color + " " + one.width);
    System.out.println(two.inkAmount + " " + one.color + " " + one.width);
  }
}
