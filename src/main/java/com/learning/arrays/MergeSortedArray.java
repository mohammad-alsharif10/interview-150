package com.learning.arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling from the end of nums1 array
        int i = m - 1;  // Last element in nums1's valid part
        int j = n - 1;  // Last element in nums2
        int k = m + n - 1;  // Last position in nums1

        // Traverse nums1 and nums2 from the end and merge them
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 is not fully traversed, add remaining elements to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to check for i >= 0 because elements are already in place in nums1
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
