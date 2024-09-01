package upskill.assignment_2;

public class Assignment2_9 {

	public static void main(String[] args) {
		swap();
	
			
	}
		public static void swap() {
			
			String x = "Talen";
            String y = "Tech";
            String name;
            name = x;
            x = y;
            y = name;
            System.out.println("Swap value x: "+ x);
            System.out.println("Swap value y: "+ y);
    }
}