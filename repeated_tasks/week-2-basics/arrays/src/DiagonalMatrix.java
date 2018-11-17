// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class DiagonalMatrix {                             // resolution from Andi

  public static void main(String[] args) {

    int[][] matrix = new int[4][4];                       // creating two Array (2D) with 4-4 element (row and columns)

    for (int i = 0; i < matrix.length; i++) {             // go through the length of the rows
      for (int j = 0; j < matrix[i].length; j++) {        // go through the length of the columns
        if (i == j) {                                     // in case row and column are egal there will be a '1'
          matrix[i][j] = 1;
        }
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
