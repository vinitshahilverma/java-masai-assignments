package com.question2;

public class Employee implements Comparable<Employee> {
   
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		
		this.empId = id;
		this.empName = name;
		this.salary = salary;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSalary()>o.getSalary()) {
			return 1;
		}
		
		else if(this.getSalary()<o.getSalary()) {
			  return -1;
		}
		
		else {
			
			return 0;
		}
	}
	
	
}
