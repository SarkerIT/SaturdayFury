package com.upskill.java_4;


// Step 1: Make a Person Class
class Person {
	String name; // Instance variable
	int age; // Instance variable
	
	
	// Inside the class make two constructors (Also, Overloading)
	// Constructor_1 with no parameter 
	public Person() {
		 this.name = "John";
		 this.age = 45;
	 }

	// Constructor_2 with parameters
	public Person(String x, int y) {   // this constructor will take two parameters
		this.name = x; // "this.name" refers to the instance variable
		this.age = y; // "this.age" refers to the instance variable
	}

	// Inside the class make a Method to display the person details
	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class Constructor_Example {
	public static void main(String[] args) {
		// Creating a Person object with parameter constructor_2
		Person person = new Person("Alice", 30);

		// Calling the display method
		person.display(); // Output: Name: Alice, Age: 30
		
		// Creating a Person Object with no parameter — Conatructor_1
		Person person2 = new Person();
		person2.display(); 
	}
}
