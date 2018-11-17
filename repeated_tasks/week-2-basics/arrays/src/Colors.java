// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

import java.util.Arrays;
                                // I dont have a clue about what this task wants from me... bad task defining
public class Colors {

  public static void main(String[] args) {

    String[][] rainbow = {
        {"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"},
    };
    System.out.println(rainbow[0][0] + " " + rainbow[0][3]);
  }
}
