package exercise.company;

import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> shipCrew = new ArrayList<>();
  private int captainIndex = 0;

  Ship() {
  }

  public void fillShip() {
    int crewSize = 5 + (int) (Math.random() * 26);
    for (int i = 0; i < crewSize; i++) {
      shipCrew.add(new Pirate());
    }
    Pirate captain = new Pirate();
    shipCrew.add(captain);
  }

  private int crewAlive() {
    int crewAlive = 0;
    for (int i = 0; i < shipCrew.size(); i++) {
      if (shipCrew.get(i).isAlive) {
        crewAlive++;
      }
    }
    return crewAlive;
  }

  private int captainsRum() {
    return shipCrew.get(captainIndex).drinksHad;
  }

  public String toString() {
    String returnText = "";
    if (shipCrew.get(captainIndex).isAlive) {
      returnText += "The captain is alive ";
      if (shipCrew.get(captainIndex).isConscious) {
        returnText += "and awake." + System.lineSeparator();
      } else {
        returnText += "but passed out." + System.lineSeparator();
      }
      if (captainsRum() == 0) {
        returnText += "The captain is sober!!! Is the rum all gone?" + System.lineSeparator();
      } else {
        returnText += "The captain had " + captainsRum() + " rum." + System.lineSeparator();
      }
      if (shipCrew.get(captainIndex).pet != "") {
        returnText += "The captain also has a pet " + shipCrew.get(captainIndex).pet + "." + System.lineSeparator();
      }
    } else {
      returnText += "The captain is dead!" + System.lineSeparator();
    }
    returnText += "The ship has " + crewAlive() + " alive crew members." + System.lineSeparator();
    return returnText;
  }

  /*
  Ships should have a method to battle other ships: ship.battle(otherShip)
  should return true if the actual ship (this) wins
  the ship should win if its calculated score is higher
  calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
  The loser crew has a random number of losses (deaths).
  The winner captain and crew has a party, including a random number of rum :)
   */

  public void winnerCelebration() {
    for (int i = 0; i < shipCrew.size() - 1; i++) {
      if (shipCrew.get(i).isAlive && shipCrew.get(i).isConscious)
        shipCrew.get(i).drinksHad += (int) (Math.random() * 6);
    }
  }

  public boolean battle(Ship opponent) {
    int score = crewAlive() - captainsRum() - opponent.crewAlive() + opponent.captainsRum();
    if (score > 0) {
      this.winnerCelebration();
    }
    for (int i = 0; i < crewAlive() - 1; i++) {
      shipCrew.get(i).drinksHad += (int) (Math.random() * 6);
    }
    for (int i = 0; i < opponent.crewAlive() - 1; i++) {
      opponent.shipCrew.get(i).isAlive = Math.random() * 2 >= 1;
    }
  } else{
    for(int i=0;i<opponent.crewAlive()-1;i++){
    opponent.shipCrew.get(i).drinksHad+=(int)(Math.random()*6);
    }
    for(int i=0;i<crewAlive()-1;i++){
    shipCrew.get(i).isAlive=Math.random()*2>=1;
    }
    }
    return score>0;
    }
    }

