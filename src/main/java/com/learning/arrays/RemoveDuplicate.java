package com.learning.arrays;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer to track the position of the next unique element

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; // Assign the element to the k-th position and increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNumber of unique elements: " + k);
    }
}