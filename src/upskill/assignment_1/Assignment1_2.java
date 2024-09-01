package upskill.assignment_1;

public class Assignment1_2 {

	public static void main(String[] args) {
		 Assignment1_2 HW1 = new  Assignment1_2();
		 HW1.rectangle();
		 multiply();
		 multiadd();
	}
	public void rectangle() {
		int width =9;
		int length =13;
		int parameter =2*(width+length);
		System.out.println("The parameter of rectangle is"+ parameter);
	}
	public static int multiply() {
		int a = 9;
		int b= 11;
		int c= a*b;
		System.out.println(c);
		return c;
		
		}
	public static void multiadd() {
		int a=9;
		int b=11;
		int c= multiply();
		System.out.println(a+b+c);
	}

}
