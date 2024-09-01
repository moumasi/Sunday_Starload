package upskill.assignment_2;

public class Assignment2_2 {

	public static void main(String[] args) {
		result();
		}
	public static void result() {
	int Marks=50;
		if(Marks>=90&&Marks<=100) {
			System.out.println("Grade A");
		}
		else if(Marks>=80&&Marks<=89) {
			System.out.println("Grade B");
		}
		else if(Marks>=70&&Marks<=79) {
			System.out.println("Grade C");	
		}
		else if(Marks>=60&&Marks<=69) {
			System.out.println("Grade D");	
		}
		else if(Marks<60) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Marks");	
		}
	}

	}


