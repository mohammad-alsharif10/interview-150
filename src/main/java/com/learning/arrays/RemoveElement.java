package com.learning.arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of the next element to keep

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Assign the element to the k-th position and increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Array after removal:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNumber of elements not equal to " + val + ": " + k);
    }
}
