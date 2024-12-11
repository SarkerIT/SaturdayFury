package com.upskill.assignment_1;

/*Problem 02: A rectangle width and length are: 9 and 13 inches.
Write a method to display the perimeter of rectangle in console output. */

public class Problem_2 {

	public static void main(String[] args) {
		calculateRectanglePerimeter(9, 10);
	}

	public static void calculateRectanglePerimeter(int a, int b) {
		int perimeter = a*2 + b*2;
		System.out.println("The perimeter of the triangle with arms " + a + " and " +  b + " is " + perimeter +".");
	}

}
