package com.masai.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InsurancePolicy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Min(value = 11,message = "Policy number should be of at least 11 digits")
	private Long policyNumber;
	@Past(message="Date should be in Past")
	private LocalDateTime expiryDate;
	private Double monthlyPremium;
	private String customerName;
	private String customerAddress;
	
	@Size(min = 10,max =10,message= "Number should be 10 digits long")
	private Long MobileNumber;
	
	@Min(18)
	@Max(60)
	private Integer customerAge;
	
	@Email(message="Invalid Email id")
	private String emailAddress;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InsurancePolicy other = (InsurancePolicy) obj;
		return Objects.equals(MobileNumber, other.MobileNumber)
				&& Objects.equals(customerAddress, other.customerAddress)
				&& Objects.equals(customerAge, other.customerAge) && Objects.equals(customerName, other.customerName)
				&& Objects.equals(emailAddress, other.emailAddress) && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(monthlyPremium, other.monthlyPremium)
				&& Objects.equals(policyNumber, other.policyNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(MobileNumber, customerAddress, customerAge, customerName, emailAddress, expiryDate,
				monthlyPremium, policyNumber);
	}
	
	

}
