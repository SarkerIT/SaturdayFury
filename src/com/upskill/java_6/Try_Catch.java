package com.upskill.java_6;

//public class Try_Catch extends User_Defined_Try_Catch{ 
// do not need to extend User_Defined_Try_Catch
// because User_Defined_Try_Catch is already accessible as it is public

	public class Try_Catch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10;
			int b = 0;
			int c= a/b;
			System.out.println(c);
		}catch (Exception e){
			e.printStackTrace();
		}
		
		try{
			int a = 10;
			int b = 2;
			int c= a/b;
			System.out.println(c);
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
        try {
            // Creating an object of the custom exception with a message
            throw new User_Defined_Try_Catch("This is a custom exception");
        } catch (User_Defined_Try_Catch e) {
            // Handling the custom exception
            System.out.println("Caught the exception: " + e.userDefinedString);
        }
		
		
		finally {
			System.out.println("Done");
		}
	}
}
