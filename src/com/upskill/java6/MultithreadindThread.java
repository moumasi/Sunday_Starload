package com.upskill.java6;

public class MultithreadindThread extends Thread{
	
	public void run() {
		try {
			System.out.println("Thread number # "+
		                 Thread.currentThread().getId()+ " is running");
		}catch(Exception e) {
			System.out.println("exception is caught");
		}
	}

}
