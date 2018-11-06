import java.util.*;

public class Candyshop{

    public static ArrayList<Object> sweets(ArrayList change) {
        for (int i = 0; i < change.size(); i++) {
            if (change.get(i).equals(2)) {
                change.set(i, "Croassan");
            }
            if (change.get(i).equals(false)) {
                change.set(i, "Ice cream");
            }
        }
        return change;
    }

    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
}
