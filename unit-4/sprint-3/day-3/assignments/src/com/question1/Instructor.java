package com.question1;

public class Instructor extends Person{
    
	
	int instructorId;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", address=Address [" + "city= " + add.city + ", state= " + add.state + ", pinCode= " + add.pinCode + " ]]";
	}
	
		
	
}
