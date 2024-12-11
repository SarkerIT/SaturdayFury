package com.upskill.assignment_2;

public class Problem_6_ChatGPT_2 {
    public static void main(String[] args) {
        int limit = 100; // Set the limit to 100

        System.out.println("Prime numbers from 1 to " + limit + ":");
        for (int i = 2; i <= limit; i++) { // Start from 2, as 1 is not prime
            boolean isPrime = true; // Assume the number is prime
            
            // Check divisibility from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // If i is divisible by j, it's not prime
                    isPrime = false;
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.print(i + " "); // Print the prime number
            }
        }
    }
}
