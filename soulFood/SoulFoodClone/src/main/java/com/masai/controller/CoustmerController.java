package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CoustmerException;
import com.masai.model.Coustmer;
import com.masai.service.CoustmerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CoustmerController {
	
	@Autowired
	private CoustmerService cService;
	
	@PostMapping("/coustmer")
	public ResponseEntity<Coustmer> registerNewCoustmerHandler(@RequestBody Coustmer coustmer) throws CoustmerException{
		
		   Coustmer c1 = cService.AddCoustmer(coustmer);
		   
		   
		  return new ResponseEntity<Coustmer>(c1,HttpStatus.CREATED);
		
	}

}
