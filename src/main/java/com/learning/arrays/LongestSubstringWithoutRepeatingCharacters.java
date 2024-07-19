package com.learning.arrays;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

//    Given a string s, find the length of the longest
//            substring
//    without repeating characters.

    public int lengthOfLongestSubstring(String s) {
        // Get the length of the input string
        int n = s.length();

        // Initialize the left pointer of the sliding window
        int left = 0;

        // Initialize the maximum length of the substring
        int maxLength = 0;

        // Initialize a set to keep track of characters in the current window
        HashSet<Character> set = new HashSet<>();

        // Iterate through the string with the right pointer of the sliding window
        for (int right = 0; right < n; right++) {
            // While the character at the right pointer is already in the set
            while (set.contains(s.charAt(right))) {
                // Remove the character at the left pointer from the set
                set.remove(s.charAt(left));

                // Move the left pointer to the right
                left++;
            }

            // Add the character at the right pointer to the set
            set.add(s.charAt(right));

            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Return the maximum length of the substring
        return maxLength;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // Define the input string
        String s = "bcaade";

        // Call the method and print the result
        System.out.println(solution.lengthOfLongestSubstring(s)); // Output: 3
    }
}
