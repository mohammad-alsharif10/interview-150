package com.learning.arrays;

public class MinSubArrayLen {

//
//    209. Minimum Size Subarray Sum
//    Given an array of positive integers nums and a positive integer target, return the minimal length of a
//            subarray
//    whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    public int minSubArrayLen(int target, int[] nums) {

        // Get the length of the input array
        int n = nums.length;

        // Initialize the left pointer of the sliding window
        int left = 0;

        // Initialize the current sum of the sliding window
        int currSum = 0;

        // Initialize the minimum length of the subarray to a large value
        int minLength = Integer.MAX_VALUE;

        // Iterate through the array with the right pointer of the sliding window
        for (int right = 0; right < n; right++) {
            // Add the current element to the current sum
            currSum = currSum + nums[right];

            // While the current sum is greater than or equal to the target
            while (currSum >= target) {
                // Update the minimum length of the subarray
                minLength = Math.min(minLength, right - left + 1);

                // Subtract the element at the left pointer from the current sum
                currSum = currSum - nums[left];

                // Move the left pointer to the right
                left++;
            }
        }

        // If the minimum length was updated, return it, otherwise return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        MinSubArrayLen solution = new MinSubArrayLen();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(solution.minSubArrayLen(target, nums)); // Output: 2
    }
}
