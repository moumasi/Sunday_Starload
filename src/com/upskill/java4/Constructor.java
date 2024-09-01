package com.upskill.java4;

public class Constructor {
	
	          //Constructor is instance of class, a special kind of method which name same as calss name 
	          //and java will execute constructor first
	//--Constructor cannot be static or overrider , void or return type
    //Default Constructor:No constructor initialized
	//Parametarized constructor:add different signature
	//Constructor overloading: Different signature
	
	String studentname;
	int studentage;
	
	public Constructor(String name) {
		studentname = name;
	}
	public Constructor(int age) {
		studentage = age;
	}
	public Constructor(String name ,int age) {
		studentname = name;
		studentage = age;
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor("Nazmin"); //Constructor overloading
		System.out.println(obj.studentname);
		
		Constructor obj2 = new Constructor(30);
		System.out.println(obj2.studentage);
			
		Constructor obj3 = new Constructor("Nazmin" ,30);
		System.out.println("Student name:" +obj3.studentname + " ,Student age: "+ obj3.studentage);

	}

}
