package upskill.assignment_4;

public class Assingment4_1 {
	   
	/*Write a USER PROGRAM using encapsulation that contains the username, password, 
	email, first and last names of a user of our application. Display the user information in console output. 
   */
	
	private String firstName = "Taqwa";
	private String lastName = "Aayat";
	private String email = "aloo12@gmail.com";
	private String userName= "rainBow";
	private int password = 32547;
	
	public void displayUserifo() {
		System.out.println("First name: "+ firstName );
		System.out.println("Last name: "+ lastName );
		System.out.println("Email address: "+ email  );
		System.out.println("Username: "+ userName );
		System.out.println("Password: "+ password );
	}
	public static void main(String[] args) {
		 Assingment4_1 user = new  Assingment4_1();
		 user.displayUserifo();
		
	}

}
