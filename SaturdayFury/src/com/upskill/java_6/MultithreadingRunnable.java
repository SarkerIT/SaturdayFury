package com.upskill.java_6;

public class MultithreadingRunnable implements Runnable{
	
	
	@Override
	public void run() {
		try {
			
			System.out.println(Thread.currentThread().getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
