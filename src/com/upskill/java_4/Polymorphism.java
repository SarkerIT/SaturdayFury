package com.upskill.java_4;
import com.upskill.java_1.Method;


// Polymorphism with Inheritance
public class Polymorphism extends Method{
	/*
	 * Polymorphism is the ability of an object to take on any forms
	 * - Method Overloading
	 * 		+ Compile time Polymorphism/Static Binding
	 * 		+ Same method, same name with different signature
	 
	 * - Method Overriding 
	 * 		+ Runtime Polymorphism /Dynamic binding
	 * 		+ Same method name from Parent Class to override	 * 
	 * 
	 * */	

	public static void main(String[] args) {
		// Regular Inheritance
		// call the old annual income method from java_1 Method Class
		// (NOT Overriding or overloading though; Regular Inheritance)
		Polymorphism obj= new Polymorphism();
		// now call the annualIncome() method on the object
		
		
		int totalReturn = obj.annualIncomeInt();
		System.out.println("Annual Income from Inheritance and current income = " + totalReturn);
		
		
		System.out.println("---------");
		car();
		car("Toyota", 5);
	}
	
//	 Method Overloading Examples
//		* Compile time Polymorphism/Static Binding
//		* Same method, same name with different signature
	public static void car() {		
		System.out.println("My car is Tesla!");
	}
	
	public static void car(String name, int seat) {		
		System.out.println("My car is " + name + "!" + " It has " + seat+ " seats.");
	}

	
//	 * - Method Overriding  Example
//	 * 		+ Runtime Polymorphism /Dynamic binding
//	 * 		+ Same method name from Parent Class to override
	// @Overrirde
	public int annualIncomeInt() {
//		Polymorphism obj = new Polymorphism(); 
//		int inheritedIncome = obj.annualIncomeInt(); // above two lines makes recursive call, wont work
		int inheritedIncome = super.annualIncomeInt();
		int crypto = 20000;
		int dividend = 5000;
		int totalIncome = inheritedIncome +crypto +dividend;
		
		return totalIncome;
		
	}
	
}
