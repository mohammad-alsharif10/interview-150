package com.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

//
//    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.


    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a map to keep track of the count of each character in the magazine
        Map<Character, Integer> letterCount = new HashMap<>();

        // Populate the map with characters from the magazine
        for (char c : magazine.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        // Check each character in the ransomNote
        for (char c : ransomNote.toCharArray()) {
            // If the character is not present in the map or its count is zero, return false
            if (letterCount.getOrDefault(c, 0) == 0) {
                return false;
            }
            // Decrement the count of the character in the map
            letterCount.put(c, letterCount.get(c) - 1);
        }

        // If all characters in the ransomNote are found in the magazine, return true
        return true;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        RansomNote solution = new RansomNote();

        // Define test cases and print the results
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(solution.canConstruct(ransomNote, magazine)); // Output: false

        ransomNote = "aa";
        magazine = "ab";
        System.out.println(solution.canConstruct(ransomNote, magazine)); // Output: false

        ransomNote = "aa";
        magazine = "aab";
        System.out.println(solution.canConstruct(ransomNote, magazine)); // Output: true
    }

}
