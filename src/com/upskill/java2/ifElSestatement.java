package com.upskill.java2;

public class ifElSestatement {

	public static void main(String[] args) {
		
		int age =70;
		if(age<=12) {
			System.out.println("You are children");
		}else if(age>20&& age<18)
		  {System.out.println("You are adult");
		
		}else if(age>=20 && age<=100) {
			System.out.println("You are senior");
			
		}else {
			System.out.println("You are teenager");
		}

	}

}
