package com.masai.bean;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PartTimeEmployee extends Person{

	private int salaryPerHour;
	private int consultant_code;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int id, String name, int age, int salaryPerHour, int consultant_code) {
		super(id, name, age);
		this.salaryPerHour = salaryPerHour;
		this.consultant_code = consultant_code;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getConsultant_code() {
		return consultant_code;
	}

	public void setConsultant_code(int consultant_code) {
		this.consultant_code = consultant_code;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [salaryPerHour=" + salaryPerHour + ", consultant_code=" + consultant_code + "]";
	}
     
	public void writeObject(ObjectOutputStream out) throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	public void readObject(ObjectInputStream in) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
}
