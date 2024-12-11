package com.upskill.PracticeProblems;

public class Factorial_with_recursion {
	
	
	    
	    // Recursive method to calculate factorial
	    public static long factorial(int n) {
	        if (n == 0) {
	            return 1;  // Base case
	        } else {
	            return n * factorial(n - 1);  // Recursive call
	        }
	    }

	    public static void main(String[] args) {
	        int n = 5;  // Example number
	        long result = factorial(n);

	        // Output the result
	        System.out.println("Factorial of " + n + " is " + result);
	    }
	}



