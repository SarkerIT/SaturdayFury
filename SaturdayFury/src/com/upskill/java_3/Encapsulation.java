package com.upskill.java_3;

public class Encapsulation {

	// Encapsulation is used to hide the data using setter and getter methods
	
	private String name = "G"; 				// Read & write
	private int ssn = 1234567;					// Write only
	private String userName = "g_t";			// Read only
	
	
	// Setter method - name 						//set the data, Write
	public void setName(String value) {
		name = value;
	}
	
	// Getter method - name 						// get the data, Read 
	public String getName() {
		return name;
	}
	
	// Setter method - SSN 							//set the data, Write
		public void setSSN(int value) {
			ssn = value;
		}
	
	// Getter method - userName 					// get the data, Read only. Once you set, cannot be changed
	public String userName() {
		return userName;
	}
		
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();  	// create object of the Encapsulation class
		System.out.println(obj.getName()); 			// Get name
		
		obj.setName("JavaStudyClass"); 				// Set name
		System.out.println(obj.getName());			// Get updated name
		
		System.out.println(obj.userName());			// Get userName
		
		// Set the SSN
		obj.setSSN(12345670);						// Set 'ssn' (no getter to access it)
//		System.out.println(obj.ssn);				// Trying to access 'ssn' directly (incorrect)
		
	}

}
