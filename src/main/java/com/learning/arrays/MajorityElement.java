package com.learning.arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = findCandidate(nums);
        return candidate;
    }

    // Helper function to find the candidate for the majority element
    private static int findCandidate(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int majority = majorityElement(nums);

        System.out.println("The majority element is: " + majority);
    }
}
