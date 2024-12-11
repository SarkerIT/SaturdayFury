package com.upskill.assignment_2;

public class Problem_9 {
	public static void main(String[] args) {

		String a = "Talent";
		String b = "Tech";

		System.out.println("My currtent strint is: " + a + " " + b);

		String c;
		c = a;
		a = b;
		b = c;

		System.out.println("My swapped string is: " + a + " " + b);
	}

}
