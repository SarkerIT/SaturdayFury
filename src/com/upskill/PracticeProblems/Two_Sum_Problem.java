package com.upskill.PracticeProblems;

// Two Sum: Given an array of integers, 
// find two numbers such that they add up to a specific target number?
public class Two_Sum_Problem {

	public static void main(String[] args) {

		// given array
		int[] arr = { 1, 20, 10, 4, 5, 7, 6, 11, 45 };
		// target sum
		int sum = 13;

		//
		boolean isFound = false;

		// for loop
		for (int i = 0; i < arr.length - 1; i++) { // take the first number of the array
			for (int j = 0; j < arr.length - 1; j++) { // check it aganist all the other numbers

				int firstNum = arr[i];
				int secondNum = arr[j + 1];
				if (firstNum + secondNum == sum) {
					isFound = true;
					break;
				}

			}

		}

		System.out.println(isFound);
	}

}
