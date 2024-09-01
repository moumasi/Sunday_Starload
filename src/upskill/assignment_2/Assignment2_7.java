package upskill.assignment_2;

public class Assignment2_7 {

	public static void main(String[] args) {
		swap();

	}
	public static void swap() {
		int a = 25;
		int b = 30;
		int num;
		num = a;
		a = b;
		b = num;
		System.out.println("Swap value a: " + a);
		System.out.println("Swap value b: " +b);
	}

}
