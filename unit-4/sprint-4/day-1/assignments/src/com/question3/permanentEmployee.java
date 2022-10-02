package com.question3;

public class permanentEmployee extends Employee{

     private double basicPay;
     
    

	public permanentEmployee(int id, String name,double basic) {
		super(id,name);
	      this.employeeId = id;
	      this.employeeName = name;
	      this.basicPay = basic;
	      
	      this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		 
		double pfAmount = this.getBasicPay()*0.12;
		double salary = this.getBasicPay() - pfAmount;
		
		this.setSalary(salary);
		         
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	
 
}
