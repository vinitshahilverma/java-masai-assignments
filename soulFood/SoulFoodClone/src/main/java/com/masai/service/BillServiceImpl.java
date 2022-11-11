package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.BillException;
import com.masai.model.Bill;
import com.masai.repository.BillRepo;

@Service
public class BillServiceImpl implements BillService{
    
	@Autowired
	private BillRepo bRepo;
	
	@Override
	public Bill addBill(Bill bill) throws BillException {
		
		if(bill==null) {
			throw new BillException("Please Enter Valid Input");
		}
		
		Bill b1 = bRepo.save(bill);
		
		
		return b1;
		
	}

}
