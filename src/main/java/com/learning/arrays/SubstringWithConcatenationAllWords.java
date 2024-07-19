package com.learning.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationAllWords {

    public List<Integer> findSubstring(String s, String[] words) {
        // Initialize the result list
        List<Integer> result = new ArrayList<>();

        // Return empty result if input is invalid
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        // Get the length of each word (all words are of the same length)
        int wordLength = words[0].length();

        // Get the total number of words
        int wordCount = words.length;

        // Calculate the length of the concatenated substring
        int substringLength = wordLength * wordCount;

        // Create a map to store the frequency of each word in words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Loop through the string s to find all starting indices of concatenated substrings
        for (int i = 0; i <= s.length() - substringLength; i++) {
            // Create a map to keep track of the words seen in the current window
            Map<String, Integer> seenWords = new HashMap<>();

            // Loop through each word in the current window
            int j = 0;
            while (j < wordCount) {
                // Calculate the starting index of the current word
                int wordIndex = i + j * wordLength;

                // Get the current word from the string s
                String currentWord = s.substring(wordIndex, wordIndex + wordLength);

                // Check if the current word is in the wordMap
                if (!wordMap.containsKey(currentWord)) {
                    break;
                }

                // Update the frequency of the current word in seenWords
                seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);

                // If the frequency of the current word exceeds the frequency in wordMap, break the loop
                if (seenWords.get(currentWord) > wordMap.get(currentWord)) {
                    break;
                }

                // Move to the next word in the window
                j++;
            }

            // If all words are found in the current window, add the starting index to the result
            if (j == wordCount) {
                result.add(i);
            }
        }

        // Return the result list
        return result;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        SubstringWithConcatenationAllWords solution = new SubstringWithConcatenationAllWords();

        // Define the input string and words array
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        // Call the method and print the result
        System.out.println(solution.findSubstring(s, words)); // Output: [0, 9]
    }
}
