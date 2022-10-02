package com.question3;

public class AccountDemo {

	public static void main(String[] args){
	
          try {
        	 Account a1 = new Account("12345",500);
        	 
        	 a1.deposit(1000);
        	 
        	 System.out.println("Remaining balance is "+a1.withdraw(20000));
          }
          catch(InsufficientFundsException e) {
        	  System.out.println(e.getMessage());
          }
	}

}
