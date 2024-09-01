package upskill.assignment_1;

public class assignment1_5 {

	public static void main(String[] args) {
		assignment1_5 objAssign = new assignment1_5();
		student1();
		objAssign.student2();
		student3(); 
	}
	public static void student1() {
		int a= 20;
		System.out.println("Age of X is "+a);
	}
	public void student2() {
		int b= 25;
		System.out.println("Age of Y is "+b);
	}
	public static int student3() {
		int c = 30;
		System.out.println("Age of Z is "+c);
		return c;
	}

}
