package com.upskill.java_3;

public class Encapsulation_Main {
	

	//Main class to test the encapsulation  (Remove the Main class into a different file)
	public static void main(String[] args) {
	   // Create a Person object
		 Encapsulation_Person person = new Encapsulation_Person("Johnny", 30);
		 
		 // The line above would throw an error because name is a private field, 
		 // and you can't access it directly from outside the class.
		 // But in the same file is fine, since it is within the scope of private (same class access)
//		 System.out.println(person.name);  // ERROR from a different file: name has private access in Person
		 
		 
	   // Accessing data through getter methods
	   System.out.println("Name: " + person.getName());
	   System.out.println("Age: " + person.getAge());

	   // Modifying data through setter methods
	   person.setName("Amber");
	   person.setAge(30);

	   // Display updated data
	   System.out.println("Updated Name: " + person.getName());
	   System.out.println("Updated Age: " + person.getAge());
	}

}
