package com.upskill.java_3;


class Vehicle_Inheritance  {
    protected String brand;  // Change to protected or provide a setter method

    public Vehicle_Inheritance (String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // main method in Vehicle class
    public static void main(String[] args) {
        // Create a Car object in the Vehicle's main method
        Car myFastCar = new Car("Ford", "Mustang");
        
        myFastCar.honk();  // Calling the honk method from Vehicle class
        System.out.println(myFastCar.getBrand() + " " + myFastCar.modelName);  // Using the getter for brand and accessing modelName
    }
}

class Car extends Vehicle_Inheritance {
    protected String modelName;

    public Car(String brand, String modelName) {
        super(brand);  // Calling the parent class constructor to set brand
        this.modelName = modelName;
    }
}
