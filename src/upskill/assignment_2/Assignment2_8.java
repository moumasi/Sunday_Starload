package upskill.assignment_2;

public class Assignment2_8 {

	public static void main(String[] args) {
		factorial(); 

	}
	public static void factorial() {
		int number = 7;
		int result = 1;
		for(int a= 1; a<= number; a++) {
			result = result*a;
			System.out.println("The factorial of number 7 is "+ result);
		}
	}

}
