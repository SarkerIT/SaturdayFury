package com.upskill.PracticeProblems;
// // problem: find the sum of a subset of numbers from an array
public class Problem_1_Sum {

	public static void main(String[] args) {
		

		int limit = 5;

//		int[] arr1 = new int[] { 10, 20, 30, 40, 5, 6, 7 };
		
		int[] arr1 =  { 10, 20, 30, 40, 5, 6, 7 }; // can also be written as
		
		int sum = 0;
		for (int i = 0; i < limit; i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
	}
}
