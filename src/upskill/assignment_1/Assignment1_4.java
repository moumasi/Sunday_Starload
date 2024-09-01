package upskill.assignment_1;

public class Assignment1_4 {

	public static void main(String[] args) {
		Assignment1_4 objAssign = new Assignment1_4();
		 myMethod1();
		 mymethod2();
		 objAssign.myMethod3();
	}
	public static int myMethod1() {
		int a=30;
		System.out.println(a);
		return a;
	}
	public static int mymethod2() {
		int b=50;
		 System.out.println(b);
		return b;
	}
	public void myMethod3() {
		int a=  myMethod1();
		int b=  mymethod2();
		int c= b-a;
		System.out.println(c);
	}

}
