package com.masai.service;

import java.util.List;

import com.masai.exception.InsuranceException;
import com.masai.model.InsurancePolicy;


public interface InsuranceService {
	
	public List<InsurancePolicy> getAllInsurance()throws InsuranceException;
	
	public InsurancePolicy getInsurancePolicyById(Long id)throws InsuranceException;
	
	public InsurancePolicy updateInsurancePolicy(Long id,InsurancePolicy ip)throws InsuranceException;
	
	public InsurancePolicy deleteInsurancePolicy(Long id)throws InsuranceException;
	
	public InsurancePolicy addInsurancePolicy(InsurancePolicy ip)throws InsuranceException;
	

}
