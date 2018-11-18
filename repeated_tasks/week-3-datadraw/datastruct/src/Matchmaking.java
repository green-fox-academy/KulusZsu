// Write a method that joins the two lists by matching one girl with one boy into a new list
// If someone has no pair, he/she should be the element of the list too
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

import java.util.*;

public class Matchmaking {
  public static void main(String... args) {

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < girls.size(); i++) {
      result.add(girls.get(i));
      result.add(boys.get(i));
    }
    return result;
  }
}
