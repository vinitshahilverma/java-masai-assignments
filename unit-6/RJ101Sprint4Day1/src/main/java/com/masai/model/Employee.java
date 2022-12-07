package com.masai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;

	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private Integer salary;

	public Employee(EmployeeDto dto) {
		super();
		this.firstname = dto.getFirstname();
		this.lastname = dto.getLastname();
		this.email = dto.getEmail();
		this.phone = dto.getPhone();
		this.salary = dto.getSalary();
	}

	public void updateEmployee(Employee emp) {
		this.firstname = emp.getFirstname();
		this.lastname = emp.getLastname();
		this.email = emp.getEmail();
		this.phone = emp.getPhone();
		this.salary = emp.getSalary();
	}

}
