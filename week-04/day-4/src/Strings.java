// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class Strings {

  public static void main(String[] args) {
    System.out.println(changeLetter("xantal"));
  }

  public static String changeLetter (String txt) {
    if (txt.length() < 1) {
      return txt;
    } else {
      String change = txt.replace("x", "y");
      return change + changeLetter(txt.substring(1));
    }
  }
}

