package upskill.assignment_4;

public class Assignment4_4 {
	
	                      //4.Write a method to check leap year

	public static void main(String[] args) {
		leapYear(2004);
		
	}
	public static void leapYear(int year) {
		
		boolean leap = false;
		if(year%4==0) 
		{
			if(year%100 ==0)
			{
				if(year%400 == 0)
					leap = true;
				else
					leap = false;
			}
			else
				leap = true;
			}
		else
			leap = false;
		if(leap)
			System.out.println(year+ " is a leap year");
		else
			System.out.println(year+ " is not a leap year");
		
	}  
			
			
		
	}


