package exercise.company;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  Student() {
    super();
    this.previousOrganization = " The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super();
    this.previousOrganization = previousOrganization;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization +
        " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    numberOfDays++;
  }

  public Student clone() {
    return this;
  }
}


