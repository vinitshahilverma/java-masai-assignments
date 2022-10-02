package com.question4;

import java.util.Objects;

public class Employee {
    
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	private Department  department = new Department();
	
	public Employee(){
		
	}
	
	public Employee(int id, String name,double salary, int did, String dname) {
		
		this.employeeId =id;
		this.employeeName = name;
		this.employeeSalary = salary;
		this.department.setDepartmentId(did);
		this.department.setDepartmentName(dname);
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
//				+ employeeSalary + "]";
//	}
	

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeSalary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Double.doubleToLongBits(employeeSalary) == Double.doubleToLongBits(other.employeeSalary);
	}

	
   
	
	
}
