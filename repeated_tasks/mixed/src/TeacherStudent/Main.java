package TeacherStudent;

public class Main {
  public static void main(String[] args) {
    Student studentOne = new Student();
    Teacher teacherOne = new Teacher();

    studentOne.question(teacherOne);
    teacherOne.teach(studentOne);
  }
}
