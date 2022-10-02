package com.question3;

public class Main {
	
	public static void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			 
			System.out.println("Its a DSA Evaluation");
			
			Evaluation d1 = new  DsaEvaluation();
			d1.printNoOfQuestions(5);
			d1.evalutaionTiming();
			 
		}
		
		else {
			
           System.out.println("Its a Coding Evaluation");
			Evaluation d1 = new  DsaEvaluation();
			d1.printNoOfQuestions(4);
			d1.evalutaionTiming();
			
		}
		
	}

	public static void main(String[] args) {
		
		Evaluation e1 = new DsaEvaluation();
		messageToStudents(e1);
		
		Evaluation d1 = new CodingEvaluation();
		messageToStudents(d1);
		
	}

}
