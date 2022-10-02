package com.day4_assignment;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		
		System.out.println("Total killings by lions in jungle = "+ totalDeaths);
	}
	
	void thinking() {
		
		if(isHungry==false) {
			System.out.println(name+" "+"is sleeping");
		}
		if(isHungry==true && age>12) {
			totalDeaths+=2;
			System.out.println(name+" "+"has eaten two animals");
		}
		if(isHungry==true && age<=12 && age>=2) {
			totalDeaths+=1;
			System.out.println(name+" "+"has eaten one animal");
		}
		if(isHungry==true && age<2) {
			
			System.out.println(name+" "+"is calling mom");
		}
	}
	
	public static void main (String[] args) {
		
		 totalDeaths =0;
		
	      Lion lion1 = new Lion();
	      lion1.name = "lion1";
	      lion1.isHungry = true;
	      lion1.age = 10;
	      lion1.thinking();
	
	       Lion lion2 = new Lion();
	       lion2.name = "lion2";
	       lion2.age = 14;
	       lion2.isHungry = true;
	       lion2.thinking();
	      
	       
	       Lion lion3 = new Lion();
	       lion3.name = "lion3";
	       lion3.age = 1;
	       lion3.isHungry = true;
	       lion3.thinking();
	       
	       printKillings();
	       
	}

}
