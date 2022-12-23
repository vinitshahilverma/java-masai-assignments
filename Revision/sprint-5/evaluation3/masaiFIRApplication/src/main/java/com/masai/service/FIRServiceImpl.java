package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.model.FIR;
import com.masai.repository.FIRrepo;

@Service
public class FIRServiceImpl implements FIRService{
	
	@Autowired
	private FIRrepo fRepo;

	@Override
	public FIR registerFIR(FIR fir) throws FIRException {
		
	          if(fir!=null) {
	        	  throw new FIRException("Fir details can't be null");
	          }
	                
	          fir = fRepo.save(fir);
	          
	          return fir;
		
	}

}
