package com.upskill.java_1;

	
	public class Constructor_Example {
	    String make;
	    String model;

	    // Constructor to initialize car details
	    public Constructor_Example(String make2, String model2) {
	        this.make = make2;     // "this.make" refers to 
	        					  // the instance variable, "make" refers to the parameter
	        this.model = model2;   // Same for "model"
	    }

	    public void printDetails() {
	        System.out.println("Make: " + this.make);  // Refers to the instance variable
	        System.out.println("Model: " + this.model); // Refers to the instance variable
	    }

	    public static void main(String[] args) {
	    	Constructor_Example myCar = new Constructor_Example("Toyota", "Corolla");
	        myCar.printDetails();
	    }
	}

	


