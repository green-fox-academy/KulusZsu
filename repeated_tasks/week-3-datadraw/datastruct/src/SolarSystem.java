// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.

// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

import java.util.*;

public class SolarSystem {
  public static void main(String... args) {

    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

    System.out.println(putSaturn(planetList));
  }

  public static ArrayList<String> putSaturn(ArrayList<String> planetList) {

    planetList.add(planetList.indexOf("Uranus"), "Saturn");
    return planetList;
  }
}