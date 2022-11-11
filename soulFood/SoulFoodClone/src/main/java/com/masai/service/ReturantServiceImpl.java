package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ResturantException;
import com.masai.model.Resturant;
import com.masai.repository.ResturantRepo;

@Service
public class ReturantServiceImpl implements ResturantService{
    
	@Autowired
	private ResturantRepo rRepo;
	
	@Override
	public Resturant addResturant(Resturant resturant) throws ResturantException{
		  
		if(resturant==null) {
			
			throw new ResturantException("Please Enter valid Input...");
		}
		
		Resturant r1 = rRepo.save(resturant);
		
		return r1;
		
	}

}
