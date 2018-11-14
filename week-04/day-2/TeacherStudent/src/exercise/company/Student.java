package exercise.company;

public class Student {

// Student can:
// learn()
// question(teacher) -> calls the teachers answer method

  public Student() {
  }

  public void learn() {
  }

  public void question(Teacher teacher) {
    System.out.println("I have a question, please!");
    teacher.answer();
  }
}
