package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.service.DriverService;



@RestController
@RequestMapping("/masaiCab")
public class DriverController {
	
	
	@Autowired
	private DriverService dService;
	
	@PostMapping("driver/register")
	public ResponseEntity<Driver> registerDriverHandler(@Valid @RequestBody Driver driver) throws DriverException{
		
		Driver driver2 = dService.addDriver(driver);
		
		return new  ResponseEntity<Driver>(driver2,HttpStatus.CREATED);
	}

}
