package com.masai.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "First Name should not contain numbers or special characters")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "First Name should not contain numbers or special characters")
	private String lastName;
	
	@Pattern(regexp = "^[0-9]{10}", message = "Mobile number must have 10 digits")
	private Long mobileNumber;
	
	 @NotNull
	 @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Invalid Password pattern. Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	private int[] currentPosition = new int[2]; 

}
