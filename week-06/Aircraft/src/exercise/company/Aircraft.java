package exercise.company;

public class Aircraft {
  private int currAmmo;
  private int maxAmmo;
  private int baseDemage;

  Aircraft(int ammo, int baseDemage) {
    this.maxAmmo = 300;
    this.baseDemage = baseDemage;
    this.currAmmo = 0;
  }

  public int fight() {

    return this.demage;
  }

  public int refill(int number) {
    if ((this.currAmmo + number) < maxAmmo) {
      this.currAmmo += number;
      return this.currAmmo;
    } else if (maxAmmo <= (this.currAmmo + number)) {
      this.currAmmo += (maxAmmo - number);
      return this.currAmmo;
    } else System.out.println("You don't need ammo, you'are full!");
    return this.currAmmo;
  }

  public String getType(String type) {
    return type;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + currAmmo + " Base Demage: " + baseDemage + " All demage: " + demage;

  }

  public boolean isPriority() {

  }
}


