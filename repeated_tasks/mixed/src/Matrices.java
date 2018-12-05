public class Matrices {

  public int[][] matrices(int[][] input1, int[][] input2) {

    int[][] arrayOfGreaterInts = new int[input1.length][input1.length];

    for (int i = 0; i < input1.length; i++) {
      for (int j = 0; j < input1.length; j++) {
        if (input1[i][j] > input2[i][j]) {
          arrayOfGreaterInts[i][j] = input1[i][j];
        } else {
          arrayOfGreaterInts[i][j] = input2[i][j];
        }
      }
    }
    return arrayOfGreaterInts;
  }
}

