package com.upskill.java6;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	
//private constructor, it prevents any other class from instantiating
	private Singleton() {
		
	}
	
	//private static object of the class
	private static  Singleton singletonobj = new  Singleton();
	
	public static  Singleton getInstance() {
		return  singletonobj;
	}
	protected static void demo() {
		System.out.println("demo method for singlTon class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
