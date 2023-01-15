package com.geektrust.model;

//extends vehicle abstract class

public class Truck extends Vehicle {

	public Truck() {
		//Initiating fixed toll Charge for the vehicle type with the help of super class;
		super(200);
	}

	public Truck(boolean returnJourney, Integer fastag_balance, Integer toll_Charge, String vehicle_Number) {
		super(returnJourney, fastag_balance, toll_Charge, vehicle_Number);
	}
}
