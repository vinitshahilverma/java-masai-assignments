package com.question1;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
		
	}

	@Override
	public void eat() throws AnimalException {
		
		System.out.println("Tiger is Eating");
		
	}
	
	public static void main(String[] args) {
		
		
		 try {
			 
			 Animal ae = new Tiger();
			 
			 ae.eat();
			 
		 }catch(AnimalException ae) {
			 
			 ae.getMessage();
		 }
		 
		 
		
		
	}

}
