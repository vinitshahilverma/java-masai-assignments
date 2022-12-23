package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.repository.DriverRepo;

@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	private DriverRepo dRepo;

	@Override
	public Driver addDriver(Driver driver) throws DriverException {
		
		  if(driver==null) {
			  throw new DriverException("Driver details can't be null");
		  }
		  else {
			  driver = dRepo.save(driver);
			  return driver;
		  }
		
	}

}
