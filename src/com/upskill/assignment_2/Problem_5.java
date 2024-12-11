package com.upskill.assignment_2;

public class Problem_5 {
	
	
	public static void main(String[] args) {
		
		multiplicationTable(16);
		
	}
	
	public static void multiplicationTable(int a) {
		for(int i=1; i<=10; i++) {
			System.out.println(a + " x " + i + " = " + a*i);
		}
	}

}
