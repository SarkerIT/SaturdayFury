package com.upskill.PracticeProblems;

// Two Sum: Given an array of integers, 
// find two numbers such that they add up to a specific target number?
public class Two_Sum_Problem {

	public static void main(String[] args) {

		// given array
		int[] arr = { 1, 20, 10, 4, 5, 7, 6, 0, 45 };
		// target sum
		int sum = 4;

		//
		boolean isFound = false;

		// for loop
		for (int i = 0; i < arr.length-1; i++) {
			int firstNum = arr[i];
			int secondNum = arr[i + 1];

			if ((arr[0] + arr[arr.length - 1]) == sum) {
				isFound = true;
				break;
			} else if (firstNum + secondNum == sum) {
				isFound = true;
				break;

			}

		}
		System.out.println(isFound);
	}

}
