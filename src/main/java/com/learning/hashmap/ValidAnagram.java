package com.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a map to count the frequency of each character in s
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate over each character in s and update the frequency map
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate over each character in t
        for (char c : t.toCharArray()) {
            // If the character is not in the map or its count is zero, return false
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            // Decrement the count of the character in the map
            charCount.put(c, charCount.get(c) - 1);
        }

        // If all characters match, return true
        return true;
    }


    public static void main(String[] args) {
        // Create an instance of the Solution class
        ValidAnagram solution = new ValidAnagram();

        // Test cases
        System.out.println(solution.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(solution.isAnagram("rat", "car")); // Output: false
    }
}
