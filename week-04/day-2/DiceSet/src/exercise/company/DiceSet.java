package exercise.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {

        DiceSet diceSet = new DiceSet();
        //System.out.println(diceSet.getCurrent());
        //System.out.println(diceSet.roll());
        //System.out.println(diceSet.getCurrent());
        //System.out.println(diceSet.getCurrent(5));
        //diceSet.reroll();
        //System.out.println(diceSet.getCurrent());
        //diceSet.reroll(4);
        //System.out.println(diceSet.getCurrent());

        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

        for(int i = 0; i < diceSet.getCurrent().length; i++) {
            while(diceSet.dices[i] != 6) {
                diceSet.reroll(i);
            }
        }
        System.out.println(Arrays.toString(diceSet.getCurrent()));

    }
}