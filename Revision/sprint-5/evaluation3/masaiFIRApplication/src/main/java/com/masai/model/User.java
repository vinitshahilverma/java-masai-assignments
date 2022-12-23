package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    @Column(unique = true)
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "First Name should not contain numbers or special characters")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "First Name should not contain numbers or special characters")
	private String lastName;
	private String address;
	
	@Min(value=8,message="Age must be greater than 8 years..")
	private Integer age;
	
	@Pattern(regexp = "^[0-9]{10}", message = "Mobile number must have 10 digits")
	private String mobile;
	
	private String gender;
	
	 @NotNull
	 @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Invalid Password pattern. Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<FIR> firs = new ArrayList<>();

}
