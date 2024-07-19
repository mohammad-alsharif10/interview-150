package com.learning.hashmap;

import java.util.*;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store the sorted version of the string as the key and the list of anagrams as the value
        Map<String, List<String>> anagramsMap = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);

            // If the sorted string is not already in the map, add it with a new list
            // Add the original string to the list of anagrams
            anagramsMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // Return a list of all the values in the map, which are the groups of anagrams
        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        GroupAnagrams solution = new GroupAnagrams();
        // Define an array of strings to group by anagrams
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // Print the grouped anagrams
        System.out.println(solution.groupAnagrams(strs));
    }
}
