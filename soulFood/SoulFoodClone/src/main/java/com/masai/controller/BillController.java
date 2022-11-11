package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BillException;
import com.masai.model.Bill;
import com.masai.service.BillService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BillController {
	
	@Autowired
	private BillService bService;
	
	@PostMapping("/bill")
	public ResponseEntity<Bill> registeBillHandler(@RequestBody Bill bill) throws BillException{
		
		Bill bill1 = bService.addBill(bill);
		
		
		return new ResponseEntity<Bill>(bill1,HttpStatus.CREATED);
		
	}

}
