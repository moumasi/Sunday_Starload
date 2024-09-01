package com.upskill.java1;

public class MethodTypes {
	
/*    Types of method
	  1.void method--method does not return any value and required to create an object of the class
	  2.Static method--in this method have to use static keyword and not required to create any object
	  3.Return type method--this method return us some data
*/
public static int hourlyincome = 65;

	public static void main(String[] args) {
		 MethodTypes objMethod = new  MethodTypes() ;
		 objMethod.annualincome();
		 weeklyIncome();
		 objMethod.monthlyIncome();
	}
	//void method
	public  void annualincome() {
		int calculateAnnualIncome = hourlyincome* 2000;
		System.out.println("My annual incom: "+  calculateAnnualIncome);
	}
	//Return type method
	public int monthlyIncome() {
		int cacculateMonthlyIncome =  hourlyincome*180;
		System.out.println("My minthly income: "+cacculateMonthlyIncome );
		return cacculateMonthlyIncome;
		
	}
	//static method
	public static void weeklyIncome() {
		int calculateWeeklyIncome = hourlyincome*40;
		System.out.println("My weekly incom: "+calculateWeeklyIncome);
	}

}
