package com.upskill.java4;

import java.util.jar.Attributes.Name;

public class Encapsulation {
	//Encapsulation is way to hide data using setter and getter method
	
	private String name = "nazmin"; //write & read
	private int ssn = 1235879;      //write only
	private String username = "zafornaz"; //read only
	private int dob = 01/20/1991;   //write only
	private String addrs = "123 New ave"; //write & read
	

	
	
	//setter method - name
	public void setName(String value) { //set data,write
		name = value;
	}
	public String getname() { //get data , read
	     return name;
	}
	public void setssn(int value) {   //set data , write only
		ssn = value;
	}
	public String getuserName() { //get data , read only
		return username;
	}
	public void setdob(int value) {   //set data ,write only
		dob = value;
	}
	public void setaddrs(String value) { //set data , write
		addrs = value;
	}
	public void getaddrs(String value) { //set data , read
		addrs = value;
	}
	


	public static void main(String[] args) {
		
		
		
	}

}
