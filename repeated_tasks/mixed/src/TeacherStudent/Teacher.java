package TeacherStudent;

public class Teacher {

  public Teacher() {
  }

  public void teach(Student student) {
    String sentence = "You have to learn much more!";
    System.out.println(sentence);
    student.learn();
  }

  public void answer() {
    System.out.println("method answer");
  }

}
