package Arrays.TwoSum.Solutions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Two Sum | Leetcode #0001 | Medium
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

/**
 * Solution Notes by _______
 *
 */

public class Solution0002 {

    public static int[] twoSum(int nums[], int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    @Test
    public static void main(String[] args) {

        int[] nums1 = { 2, 7, 11, 15 };
        int[] result1 = twoSum(nums1, 9);
        Arrays.sort(result1); // Sort to ensure assert works
        int[] expected1 = { 0, 1 };
        assertArrayEquals(expected1, result1);

        int[] nums2 = { 3, 2, 4 };
        int[] result2 = twoSum(nums2, 6);
        Arrays.sort(result2); // Sort to ensure assert works
        int[] expected2 = { 1, 2 };
        assertArrayEquals(expected2, result2);

        int[] nums3 = { 3, 3 };
        int[] result3 = twoSum(nums3, 6);
        Arrays.sort(result3); // Sort to ensure assert works
        int[] expected3 = { 0, 1 };
        assertArrayEquals(expected3, result3);

    }
}
