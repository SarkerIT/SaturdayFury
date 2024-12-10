package com.upskill.java_6;

public class Multithreading {
	
/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int n = 5;
		for(int i=0; i<n; i++) {
//			System.out.println(i);
			
			// MultithreadingThreads
			MultithreadingThreads obj = new MultithreadingThreads();
			obj.start();
//			System.out.println("----");
			
			//MultithreadingRunnable
			Thread objR = new Thread(new MultithreadingRunnable());
			objR.start();
			System.out.println(">>>");
			
		}
	}

}
