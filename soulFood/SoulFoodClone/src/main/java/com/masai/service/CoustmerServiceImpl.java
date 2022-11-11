package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CoustmerException;
import com.masai.model.Coustmer;
import com.masai.repository.CoustmerRepo;
@Service
public class CoustmerServiceImpl implements CoustmerService{
	
	@Autowired
	private CoustmerRepo cRepo;

	@Override
	public Coustmer AddCoustmer(Coustmer coustmer) throws CoustmerException{
		  
		 if(coustmer==null) {
			 throw new CoustmerException("Please Enter Valid Input");
		 }
		 
		 Coustmer c1 = cRepo.save(coustmer);
		 
		 return c1;
	}

	

}
