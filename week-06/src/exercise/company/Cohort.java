package exercise.company;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  Cohort() {

  }

  Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student inputStudent) {
    students.add(inputStudent);
  }

  public void addMentor(Mentor inputMentor) {
    mentors.add(inputMentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() +
        " students and " + mentors.size() + " mentors.");
  }
}
