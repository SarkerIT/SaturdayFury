package com.upskill.java_4;

public class Polymorphism {
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
	
	
	
//	 - Method Overloading
//	 		* Compile time Polymorphism/Static Binding
//	  		* Same method, same name with different signature
	public static void main(String[] args) {
		car();
		car("Toyota", 5);
		
	}
	
	
	public static void car() {
		
		System.out.println("My car is Tesla!");
	}
	
	public static void car(String name, int seat) {
		
		System.out.println("My car is " + name + "!" + " It has " + seat+ " seats.");
	}

	
	
	
	
//	 * - Method Overriding 
//	 * 		+ Runtime Polymorphism /Dynamic binding
//	 * 		+ Same method name from Parent Class to override
	
	
	
}
