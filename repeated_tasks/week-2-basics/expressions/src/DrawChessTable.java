// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {
    public static void main (String[] args) {

        String row1 = "% % % % ";
        String row2 = " % % % %";

        for (int i = 0; i < 4; i++) {
            System.out.println(row1);
            System.out.println(row2);
        }
    }
}
