package com.upskill.assignment_1;

/*Problem 01: 1.	A triangle three arms are: 5, 7 and 11 inches. 
Write a method to display the perimeter of triangle in console output. */

public class Problem_1 {

	public static void main(String[] args) {

		calcualtePerimeter(2, 3, 4);
	}

	public static void calcualtePerimeter(int a, int b, int c) {
		int perimeter = a + b + c;
		System.out.println("The perimeter of the triangle with arms " + a + ", " + b + ", " + c + " is: " + perimeter);
	}
}
