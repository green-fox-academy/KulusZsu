package exercise.company;

public class Sponsor extends Person implements Cloneable {
  String company;
  int hiredStudents;

  Sponsor() {
    super();
    this.hiredStudents = 0;
    this.company = "Google";
  }

  Sponsor(String name, int age, String gender, String company) {
    super();
    this.company = company;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
