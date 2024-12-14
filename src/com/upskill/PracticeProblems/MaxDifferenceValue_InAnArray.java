package com.upskill.PracticeProblems;

// Find the Maximum difference between two ADJACENT values of an array

public class MaxDifferenceValue_InAnArray {
	
	// given array
	static int[] arr = {10, 4, 3, 2, 42, 78, 80, 90};

	
	// create a new array
	
	static int[] arrNew = new int[arr.length-1];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// put all the difference in the new array
		for(int i=0; i<arr.length-1; i++) {
			int diff = arr[i]-arr[i+1];
			
			if (diff <0) diff = (-diff);
			arrNew[i]=diff;
		}	
		
		int max=0;
		for(int i=0; i<arrNew.length-1; i++) {
			if (arrNew[i]> arrNew[i+1]) {
				max=arrNew[i];
			}else {max=max;}
			
		}
		
		
		// iterate over the new array and find the max number
		System.out.println(max);
	}

}
