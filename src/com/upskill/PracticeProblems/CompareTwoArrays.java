package com.upskill.PracticeProblems;

import java.util.ArrayList;

// Problem: Compare two arrays and make a new array with the matching numbers

public class CompareTwoArrays {

	static int[] arr1 = { 1, 2, 4, 51, 40, 3, 40 };
	static int[] arr2 = { 3, 1, 2, 51, 11, 13, 40 };

	static ArrayList<Integer> arr3 = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				arr3.add(arr1[i]);
			}
		}

		Object combinedArray[] = arr3.toArray();

		// printing with enhanced for loop
		for(Object item : combinedArray) {
			System.out.println(item);
		}
/*		
		// Printing with for loop
		for(int i=0; i<combinedArray.length; i++) {
			System.out.println(combinedArray[i]);
		}
*/
	}

}
