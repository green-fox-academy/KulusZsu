import java.util.*;

public class AppendLetter {

    public static List<String> appendA(List<String> misslett) {
        for (int i = 0; i < misslett.size(); i++) {
            misslett.set(i, misslett.get(i) + "a");
        }
        return misslett;
    }

    public static void main(String... args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
}


// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
