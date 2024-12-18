package com.upskill.PracticeProblems;
// Bubble sort
// Problem: Sort an array form lower to higher order without built-in methods


public class Sort_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {80, 10, 44, 120, 1, 45, 12, 4, 0};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
