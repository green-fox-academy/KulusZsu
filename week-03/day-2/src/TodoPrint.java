import javax.swing.*;
import java.util.StringJoiner;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String first = "My todo:\n";
        String third = " - Download games\n";
        String fourth = "    - Diablo\n";

        StringBuilder extra = new StringBuilder(todoText);
        extra.insert(0, first);
        todoText = extra.toString();

        StringBuilder list = new StringBuilder(todoText);
        list.append(third + fourth);
        todoText = list.toString();

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
