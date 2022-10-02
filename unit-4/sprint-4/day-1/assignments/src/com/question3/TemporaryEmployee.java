package com.question3;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;

	public TemporaryEmployee(int id, String name,int hours, int wages) {
		super(id, name);
		this.employeeId = id;
		this.employeeName = name;
		this.hoursWorked = hours;
		this.hourlyWages = wages;
		
		this.calculateSalary();
	}

	@Override
	void calculateSalary() {

      double salary = this.hoursWorked * this.hourlyWages;
      
      this.setSalary(salary);
		
	}

}
