package com.upskill.java_3;

public class Loops {
	
	/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoop();
	}
	
	public static void practiceForLoop(){						//For Loop - Do again and again upto upper limit
		int i ;													//Initialize the variable
		for(i = 1; i <=10; i++){								//Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops Number = " + i);		//Statement
		}
	}
	
	public static void practiceWhileLoop(){						//While Loop - Do again and again upto condition match
		int i = 1;												//Initialize the variable
		while(i<=10){											//Setting Condition	
			System.out.println("While Loops Number = " + i);	//Statement
			i++;												//Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;												//Do While Loop - Do action then match condition
		do {													//Initialize the variable
			System.out.println("Do While Loops Number = " + i); //Statement
			i++;												//Increment or Decrement
		} while (i<=0);											//Checking condition
	}
	
	public static void practiceInfiniteLoop(){					//Infinite Loop - never ending loop
		int i ;													//Initialize the variable
		for(i = 1;  ; i++){										//Setting No Upper limit
			System.out.println("Infinite Loops Number = " + i);	//Statement
		}
	}
	
	public static void practiceNestedForLoop(){
		int i;
		int j;
		
		for(i=1; i<=10; i++){
			for (j = 1; j<=10; j++){
				int multipicationTable = i * j;
				System.out.print(multipicationTable + " ");
			}
			System.out.println(" ");
		}
	}
	
}