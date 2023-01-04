package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
    
	@NotEmpty
	@Size(min=3,max=15,message="Name length should be between 3 to 15")
	private String empName;
	
	@NotNull
	private Integer salary;
	
	@NotEmpty
	@Size(min=3,max=15,message="Address length should be between 3 to 15")
	private String address;
	
	@NotEmpty
	@Email
	private String email;
	
    @NotEmpty
    @Min(value=10,message="Mobile length should be of 10")
	private String mobile;
    
    @NotEmpty
    @Pattern(regexp = "[a-zA-z0-9]{6}",message="password length must be not less than 6")
	private String password;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, Integer salary, String address, String email, String mobile, String password) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}

}
