package com.upskill.java_2;

// The for-each loop is AKA enhanced for-each for loop java

// In regular for loop, you manually control the index i

// In the enhanced for loop, variable directly refers to each element in the array

// for-each iterate over without the elements without explicitly using an index
// syntax:
/* 
 * 
		 for (type variable : collection) {
		    // body of loop
		}
 */


public class ForEach {

	static int[] num = {12, 14, 52, 41, 32, 13, 17, 18};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// normal for loop							// regular for loop, you manually control the index i
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " "); 
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		// enhanced for-each loop					//	the enhanced for loop, variable directly refers to each element in the array
		for(int numbers : num) {	// read like - for numbers in (meaning :) num
			System.out.print(numbers + " ");
		}

	}

}
