import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exercise.company.Apple;

public class AppleTest {

  @Test
  public void getAppleTest() {
    Apple test = new Apple();
    assertEquals("apple", test.getApple());

  }
}
