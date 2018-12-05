import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatricesTest {

  private Matrices matrices = new Matrices();

  private int[][] testInput1 = {
      {3, 6, 9},
      {6, 9, 8},
      {4, 7, 2}
  };
  private int[][] testInput2 = {
      {8, 5, 4},
      {6, 2, 1},
      {9, 4, 1}
  };

  @Test
  public void outPutElement() {
    int[][] testOutPut = matrices.matrices(testInput1,testInput2);
    assertEquals(9,testOutPut[0][2]);
  }

  @Test
  public void checkIfTrue() {
    int[][] testOutPut = matrices.matrices(testInput1,testInput2);
    assertEquals(false, testOutPut.length == 5);
  }
}
