// Shortcuts
// Cntl + Shift +F --> format
// sysout + cntl + space --> system.out.println()
// main + cntl + space --> public static void main (String [args]

package com.upskill.java_1;

public class Variables {

	// variable in java

	// Instance OR global variable - variables declared inside a class but outside a
	// method
	// Static variable - variables belong to a class and do not require creating an
	// object
	// local variable - variable declared inside a method
	// method parameter - variables used as method parameter

	public String country = "USA";
	public static String region = "North America";
	

	public void ny() {
		String city = "NYC";
		System.out.println("---NYC Method---");
		System.out.print(city);
		System.out.print(", ");
		System.out.println(country);

	}

	public void nj() {
		String city = "Paterson";
		System.out.println();
		System.out.println("---NJ Method---");
		System.out.print(city);
		System.out.print(", ");
		System.out.println(country);

	}
	public static void main(String[] args) {

		Variables myObj = new Variables(); // ClassName objName = new ClassName();
		myObj.ny();
		myObj.nj();
		System.out.println("---------------");
		System.out.println(myObj.country);
		System.out.println(region);
	}

}
