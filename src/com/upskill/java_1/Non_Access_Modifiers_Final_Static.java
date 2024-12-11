package com.upskill.java_1;

public class Non_Access_Modifiers_Final_Static {

	
		String color="red";
		final float pi = 3.14f;
		static int door = 4;
	
	
	
	public static void main(String[] args) {
//		System.out.println(color);   // will not work as it is not static; thats why need to make object below
		
		Non_Access_Modifiers_Final_Static obj = new Non_Access_Modifiers_Final_Static();
		System.out.println(obj.color);
		
		System.out.println(door);     // prints 4; static, no need to create an object
		door = 2;  // since static, can access and change		
		System.out.println(door); // prints 2
//		obj.pi=3.1555f;  // will not allow as it is final
		System.out.println(obj.pi);
		
		
	}

}
