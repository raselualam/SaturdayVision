package com.upskill.java_1;

public class Variables {
	
	/*	Variables in Java
			Local variable - variables declared in methods
			Instance OR global variable - Variables declared in Class level, outside method
			Static variable - variables belong to class and don't required creating object
			Method parameter - variables used as method parameter, pass data outside to inside of method */

	public static void main(String[] args) {
		String police = "Samiul";				//Local variable
		nj("Holland");
		System.out.println(fbi);
	}
	
	static String tropper = "Tayebba";			//Static variable 
	
	static String fbi = "Sahin";						//Instance OR global variable
	
	public void nyc(){
		String police = "Nabeel";				//Local variable
	}
	
	public void nassau(){
		String police = "Mohammad";				//Local variable
	}
	
	public static void nj(String tunnel){				//Method parameter
		System.out.println(tunnel);
	}
}