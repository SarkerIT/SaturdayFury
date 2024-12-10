package com.upskill.java_1;

/*
 * In Java, the super keyword is used to refer to the parent class (or superclass) 
 *  of the current object, not to call methods directly from the main class 
 *  (the class where public static void main(String[] args) resides). 
 *  However, if you have a subclass (like the Car class in this example), 
 *  and I want to use the super keyword to call methods from
 * the superclass (like Vehicle), that’s where super comes in. 
 
 */

//==== Superclass (Parent class) ====
class Vehicle {
 String brand;

 // Constructor
 public Vehicle(String brand) {
     this.brand = brand;
 }

 // Method
 public void startEngine() {
     System.out.println("The engine is starting...");
 }
}
// === Vehicle End ===

// >>>>> Subclass (Child class; Car) >>>>
class Car extends Vehicle {
 int doors;

 // Constructor
 public Car(String brand, int doors) {
     super(brand);  // Call the constructor of the superclass (Vehicle)
     this.doors = doors;     // Initializes the doors field specific to Car
 }

 // New method specific to Car
 public void openDoors() {
	 
     System.out.println("Opening " + doors + " doors.");
 }

 // Overriding a method from the superclass
 @Override
 public void startEngine() {
     System.out.println("The car engine is starting from childclass Car ...");
 }
}
// >>>>>>  Car ends >>>>>

// MAIN class (same as file name) with the main method
// Separate Code Block form the above block;
// We can make a separate file for the following code code block again
public class Super_Sub_Class_Interactions  {
 public static void main(String[] args) {
     // Creating an object of the subclass (Car)
     Car myCar = new Car("Jeep", 4);

     // Calling methods from the superclass
     myCar.startEngine();  // This will call the overridden method in Car

     // Calling methods from the subclass
     myCar.openDoors();  // This will call the method in Car
     
     // My car brand 
     System.out.println("The brand of my car is " + myCar.brand + ".");
 }
}

