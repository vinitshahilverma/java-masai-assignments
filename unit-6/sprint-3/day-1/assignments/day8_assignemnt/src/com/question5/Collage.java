package com.question5;

public class Collage {

	Person person;
	
	public Collage(Person person) {
		
		this.person = person;
		
	}

	public void doJob() {
		
		System.out.println("Job is started");
		
		 person.dotask();
		
	}

}
