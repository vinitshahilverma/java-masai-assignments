package com.geektrust.model;

//Vehicle abstract class for code reusability.

public abstract class Vehicle {
    
	//to check if it is return journey or not 
	private boolean returnJourney;
    
	//to store the FASTAG balance
	private Integer fastag_balance;
     
    //to store the fixed toll for the vehicle type
	private Integer toll_Charge;
    
	//to store the vehicle number
	private String vehicle_Number;

	public boolean isReturnJourney() {
		return returnJourney;
	}

	public void setReturnJourney(boolean returnJourney) {
		this.returnJourney = returnJourney;
	}

	public Integer getFastag_balance() {
		return fastag_balance;
	}

	public void setFastag_balance(Integer fastag_balance) {
		this.fastag_balance = fastag_balance;
	}

	public Integer getToll_Charge() {
		return toll_Charge;
	}

	public void setToll_Charge(Integer toll_Charge) {
		this.toll_Charge = toll_Charge;
	}

	public String getVehicle_Number() {
		return vehicle_Number;
	}

	public void setVehicle_Number(String vehicle_Number) {
		this.vehicle_Number = vehicle_Number;
	}

	public Vehicle(boolean returnJourney, Integer fastag_balance, Integer toll_Charge, String vehicle_Number) {
		super();
		this.returnJourney = returnJourney;
		this.fastag_balance = fastag_balance;
		this.toll_Charge = toll_Charge;
		this.vehicle_Number = vehicle_Number;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Integer toll_Charge) {
		this.toll_Charge = toll_Charge;
	}

}
