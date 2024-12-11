package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashMap_HashTable {

	public static void main(String[] args) {
		// Array Store multiple data using index

		int age = 28; // Variable
		System.out.println(age);
		int[] ageFury = new int[] { 25, 28, 30, 32, 21 }; // Array
		System.out.println(ageFury[0]);

		String[] nameFury = new String[] { "Goutam", "Sagor", "Abdul", "Chen", "Alex" };

		System.out.println("Student Name: " + nameFury[0]);
		System.out.println("Total Length of nameFury: " + nameFury.length);

		// Multidimensional Array
		int[][] ageFury2D = new int[][] { { 25, 28, 30, 32, 21 }, { 24, 34, 32 } };
		System.out.println("Student age: " + ageFury2D[1][1]);

		//		HashMap to store multiple data using KEY-VALUE pair; 
		// 		Implementation of Map Interface (from Java Utilities)
		// 		No duplicates, not synchronized; implementation of map interface
		// 		allows multithreading
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Protik", 28);
		Student.put("Tahmina", 24);
		Student.put("Zia", 21);
		Student.put("Roton", 31);
		Student.put("GS", 32);
		Student.put("GS", 33);  // will overwrite the previous one 32
		Student.put("GS", 31);	// will overwrite the previous one 32
		Student.put("GS", 31);	// will overwrite the previous one 32
		
		System.out.println("HasMap Student Age: " + Student.get("GS"));
		

			
		// HashTable stores multiple data using KEY-VALUE pair; 
		// no duplicates (both key and value), 
		// also synchronized (only one thread can be modified); no multithreading	
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("Bangladesh", "Asia");
		System.out.println("Country Region in Asia: " + Region.get("Bangladesh")); // It will print South Asia
		
		System.out.println("-----------");
		Region.put("Bolivia", "South America");
		Region.put("Bangladesh", "South Asia"); // will replace the previous one
		
		
		System.out.println("Country Region in South Asia: " + Region.get("Bangladesh"));
		
		
		
		// HashSet stores unordered collection containing UNIQUE value; 
		// Implementation of set interface
		// does not allow duplicates
		// Not KEY-VALUE pair
		
		HashSet<String> car = new HashSet<>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		car.add("Ford");
		car.add("Audi");  	// will only print one Audi
		car.add("Audi"); 	// will only print one Audi
		
		System.out.println("Car: " + car);
		
	}

}
