package com.upskill.java_1;



public class Method {	
	/*
	 1. Void method 
	 2. Static Method 
	 3. Return type Method
	*/
	public static int hourlyIncome = 60;

	public static void main(String[] args) {
		Method myMethod = new Method();
//		myMethod.annualIncomeVoid(); // Call the void method
		int monthlySalary = monthlyIncomeReturn(); // Call the return type method
		System.out.println("My Monthly salary from Method class is = " + monthlySalary);
		myMethod.annualIncomeInt(); // Call the static method using the class name
	}	
	
	// Return method	
	public int annualIncomeInt() {
		int calculateAnnualIncome = hourlyIncome * 1824; // 1824 hours is assumed
		System.out.println("My Annual from Method class Income = " + calculateAnnualIncome);		
		return calculateAnnualIncome;
	}
	
	// Return type method
	public static int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyIncome * 180; // 180 hours is assumed
		return calculateMonthlyIncome;
	}
}



