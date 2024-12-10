package com.upskill.assignment_2;

public class Problem_10 {

	public static void main(String[] args) {
		fehrenheitToCelcius(70);
			
		}
	
	
	// Fehrenheit to celcius
	public static void fehrenheitToCelcius(int fehrenheit) {
		int celcius = (fehrenheit - 32)*5/9;
		System.out.println(fehrenheit + "F = " + celcius+"C");

	}

}
