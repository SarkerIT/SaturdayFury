package com.upskill.assignment_2;

public class Problem_8 {

	public static void main(String[] args) {
		int a = 7;
		int factorialSum = 1;

		for (int i = 1; i < a; i++) {

			factorialSum = factorialSum * (i + 1);
		}
		
		System.out.println(factorialSum);
	}

}
