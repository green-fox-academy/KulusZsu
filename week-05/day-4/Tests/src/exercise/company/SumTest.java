
package exercise.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void SumTest() {
    Sum mySum = new Sum(3);
    assertEquals(6, mySum.sum());
  }
}

