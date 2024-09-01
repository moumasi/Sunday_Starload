package upskill.assignment_4;

import java.util.Arrays;

public class Assignment4_5 {
	             
	                     //5.function to check whether two strings are anagram of each other

	public static void main(String[] args) {
		               //Initialize two strings
		String str1 = "House";
		String str2 = "Home";
		System.out.println("The givenstrings are: " + str1+" and " +str2);
		
		        //converting them into lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		      //to check both strings are anagram or not
		
		if(str1.length() == str2.length()) { //checking length of both strings
			System.out.println(str1 + " and" + str2 +" are anagrams");
		}else
		    {System.out.println(str1 + " and " + str2 +" are not anagrams");}
		
		  //converting them into char Arrays.
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		             //shorting of both arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		  
		           //checking equality and printing the result.
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("Both strings are anagrams");
		}else
		   {System.out.println("Both strings are not anagrams");}
		

	}
	

					
						

}

	
	
