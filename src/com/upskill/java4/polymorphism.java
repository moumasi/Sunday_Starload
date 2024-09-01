package com.upskill.java4;

import com.upskill.java1.MethodTypes;

public class polymorphism extends MethodTypes  {
	/*Polymorphism is an ability of an object to take on many form.
	methodOverloading(compiletime polymorphism/static binding)same method name with different signature to overload
	methodOverriding(Runtime polymorphism/Dynamic binding)same method name from parent class to override
*/
	public static void main(String[] args) {
		
		car("red" , 7); 
		weeklyIncome();
			
		}
	public static void car() {                    //MethodOverloading
		//System.out.println("My car is Tesla");
	}
	public static  void car(String color) {
		//System.out.println("My car is: "+ color);
	}
	public static  void car(int seat) {
		//System.out.println("My car has: "+ seat);
	}
	public static  void car(boolean ev) {
		//System.out.println("My car is ev:"+ ev);
	}
	public static  void car(String color , int seat) {
		//System.out.println("My car is: "+ color+  " , It has: "+seat);
	}
	
	public static void weeklyIncome() {             //MethodOverriding
		int calculateWeeklyIncome = hourlyincome*40;
		int sideincome = 1000;
		int secondincome = 800;
		int newWeeklyIncome = calculateWeeklyIncome + sideincome + secondincome; 
		System.out.println("My Newweekly income: "+ newWeeklyIncome);
	}
}
