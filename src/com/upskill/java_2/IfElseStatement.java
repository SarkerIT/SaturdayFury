package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		int age = 1000;

		if (age <= 0) {
			System.out.println("Invalid input!");
		} else if (age >= 13 && age <= 17) {
			System.out.println("Your are a teen!");
		} else if (age >= 18 && age <=59) {
			System.out.println("Your are an adult!");
		} else if (age>=60){
			System.out.println("You are a senior Citizen!");
			if(age>=100) {
				System.out.println("And, you are a champion!");
			}
		}	else {
			System.out.println("You are a children!");
		}
	}
}
