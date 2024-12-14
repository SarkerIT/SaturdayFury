package com.upskill.PracticeProblems;

import java.util.ArrayList;

public class MaxDifferenceValue_InAnArray {
	
	// given array
	static int[] arr = {10, 4, 3, 2, 42, 78, 80, 90};

	static ArrayList<Integer> newArr= new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// put all the difference in the new array
		for(int i=0; i<arr.length-1; i++) {
			int diff = arr[i]-arr[i+1];
			
			if (diff <0) diff = (-diff);
			newArr.add(diff);
		}	
		
		int max=0;
		// iterate over the new array and find the max number
		for(int i=0; i<newArr.size(); i++) {
			System.out.println(newArr.get(i));

			if(newArr.get(i)<newArr.get(i+1)) {
				max = newArr.get(i+1);
			} else {
				max=max;
			}
		}
		System.out.println(max);
	}

}
