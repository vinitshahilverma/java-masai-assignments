package com.question2;
//example of this keyword
public class This {
    
	int roll;
	String name;
	
	This(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	public void fun1() {
		System.out.println("Inside fun1 of This class");
	}
	
	void printDetails() {
		System.out.println(this.roll);
		System.out.println(this.name);
	}
}
