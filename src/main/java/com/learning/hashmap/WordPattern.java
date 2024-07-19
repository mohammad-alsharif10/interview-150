package com.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        // Split the string s into words
        String[] words = s.split(" ");

        // If the number of characters in pattern and number of words in s are different, return false
        if (pattern.length() != words.length) {
            return false;
        }

        // Create two maps to track character to word mapping and word to character mapping
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        // Iterate through each character in the pattern
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i); // Character from pattern
            String word = words[i]; // Corresponding word from s

            // Check the mapping from character to word
            if (charToWord.containsKey(c)) {
                // If the mapped word is not equal to the current word, return false
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                // If no mapping exists, create one
                charToWord.put(c, word);
            }

            // Check the mapping from word to character
            if (wordToChar.containsKey(word)) {
                // If the mapped character is not equal to the current character, return false
                if (wordToChar.get(word) != c) {
                    return false;
                }
            } else {
                // If no mapping exists, create one
                wordToChar.put(word, c);
            }
        }

        // If all characters and words match correctly, return true
        return true;
    }
}
