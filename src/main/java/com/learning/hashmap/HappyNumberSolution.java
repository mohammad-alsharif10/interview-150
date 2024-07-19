package com.learning.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberSolution {
    public boolean isHappy(int n) {
        // Create a set to store numbers that have been seen in the process
        Set<Integer> seen = new HashSet<>();

        // Continue the process until the number equals 1 or a cycle is detected
        while (n != 1 && !seen.contains(n)) {
            // Add the current number to the set of seen numbers
            seen.add(n);
            // Replace the number with the sum of the squares of its digits
            n = getSumOfSquares(n);
        }

        // If the number is 1, it is a happy number; otherwise, it is not
        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;

        // Calculate the sum of the squares of the digits of the number
        while (n > 0) {
            int digit = n % 10; // Get the last digit of the number
            sum += digit * digit; // Add the square of the digit to the sum
            n /= 10; // Remove the last digit from the number
        }

        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of the HappyNumberSolution class
        HappyNumberSolution solution = new HappyNumberSolution();

        // Test the isHappy method with example numbers
        System.out.println(solution.isHappy(19)); // Output: true
        System.out.println(solution.isHappy(2)); // Output: false
    }
}

