package com.upskill.java_1;

public class AccessModifiers {

	public static void main(String[] args) {		
		
		myPublicMethod();
		myPrivateMethod2();
//		myPrivateMethod(); // does NOT work as it is inside another class
		myProtectedMethod();

	}
	
	
	//--- Public Access Modifier ---//
    public static void myPublicMethod() {
        // Accessible everywhere
    	// from ANY class of CURRENT package--> com.upskill.java_1
    	// from ANY class of ANY PACKAGES OF current PROJECT (SaturdayFury)
    	System.out.println("This is my PUBLIC access modifier form the AccessModifiers Class!");
    }

 /*   
    //=========== NOT allowed for private method START===========//
    public class myClassWithPrivateMethod {
    	private void myPrivateMethod() {  // The method myPrivateMethod cannot be declared static; 
    		// static methods can only be declared in a static or top level type
    		    		
    		System.out.println("This is my PRIVATE method!");
    	}    	
    	myPrivateMethod(); 
    	// Scope of the Private Method: The myPrivateMethod() is defined as a private method inside the inner class myClassWithPrivateMethod.
    	// Private methods can only be called from within the class they are defined in. 
    	// Since myPrivateMethod() is not defined in the AccessModifiers class but in its inner class, 
    	// it cannot be accessed directly from the outer class.
    }    
*/ //=========== NOT allowed for private method END===========//    
    
    
    // This PRIVATE method is allowed as it is within the mother class    
	private static void myPrivateMethod2() {  // The method myPrivateMethod cannot be declared static; static methods can only be declared in a static or top level type
				System.out.println("This is my PRIVATE method!");
	}  
	
	
	 // Protected: Accessible within the same package (com.upskill.java_1) and subclasses (even if the subclasses are in different packages)
	// Accessible within the same package and also in subclasses (even if the subclasses are in different packages). 
	// It provides a way to allow access to subclasses while still restricting access from other classes.
	protected static void myProtectedMethod() {
		System.out.println("Hello from my PROTECTED method!");
	}
}

