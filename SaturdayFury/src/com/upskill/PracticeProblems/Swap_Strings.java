package com.upskill.PracticeProblems;

public class Swap_Strings {

	// Write a program to swap two string variables (Hello, World!)
	// and display result on the screen.

	public static void main(String[] args) {
		// Given string
		String str = "Hello, World";
		int length = str.length();

		String word1 = ""; // empty string for storing first word
		String word2 = ""; // empty string for storing second word

		// run a for loop for first word
		for (int i = 0; i < length; i++) {
			char car = str.charAt(i);

			if (car != ' ') {
				word1 = word1 + car;
			} else {
				break;

			}
		}

		// run a for loop for second word
		for (int i = length - 1; i > 0; i--) {
			char car = str.charAt(i);
			if (car != ' ') {
				word2 = car + word2;
			} else {
				break;

			}
		}

		System.out.println(word2 + " " + word1);

	}
}
