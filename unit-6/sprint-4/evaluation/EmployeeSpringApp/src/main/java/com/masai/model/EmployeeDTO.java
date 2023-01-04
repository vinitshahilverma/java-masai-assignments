package com.masai.model;

public class EmployeeDTO {

	private String name;
	private String address;
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
