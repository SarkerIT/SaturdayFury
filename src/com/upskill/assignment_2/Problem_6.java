package com.upskill.assignment_2;
// Write a java program to find the prime number from 1 to 100 and print them.
// This is a Hardcoding approach and inappropriate.
// Because it will give answers not prime as prime which are divisible more than 7
public class Problem_6 {
	public static void main(String[] args) {
		int a = 1000;

		for (int i = 1; i <= a; i++) {
			if (i == 1) {
				continue;
			} else if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.print(i + " ");
			} else if ((i % 2) != 0 && (i % 3) != 0 && (i % 5) != 0 && (i % 7) != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
