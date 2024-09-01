package upskill.assignment_2;

import java.util.Scanner;

public class Assignment2_10 {

	public static void main(String[] args) {
		
	Scanner n = new Scanner(System.in);
	System.out.println("Enter the Degree fahrenheit");
	double x = n.nextInt();
	n.close();
	convert();
	}
	public static void convert() {
		double fahrenheit = 0;
		double celsius = ( fahrenheit- 32)* 5.0/9.0;
		System.out.println("The equivalent of celsius is: "+ celsius);
	
	}
	

}
