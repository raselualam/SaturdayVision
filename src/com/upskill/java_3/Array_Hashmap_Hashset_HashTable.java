package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		int age = 30;											//Variable
		int[] ageVision = new int[]{21, 26, 28 , 30, 35};		//Array
		
		//Array index				 [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageVision[2]);
		System.out.println("Total student : " + ageVision.length);
		
		String[] nameVision = new String[]{"Tayeba", "Samiul", "Mili", "Riyan", "Jabed", "Fahim"};
		
		System.out.println("Student Name : " + nameVision[3]);
		System.out.println("Total Student Name: " + nameVision.length);
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("Tesla");
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Tayeba", 21);
		Student.put("Samiul", 19);
		Student.put("Mili", 24);
		Student.put("Riyan", 22);
		Student.put("Jabed", 26);
		
		System.out.println("Hashmap Student Age : " + Student.get("Mili"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " +Capital.get("BD"));	
	
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));


	}
}