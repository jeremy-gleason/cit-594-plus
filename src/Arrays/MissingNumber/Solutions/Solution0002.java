package Arrays.MissingNumber.Solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Missing Number | Leetcode #0268 | Easy
 * https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

/**
 * Solution Notes by _______
 *
 */

public class Solution0002 {

  public static int missingNumber(int[] nums) {
    int[] vals = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      int val = nums[i];
      vals[val] = 1;
    }
    for (int i = 0; i < vals.length; i++) {
      if (vals[i] == 0) return i;
    }
    return -1;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 3, 0, 1 };
    assertEquals(2, missingNumber(nums1));

    int[] nums2 = { 0, 1 };
    assertEquals(2, missingNumber(nums2));

    int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    assertEquals(8, missingNumber(nums3));

    int[] nums4 = { 0 };
    assertEquals(1, missingNumber(nums4));

  }

}
