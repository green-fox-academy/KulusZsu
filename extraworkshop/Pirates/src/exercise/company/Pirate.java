package exercise.company;

public class Pirate extends People implements Fightable {

  int drinksHad;                  //class alapvető jellemzője, minden egyes származtatásnak lesz ilyenje
  String pet = "";                //azért nem String pet; mert később lekérsnél könyebb kiratni (nem dob exceptiont)

  Pirate() {
    this.isAlive = true;          //super-ből örökölte ezeket (super a People), itt értéket adtunk nekik
    this.isConscious = true;
    this.fightingPower = 3;
    this.drinksHad = 0;
    this.pet = "parrot";
  }

  public void drinkSomeRun() {
    if (!this.isAlive) {
      System.out.println("He's dead!");
    }
    this.drinksHad++;
  }

  public void passedOut() {
    System.out.println("he's passed out!");
    this.isConscious = true;
  }

  /*
  howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
  0 to 4 times, "Pour me anudder!"
  else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
   */

  public void howsItGoingMate() {
    if (!this.isAlive) {
      System.out.println("He's dead!");
    } else if (this.drinksHad < 5 && this.isConscious) {
      System.out.println("Pour me anudder!");
      this.drinksHad++;
    } else if (this.isConscious) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.isConscious = false;
      this.drinksHad = 0;
    } else {
      passedOut();
    }
  }

  @Override
  public void brawl() {

  }

  @Override
  public void die() {
    this.isAlive = false;
  }
}
