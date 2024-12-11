package com.upskill.java_2;

public class Loops {

	/*
	 * Types of Loops 1. for loop 2. While Loop 3. Do While loop 4. Infinite loop
	 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
		practiceDoWhileLoop();
	}

	public static void practiceForLoop() {
		int i; 													// Initialization of the variable
		for (i = 1; i < 10; i++) { 								// Setting lower limit; upper limit; increment or decrement
			System.out.println("For loop number = " + i); 		// Statement
		}
	}

	public static void practiceWhileLoop() {
		int i = 1; 													// Initialize a variable
		while (i <= 10) { 											// Setting the condition
			System.out.println("While Loop Number = " + i); 		// Checking condition
			i++; 													// Increment or decrement
		}
	}

	public static void practiceDoWhileLoop() {
		int i = 11; 												// Initialize a variable
		do {
			System.out.println("Do While Loop Number = " + i);		// Statement
			i++; 													// Increment or decrement
		} while (i <= 10); 											// Setting the condition

	}

}
