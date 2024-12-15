package com.upskill.PracticeProblems;

import java.util.ArrayList;

// Problem: Compare two arrays and make a new array with the matching numbers

public class CompareTwoArrays {
	
	static int[] arr1 = {1, 2, 4, 51, 40, 3, 10};
	static int[] arr2 = {3, 1, 2, 41, 11, 13, 40};

	static ArrayList<Integer> arr3 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]==arr2[i]) {
				arr3.add(arr1[i]);
			}
		}
		
		// Printing
//		for(int i=0; i<arr3.length(); i++) {
//			System.out.println(arr3[i]);
//		}


		for(items: arr3) {
			System.out.println(items);
		}
		
		
		
	}
	
}
