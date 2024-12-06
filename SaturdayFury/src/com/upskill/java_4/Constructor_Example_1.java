package com.upskill.java_4;

public class Constructor_Example_1 {
	  int x; // classX

/*	  
	  public Constructor_Example_1(int y) {
		  x = y;  // will work fine; however, to avoid confusion we should use the name of the 
		  			// variable same, in this case it is x. For example see below		  
	  }
	  
*/	  
/*	  
	  public Constructor_Example_1(int x) {
		  x = x;  // will work Not work because JAVA is confused now which x is x form teh method parameter 
		  			// to solve this we need to use this keyword	  
	  }
*/	  
	  
	  public Constructor_Example_1(int x) { // methodX
		  this.x = x;  // will work Not work because JAVA is confused now which x is x form teh method parameter 
		  			// to solve this we need to use this keyword
	//	this.classX = methodX;
	  }
  
	  public static void main(String[] args) {
		  Constructor_Example_1 myObj = new Constructor_Example_1(50); // sending the parameter as x
		  System.out.println(myObj.x);
	  }
	  
	}

