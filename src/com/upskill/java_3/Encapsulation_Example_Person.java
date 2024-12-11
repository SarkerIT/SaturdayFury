package com.upskill.java_3;



//Class Encapsulation_Example_Person with encapsulated fields
public class Encapsulation_Example_Person {
 
 // Private fields (data hiding)
 private String name;
 private int age;

 // Constructor to initialize the fields
 public Encapsulation_Example_Person(String name, int age) {
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


//Main class to test the encapsulation  (Remove the Main class into a different file)
 public static void main(String[] args) {
     // Create a Person object
	 Encapsulation_Example_Person person = new Encapsulation_Example_Person("John", 25);
	 
	 // The line above would throw an error because name is a private field, 
	 // and you can't access it directly from outside the class.
	 // But in the same file is fine, since it is within the scope of private (same class access)
	 System.out.println(person.name);  // ERROR from a different file: name has private access in Person
	 
	 
     // Accessing data through getter methods
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());

     // Modifying data through setter methods
     person.setName("Alice");
     person.setAge(30);

     // Display updated data
     System.out.println("Updated Name: " + person.getName());
     System.out.println("Updated Age: " + person.getAge());
 }
}

