package com.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();



        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // If it exists, return the indices of the complement and the current number
                return new int[] { numMap.get(complement), i };
            }

            // Add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        TwoSum solution = new TwoSum();

        // Define an array of integers and a target sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Find and print the indices of the two numbers that add up to the target
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}
