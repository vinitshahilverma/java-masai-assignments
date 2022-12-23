package com.masai.bean;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends Person implements Externalizable{
	
	private int salary;
	private String dept;
	private String work_location;
	

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", work_location=" + work_location + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getWork_location() {
		return work_location;
	}

	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}

	public Employee(int id, String name, int age, int salary, String dept, String work_location) {
		super(id, name, age);
		this.salary = salary;
		this.dept = dept;
		this.work_location = work_location;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(salary);
		out.writeObject(dept);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	    salary = (int)in.readObject();
	    dept = (String)in.readObject();
	}

}
