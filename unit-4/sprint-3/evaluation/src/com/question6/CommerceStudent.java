package com.question6;

public class CommerceStudent implements Student {
     
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	public CommerceStudent() {
		
	}
	
    public CommerceStudent(int acc, int eco, int buss) {
		  
    	this.accountMarks = acc;
    	this.economicsMarks = eco;
    	this.businessStudiesMarks = buss;
	}

	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	@Override
	public double findPercentage() {
		
		double precentage = ((this.getAccountMarks()+this.getBusinessStudiesMarks()+
				this.getEconomicsMarks())/3);
		
		return precentage;
	}
    
    
}
