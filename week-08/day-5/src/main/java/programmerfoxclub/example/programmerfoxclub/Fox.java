package programmerfoxclub.example.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  List<String> tricks = new ArrayList<>();
  List<String> food = new ArrayList<>();
  List<String> drink = new ArrayList<>();

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addFox() {
  }
}
