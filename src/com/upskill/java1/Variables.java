package com.upskill.java1;

public class Variables {
	                  //variable is data container that hold the value of data
	           //There are 4 types of variable in java
	   //1.Instance or Global variable-- variable declare in the class and outside of the method
	  //2.Static variable-- variable belongs to class and not required create object of the class
	  //3.Local variable-- variable declare inside the method
	 //4.Method parameter-- variable used as a method parameter
	
	String country = "Bangladesh";  //example of Global variable('country' is variable)
	
	static String city = "Sylhet";   //example of static variable

	public static void main(String[] args) {
		
		String city = "Dhaka";  //example of local variable
		 NewYork("Bronx");
		
	  }
	public static void NewYork(String  county) { //example of Method parameter(use this parameter we can 
		                                               //passing data from the main method to other method.)
		
		String myCounty = county;
		System.out.println(myCounty);
	}
	

}
