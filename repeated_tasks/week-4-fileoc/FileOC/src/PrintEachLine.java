// Write a program that opens a file called "my-file.txt", then prints
// each of the lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
  public static void main(String[] args) {
    Path filePath = Paths.get("source/my-file.txt");

    try {
      for(String lines : Files.readAllLines(filePath))
      System.out.println(lines);
    } catch (Exception ex) {
      System.out.println("Sorry, I can't read the lines!");
    }
  }
}
