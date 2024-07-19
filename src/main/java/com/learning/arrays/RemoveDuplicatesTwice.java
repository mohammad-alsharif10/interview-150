package com.learning.arrays;

public class RemoveDuplicatesTwice {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // Start from the third element, as the first two can always be included

        // Traverse the array starting from the third element
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is different from the element two positions before it
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i]; // Assign the element to the k-th position and increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};

        int k = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNumber of elements after removal: " + k);
    }
}
