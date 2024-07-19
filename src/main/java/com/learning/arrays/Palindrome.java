package com.learning.arrays;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Normalize the string by converting to lowercase and removing non-alphanumeric characters
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is a palindrome
        String cleanedString = cleaned.toString();
        String reversedString = cleaned.reverse().toString();
        return cleanedString.equals(reversedString);
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Is palindrome: " + isPalindrome(s1)); // Output: true
        System.out.println("Is palindrome: " + isPalindrome(s2)); // Output: false
    }
}
