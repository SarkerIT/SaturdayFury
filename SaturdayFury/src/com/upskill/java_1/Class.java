package com.upskill.java_1;

public class Class {

	public static void main(String[] args) {
		// What is a Class?
		// Ans: Class is NAMED GROPUP of Properties and function.
		// A class is a blueprint or TEMPLATE for creating objects (instances).
		// A class ENCAPSULATES data for the object and the methods to manipulate that data.
		// It defines the properties (attributes or fields) and behaviors (methods or
		// functions) that the objects created from the class will have.

		// What is the new keyword?
		// Ans: It creates an object at the runtime.
		// Allocate memory dynamically.

		// Student goutam = new Student(); what is Student()? here?
		// It is the constructor.
		// Constructor is a default function, that runs when a object is created from a class.
		
		Student goutam = new Student(12, "GCS", 12.2f);		
		System.out.println(goutam.GPA);

	}

// create a class for every single student
	public static class Student {

		int rollNo;
		String name;
		float GPA;
		
		// Need a way to add (bind) the above info/properties
		// when we create an object
		
		// create the constructor
		Student(int rollNo, String name, float GPA){
			this.rollNo = rollNo;
			this.name=name;
			this.GPA=GPA;
			
		}
	}

}
