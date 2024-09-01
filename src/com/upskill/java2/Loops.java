package com.upskill.java2;      //Types of loop
                              //1.For Loop- Do again and again upto limit
                              //2.While loop- Do again and again upto condition match
public class Loops {          //3.Do while loop- Do action then match condition
                              //4.Infinite loop- Never ending loop
	public static void main(String[] args) {
		//practiceLoop();
		//practiceWhileLoop(); 
		//pracDowhileLoop();
		//pracInfiniteLoop();
		pracNestedForloop();

	}
	public static void practiceLoop() {   //For loops 
		int i;                            
		for(i = 1; i <= 10; i++) {
			System.out.println("For Loops number = " + i);
		}
	}
    public static void practiceWhileLoop() {    //While loop
    	int i = 1;
    	while(i<=10) {
    		System.out.println("While Loops number = " + i);
    		i++;
    	}
    }
    public static void pracDowhileLoop() {      //do while loop
    	int i= 1;
    	do {
    		System.out.println("Do while loops number = " +i);
    		i++;
    	}while(i<=20);
    	}
    public static void pracInfiniteLoop() {     //Infinite loop
    	int i;
    	for(i = 1; ; i++) {
    		System.out.println("Infinite loops number = " +i);	
    	}
    }
    public static void pracNestedForloop() {  //Nested for loop
    	int i;
    	int j;
    	for(i=1; i<=8; i++) {
    	  for(j=1; j<=8; j++) {
    		 System.out.println(i*j +"");
    	  }
    	  System.out.println("");
    	}
    }
    }

