package com.question3;

public class Loan {
	
	
	private Loan() {
		
	}
    
	public double calculateLoanAmount(Employee employeeObj) {
		
		double loan = 0;
		
		if(employeeObj instanceof permanentEmployee) {
			
			permanentEmployee e1 = (permanentEmployee)employeeObj;
			
			
			loan = (e1.getSalary()*15)/100;
			
		}
		else {
			
			TemporaryEmployee t1 = (TemporaryEmployee)employeeObj;
			
			loan = (t1.getSalary()*10)/100;
		}
		
		
		
		return loan;
		
		
	}
	
	public static Loan removePrivate() {
		
		  Loan loan = new Loan();
		  
		  return loan;
		
	}
	 
}
