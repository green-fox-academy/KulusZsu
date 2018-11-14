package exercise.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
        Student schoolgirl = new Student();
        Teacher schoolteacher = new Teacher();

        schoolgirl.question(new Teacher());
        schoolteacher.teach(new Student());
  }
}
