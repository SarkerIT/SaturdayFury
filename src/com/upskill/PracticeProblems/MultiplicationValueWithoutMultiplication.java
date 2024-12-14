package com.upskill.PracticeProblems;

// Problem: Give the product of two numbers BUT do not use multiplication (*) operator

public class MultiplicationValueWithoutMultiplication {
	
	static int a = 9;
	static int b = 9;
	// need to print 4*5 = 45; without multiplication operation
	
	static int sum =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = totalValue();
		System.out.println(total);
	}
	
	// sum with a for loop and without multiplication operation
	public static int totalValue() {
		for(int i= 0; i<a; i++) {
			sum = sum+b;
		}
		return sum;
	}
}
