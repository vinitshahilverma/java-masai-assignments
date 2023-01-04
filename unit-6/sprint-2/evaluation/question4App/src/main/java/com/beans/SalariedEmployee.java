package com.beans;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee {

	private int salary;
	private String email;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int empId, String name) {
		super(empId, name);
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int empId, String name, int salary, String email) {
		super(empId, name);
		this.salary = salary;
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}

}
