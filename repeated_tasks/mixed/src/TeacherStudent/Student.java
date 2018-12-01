package TeacherStudent;

public class Student {

  public Student() {
  }

  public void learn() {
    System.out.println("method learn");
  }

  public void question(Teacher teacher) {
    String question = "I don't understand this, what can I do?";
    System.out.println(question);
    teacher.answer();
  }

}
