package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InsuranceException;
import com.masai.model.InsurancePolicy;
import com.masai.service.InsuranceService;



@RestController
public class InsuranceController {
	
	@Autowired
	private InsuranceService iService;
	
	@GetMapping("/insurances")
	public ResponseEntity<List<InsurancePolicy>> getAllInsuranceHandler() throws InsuranceException{
		
		List<InsurancePolicy> list = iService.getAllInsurance();
		
		return new ResponseEntity<List<InsurancePolicy>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/insurances")
	public ResponseEntity<InsurancePolicy> addInsuranceHandler(@Valid @RequestBody InsurancePolicy ip) throws InsuranceException{
		
		InsurancePolicy ip1 = iService.addInsurancePolicy(ip);
		
		return new ResponseEntity<InsurancePolicy>(ip1,HttpStatus.CREATED);
	}
	
	@GetMapping("/insurance/{id}")
    public ResponseEntity<InsurancePolicy> getInuranceByIdHandler(@PathVariable("id") Long id) throws InsuranceException{
		
		InsurancePolicy ip1 = iService.getInsurancePolicyById(id);
		
		return new ResponseEntity<InsurancePolicy>(ip1,HttpStatus.OK);
	}
	
	@DeleteMapping("/insurance/{id}")
    public ResponseEntity<InsurancePolicy> deleteInuranceByIdHandler(@PathVariable("id") Long id) throws InsuranceException{
		
		InsurancePolicy ip1 = iService.deleteInsurancePolicy(id);
		
		return new ResponseEntity<InsurancePolicy>(ip1,HttpStatus.OK);
	}
	
	@PutMapping("/insurance/{id}")
    public ResponseEntity<InsurancePolicy> updateInuranceByIdHandler(@Valid @RequestBody InsurancePolicy ip,@PathVariable("id") Long id) throws InsuranceException{
		
		InsurancePolicy ip1 = iService.updateInsurancePolicy(id, ip);
		
		return new ResponseEntity<InsurancePolicy>(ip1,HttpStatus.CREATED);
	}

}
