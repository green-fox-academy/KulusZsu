/*
Write a method which takes two matrices as parameters and returns a new matrix.
The method should compare each element in the input matrices and fill the returned matrix with the greater values.
You only have to deal with square matrices. A square matrix is a matrix with the same number of rows and columns.
Write 2 different test cases for the method.
 */


public class Matrix {
  public static void main(String[] args) {
    int[][] matrixOne = {
        {2, 1},
        {0, 1}
    };

    int[][] matrixTwo = {
        {0, 3},
        {-1, 1},
    };
    compareMatricies(matrixOne, matrixTwo);           // comparing the two matricies
  }

  public static int[][] compareMatricies(int[][] matrixOne, int[][] matrixTwo) {

    int[][] greatestValues = {{0, 0}, {0, 0}};        // create 'empty' two dimensional matrix
                                                      // which will be loaded with the results

    for (int i = 0; i < matrixOne.length; i++) {      // first matrix iteration
      for (int j = 0; j < matrixTwo.length; j++) {    // second matrix iteration
        if (matrixOne[i][j] >= matrixTwo[i][j]) {     // if the number in matrixOne is higher (or equal) than in matrixTwo
          greatestValues[i][j] = matrixOne[i][j];     // then get the number in the empty matrix
        } else {
          greatestValues[i][j] = matrixTwo[i][j];     // other case get the numbers from matrixTwo
        }System.out.println(greatestValues[i][j]);    // printing numbers from the created new matrix
      }
    }
    return greatestValues;                            // return with the new matrix with the greatest numbers in it
  }
}
