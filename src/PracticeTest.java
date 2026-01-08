import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  /** Test for mostCommonTimeEfficient */
  @Test
  public void testMostCommonEasy() {
    int [] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
    
    int result = Practice.mostCommonTimeEfficient(nums);

    assertEquals(5, result); // 5 is the most common frequency
  }

  @Test
  public void testMostCommonTieBreak() {
    int [] nums = {2, 1, 2, 1};

    int result = Practice.mostCommonTimeEfficient(nums);

    assertEquals(2, result); // Both have a frequency of 2 but the number 2 shows up first. 
  }

  @Test
  public void testASingleElement() {
    int [] nums = {42};

    int result = Practice.mostCommonTimeEfficient(nums);

    assertEquals(42, result);
  }


  @Test
  public void testCommonSpaceEfficent(){
    int [] nums = {2,5,6,8,3,8,8,8,2,2,6,7,3};

    int result = Practice.mostCommonSpaceEfficient(nums);

    assertEquals(8, result);
  }
}
