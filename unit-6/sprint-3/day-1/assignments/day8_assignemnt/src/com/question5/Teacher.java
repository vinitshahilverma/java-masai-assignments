package com.question5;

public class Teacher implements Person{
	
	public void teaches() {
		
		System.out.println("Teacher teaches");
		
	}

	@Override
	public void dotask() {
		
		teaches();
		
	}

}
