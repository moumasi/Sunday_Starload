package com.upskill.java2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) { 
		  //Array store multiple data using index
		
		int[]ageStarload = new int[] {25,30,32,35,37};
		//System.out.println("student age: "+ageStarload[0]);
		//System.out.println("Total student: "+ageStarload.length);
		
		String[]nameStarload = new String[] {"Nazmin", "Arobi","Elena","Mohaimin" ,"Nazmin"};
		//System.out.println("student Name: "+nameStarload[1]);
		//System.out.println("Total student: "+nameStarload.length);
		
		for(int a = 0; a<nameStarload.length; a++  ) {
			System.out.println(nameStarload[a]+ "");
		}
		//multi-Dimentional Array is an array of arrays which allowing for more than one index to access the elements
		
		int[][]ageStarload2d  = {{1,2,3,4},
				                 {5,6,7}};
		                          
		//System.out.println("Student age 2d: "+ ageStarload2d[1][2]);
		
		String[][]nameStarload2D = {{"Nazmin","Arobi","Elena","Mohaimin"},
				                    {"Soumik","Ahsan","Tareq"}};
		//System.out.println("Studend name 2d: " +nameStarload2D[0][3]);
		
		HashMap<String, Integer> student = new 	HashMap<String, Integer>();
		   
		student.put("Nazmin",32);     //Hashmap store data with key and value pair ,it has to be one uniqe key 
		                                //but value could be duplicate
		student.put("Tareq", 35);
		student.put("Arobi", 25) ;
		student.put("Elena", 25); 
		student.put("Ahsan", 26);
		//System.out.println("Hashmap student age: "+ student.get("Ahsan"));
		     
		HashMap<String, String> city = new HashMap<String, String>();
		
		city.put("NewYork", "Bronx"); 
		city.put("Michigan","Detroit"); 
		city.put("Texas","Dallas");
		System.out.println("City name: "+ city.get(""));
		
		Hashtable<String, String> region = new Hashtable<String, String>(); //Hashtable does not allow null value
		region.put("BD","Asia");                                      //Hashtable is more syncronyze
		region.put("USA", "America");
		region.put("Dubai","Middleeast");
		//System.out.println("Region: "+ region.get("null"));
		
		HashSet<String> car = new HashSet<String>(); //Hashset does not allow duplicate value
		car.add("Toyota"); 
		car.add("Honda"); 
		car.add("BMW"); 
		car.add("Kia");
		//System.out.println("Car Brand names: "+ car);
		}
	 
	}


