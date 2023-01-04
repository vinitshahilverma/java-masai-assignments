package com.beans;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee {

	private int noOfWorkingDays;
	private int costOfPerDay;
	private String mobileNumber;

	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costOfPerDay=" + costOfPerDay
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostOfPerDay() {
		return costOfPerDay;
	}

	public void setCostOfPerDay(int costOfPerDay) {
		this.costOfPerDay = costOfPerDay;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public ContractualEmployee(int empId, String name, int noOfWorkingDays, int costOfPerDay, String mobileNumber) {
		super(empId, name);
		this.noOfWorkingDays = noOfWorkingDays;
		this.costOfPerDay = costOfPerDay;
		this.mobileNumber = mobileNumber;
	}

	public ContractualEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractualEmployee(int empId, String name) {
		super(empId, name);
		// TODO Auto-generated constructor stub
	}

}
