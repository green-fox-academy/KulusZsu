// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String miss1 = "My todo:\n";
    String miss2 = " - Download games\n";
    String miss3 = "     - Diablo";

    StringBuilder full = new StringBuilder(todoText);
    full.insert(0, miss1);
    todoText = full.toString();

    StringBuilder list = new StringBuilder(todoText);
    list.append(miss2 + miss3);
    todoText =list.toString();

    System.out.println(todoText);
  }
}
