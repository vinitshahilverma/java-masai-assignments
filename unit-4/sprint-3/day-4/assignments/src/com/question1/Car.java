package com.question1;

public class Car {
      
	private int numberOfPassenger;
	private int numberOfKms;
	
	public Car() {
		
	}
	
	public Car(int noOfPass, int noOfKms) {
		this.numberOfPassenger = noOfPass;
		this.numberOfKms = noOfKms;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}
