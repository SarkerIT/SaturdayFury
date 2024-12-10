package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		iCar();

	}

	@Override
	public void iCar() {
		// TODO Auto-generated method stub
		System.out.println("My car is BMW!");
		
	}

	@Override
	public void iName() {
		// TODO Auto-generated method stub
		System.out.println("Name of my car is Mr. Muscle!");
	}

	@Override
	public void iWheel() {
		// TODO Auto-generated method stub
		System.out.println("My car has NO wheel!");
	}

	@Override
	public void iEngine() {
		// TODO Auto-generated method stub
		System.out.println("My car engine is V8, 200hp!");
		
	}

	@Override
	public int iDoorNumber() {
		// TODO Auto-generated method stub
		int door = 4;
		return door;
	}

	@Override
	public boolean isRed() {
		// TODO Auto-generated method stub
		boolean caColor = true;
		return caColor;
	}

	@Override
	public void iReviewClass() {
		// TODO Auto-generated method stub
		System.out.println("This is from ");
	}

}
