package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.model.FIR;
import com.masai.repository.FIRrepo;
import com.masai.service.FIRService;

@RestController
@RequestMapping("/masaifir")
public class FIRController {
	
	@Autowired
	private FIRService fService;
	
	@PostMapping("/user/fir")
	public ResponseEntity<FIR> registerFIRHandler(@RequestBody  FIR fir) throws FIRException{
		
		FIR fir1 = fService.registerFIR(fir);
		
		return new ResponseEntity<FIR>(fir1,HttpStatus.CREATED);
		
	}

}
