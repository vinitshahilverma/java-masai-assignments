package com.question3;

public abstract class Evaluation {

      
	private final int numberOfQuestions = 0; 
	
	abstract void evalutaionTiming();
	
	void printNoOfQuestions(int  numberOfQuestions) {
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}
}
