package com.learning.arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the rest of the array
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
