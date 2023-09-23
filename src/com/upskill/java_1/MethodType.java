package com.upskill.java_1;

public class MethodType {
	
/* 	Types of Methods
	 
	1.Void Method			- Void keyword, its doesn't return any value 
	2.Static Method			- Static keyword, method belong to class and don't required creating object
	3.Return Type Method  	- Have to return data which declared while creating method 
 */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		System.out.println("UpSkill");
		weeklyIncomeStatic();
		
		MethodType myObj = new MethodType();		// ClassName ObjectName = new ClassName();
		myObj.annualIncomeVoid();
		
		System.out.println("My monthly Income = " + myObj.monthlyIncomeReturn());
	}
	
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}

	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//Return Type Method  
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
}
