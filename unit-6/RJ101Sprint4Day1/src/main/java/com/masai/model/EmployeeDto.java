package com.masai.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	@Size(min = 3, message = "firstname should be atleast have 3 characters")
	private String firstname;

	@Size(min = 3, message = "lastname should be atleast have 3 characters")
	private String lastname;

	@Email(message = "Please Enter Valid Email address")
	private String email;

	@Pattern(regexp = "^[0-9]{10}", message = "phone should be of 10 digits")
	private String phone;

	@Min(value = 1000, message = "salary should be atleat 1000 Rs")
	private Integer salary;

	public EmployeeDto(Employee emp) {
		super();
		this.firstname = emp.getFirstname();
		this.lastname = emp.getLastname();
		this.email = emp.getEmail();
		this.phone = emp.getPhone();
		this.salary = emp.getSalary();
	}

}
