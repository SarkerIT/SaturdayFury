package com.upskill.java_3;

import com.upskill.java_1.Method;

public class Inheritance {

	public static void main(String[] args) {
		/* 
		 - The process of obtaining the data  members and methods from to another class is known as inheritance.
		 - Single inheritance
		 - Multiple inheritance (Java does not support multiple inheritance but through Interface)
		 - Multilevel inheritance
		 */

		
		Method obj = new Method();		// calling a object from com.upskill.java_1
		System.out.println("-----Calling the Inheritance Class!-----");
		
		obj.annualIncomeInt();  // because it is a void method we can not save any return value
		System.out.println("-------Finished Calling Inheritence Class------");
		
		int month = Method.monthlyIncomeReturn();
		System.out.println("From Inheritance Class " +month);
		
	}

}
