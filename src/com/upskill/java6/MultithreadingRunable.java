package com.upskill.java6;

public class MultithreadingRunable implements Runnable {
	
	public void run() {
		try {
			System.out.println("Thread number # "+
		                 Thread.currentThread().getId()+ " is running");
		}catch(Exception e) {
			System.out.println("exception is caught");
		}
	}

}
