package upskill.assignment_4;

public class Assignmen4_2 {
	
		          //Write a method which will reverse a string 

	public static void main(String[] args) {
		
		String name = "Bangladesh";
		System.out.println("Original word: " + name);
		
		StringBuilder name2 = new StringBuilder();
		
		name2.append(name);
		name2.reverse();
		System.out.println("Reverse word: " + name2);
	}

}
