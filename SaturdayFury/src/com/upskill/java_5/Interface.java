package com.upskill.java_5;

public interface Interface {
	// Convention: All abstract method starts with i
	// i is for interface
	
	public abstract void iCar();	
	public abstract void iWheel();	
	public abstract void iDoor();	
	public abstract void iEngine();

}


/* 
(Parent)			(Keyword)			(Child)					(Keyword)		(GrandChild)
Class				extends				Class (0)				 
Abstract Class		extends				Class (A2-A2=0)	 
Interface			Implements			Class (A2-A2=0)	
Interface 			extends 			Interface (A2-A2=0)		Implements		Class (A2-A2=0)
Interface			Implements			Abstract Class (A2-A2=0)	
 
A = Abstract method A2 = two methods
R = Regular method
 * */