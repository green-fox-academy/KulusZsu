package exercise.company;

public class Teacher {

// Teacher
// teach(student) -> calls the students learn method
// answer()

  public Teacher() {
  }

  public void teach(Student student) {
    System.out.println("What would you like to know?");
    student.learn();
  }

  public void answer() {
  }
}
