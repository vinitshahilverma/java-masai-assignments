package com.geektrust.model;

//extends vehicle abstract class

public class Bus extends Vehicle {

	public Bus() {
	    //Initiating fixed toll Charge for the vehicle type with the help of super class;
		super(200);
	}

	public Bus(boolean returnJourney, Integer fastag_balance, Integer toll_Charge, String vehicle_Number) {
		super(returnJourney, fastag_balance, toll_Charge, vehicle_Number);
	}

}
