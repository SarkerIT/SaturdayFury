package com.upskill.java_3;
// Inheritance example with a car Example

// Vehicle class (Superclass)
class Vehicle {
	protected String brand;

	// You can add a constructor to initialize the brand
	public Vehicle(String brand) {
		this.brand = brand;
	}

	public void honk() {
		System.out.println("Tuut, tuut!");
	}

	// Setter method for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// Getter method for brand
	public String getBrand() {
		return this.brand;
	}
}


// Car class 
class Car_Inheritance extends Vehicle {
	private String modelName;

	// Constructor for Car to initialize the modelName and brand
	public Car_Inheritance(String brand, String modelName) {
		super(brand); // Calling the parent class constructor to set brand
		this.modelName = modelName;
	}

	public static void main(String[] args) {
		// Create a Car object and initialize the brand and modelName
		Car_Inheritance myFastCar = new Car_Inheritance("Ford", "Mustang");

		myFastCar.honk(); // Calling the honk method from the Vehicle class
		System.out.println(myFastCar.getBrand() + " " + myFastCar.modelName); // Using the getter for brand and
																				// accessing modelName
	}
}
