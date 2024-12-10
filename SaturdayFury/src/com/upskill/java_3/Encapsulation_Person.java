package com.upskill.java_3;



//Class Encapsulation_Person with encapsulated fields
	public class Encapsulation_Person {

// Private fields (data hiding)
		private String name;
		private int age;

// Constructor to initialize the fields
		public Encapsulation_Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

// Getter for the name field
		public String getName() {
			return name;
		}

// Setter for the name field
		public void setName(String name) {
			this.name = name;
		}

// Getter for the age field
		public int getAge() {
			return age;
		}

// Setter for the age field
		public void setAge(int age) {
			// You can add validation here
			if (age >= 0) {
				this.age = age;
			} else {
				System.out.println("Age cannot be negative.");
			}
		}
	}

