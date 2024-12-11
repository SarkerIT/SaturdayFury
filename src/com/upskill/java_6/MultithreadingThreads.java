package com.upskill.java_6;

public class MultithreadingThreads extends Thread{
	
	public void run() {
		try {			
			System.out.println(Thread.currentThread().getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
