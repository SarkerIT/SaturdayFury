package com.upskill.java_5;

public abstract class AbstractClass {

	public abstract void iCar();
	
	// Convention: All abstract method starts with i
	// i is for interface
	
		
		public abstract void iName();	
		public abstract void iWheel();				
		public abstract void iEngine();
		public abstract int iDoorNumber();		
		public abstract boolean  isRed();
		public abstract void iReviewClass();
		
		public String name(){			
			String eName = "V6";
			return eName;
		}
		
		public int doorNum(){			
			int dNum = 2;
			return dNum;
		}
		
		public boolean carColor() {
			boolean carColorIsRed = true;
			return carColorIsRed;
					
		}
		
		
		
		public void car() {
		System.out.println("My car is a Tesla!");
	}	
			
		public void bus() {
			
			System.out.println("My car is a Volvo!");
		}
	


}
