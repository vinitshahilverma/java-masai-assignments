package com.question4;

public class Bank {
      
	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}
	
	public static void printBank() {
         new Bank();    
	}
}
