package com.question4;

public class LowBalanceException extends Exception{
	
	public LowBalanceException() {
		
	}
	
	public LowBalanceException(String message) {
		super(message);
	}

}
