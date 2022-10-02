package com.question3;

public class CashPayment implements Payment{
	
	private int amount;
	
	

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}



	@Override
	public void doPayment() {
		
		System.out.println("Payment done using Cash "+ amount);
	}

}
