package com.question3;

public class Account {
	
	private String accountNumber;
	private double balance;
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		
	}

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		
	       this.balance = this.getBalance()+amount;

	}
	
	public <thorw> double withdraw(double amount) throws InsufficientFundsException{
		
		double balance = 0;
		
		if(amount<=this.getBalance()) {
			
			balance = this.getBalance()-amount;
			
			this.setBalance(balance);
			
			System.out.println("Withdraw of ₹ "+amount+" successful");
		}
		else {
			
			InsufficientFundsException e = new InsufficientFundsException("Insufficient Balance");
			
			throw e;
		}
	
		return balance;

	}
	

}
