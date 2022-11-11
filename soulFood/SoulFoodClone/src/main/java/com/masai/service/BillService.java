package com.masai.service;

import com.masai.exception.BillException;
import com.masai.model.Bill;

public interface BillService {
	
	public Bill addBill(Bill bill)throws BillException;

}
