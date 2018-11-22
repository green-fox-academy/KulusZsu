// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {

    System.out.println(lineCounter("file.txt"));
  }

  public static int lineCounter(String filename) {

    Path filePath = Paths.get(filename);

    try {
      List<String> lines = Files.readAllLines(filePath);
      int count = lines.size();
      return count;
    } catch (Exception ex) {
      return 0;
    }
  }
}
