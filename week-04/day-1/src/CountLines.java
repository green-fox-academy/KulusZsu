// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;


public class CountLines {

  public static void main(String[] args) {
    System.out.println(lineCounter("hfhfh.txt"));
  }

  public static int lineCounter (String filename) {
    Path source = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(source);
      int linecount = lines.size();
      return linecount;
    } catch (IOException e) {
      return 0;
    }
  }

}