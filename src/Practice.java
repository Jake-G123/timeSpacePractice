import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  // Time Complexity: o(n)
  // Space Complexity: o(n)
  // n is array length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // n is matrix length
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: o(n)
  // Space Complexity: 0(n)
  // n is array length
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: o(n^2)
  // Space Complexity: o(n)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    HashMap<Integer, Integer> mostCommonMap = new HashMap<>();
    int mostCommonNum = nums[0];
    for (int i : nums) {
      if (mostCommonMap.containsKey(i)) {
          mostCommonMap.put(i, (mostCommonMap.get(i)) + 1);
          if (mostCommonMap.get(i) > mostCommonMap.get(mostCommonNum)) {
            mostCommonNum = i;
          }
      } else {
        mostCommonMap.put(i, 1);
      }
    }
    return mostCommonNum;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int mostCommon = nums[0];
    int mostCommonTally = 0;
    for (int x : nums) {
      int currentTally = 0;

      // adding to currentTally (even if a tally for this number has already been done not sure how to improve right now)
      for (int y : nums) {
        if (y == x) {
          currentTally++;
        }
      }

      if (currentTally > mostCommonTally) {
        mostCommon = x;
        mostCommonTally = currentTally;
      }
    }
    return mostCommon;
  }
}