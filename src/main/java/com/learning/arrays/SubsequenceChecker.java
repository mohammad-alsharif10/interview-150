package com.learning.arrays;

public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer++;
                if (sPointer == s.length()) {
                    return true;
                }
            }
            tPointer++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println("Is subsequence: " + isSubsequence(s1, t1)); // Output: true
        System.out.println("Is subsequence: " + isSubsequence(s2, t2)); // Output: false
    }
}
