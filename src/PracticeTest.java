import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  @Test
  public void mostCommonTimeEfficientTest() {
      Practice practice = new Practice();
      int[] nums = {1, 5, 5, 6, 6, 6, 7};
      int test = practice.mostCommonTimeEfficient(nums);
      assertEquals(test, 6);
  }

  @Test
  public void mostCommonTimeEfficientTestTie() {
      Practice practice = new Practice();
      int[] nums = {1, 5, 5, 5, 6, 6, 6, 7};
      int test = practice.mostCommonTimeEfficient(nums);
      assertEquals(test, 5);
  }
}
