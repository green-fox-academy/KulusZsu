// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static void main (String[] args) {

    Path startFile = Paths.get("my-bigyo.txt");
    Path destFile = Paths.get("my-file.txt");

    System.out.println(copyFile(startFile, destFile));
  }

  public static boolean copyFile (Path file1, Path file2) {
    boolean isOK = false;

    try {
      List<String> cont = Files.readAllLines(file1);
      Files.write(file2, cont);
      isOK = true;
    } catch (Exception e) {
    }
    return isOK;
  }
}