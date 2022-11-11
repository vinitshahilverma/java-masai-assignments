package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ResturantException;
import com.masai.model.Resturant;
import com.masai.service.ResturantService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ResturantController {
	
	@Autowired
	private ResturantService rService;
	
	@PostMapping("/returant")
	public ResponseEntity<Resturant> registerResturantHandler(@RequestBody Resturant resturant) throws ResturantException{
		
		   Resturant r1 = rService.addResturant(resturant);
		   
		   return new ResponseEntity<Resturant>(r1,HttpStatus.CREATED);
		
	}

}
