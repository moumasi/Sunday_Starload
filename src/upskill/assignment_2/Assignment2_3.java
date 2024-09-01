package upskill.assignment_2;

public class Assignment2_3 {
       static int a;
       static int b;
	public static void main(String[] args) {
		a=function1();
		b=function2();
		myMethod();
	}
	public static int function1() {
		return 70;
		
		}
	public static int function2() {
		return 55;
		
	}
   public static void myMethod() {
	
	  if(a>b) {
		   System.out.println("Function1 is bigger than function2");   
	   
	  }else {
		   System.out.println("Function2 is bigger  than function1");    
	   }
   }

}