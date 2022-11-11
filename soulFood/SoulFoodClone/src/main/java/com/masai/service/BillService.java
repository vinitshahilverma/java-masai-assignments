package com.masai.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.masai.exception.BillException;
import com.masai.exception.CoustmerException;
import com.masai.model.Bill;

public interface BillService {
	
	public Bill addBill(Bill bill)throws BillException;
	
	public Bill updateBill(Bill bill)throws BillException;
	
	public Bill removeBill(Integer bid)throws BillException;
	
	public Bill viewBill(Integer bid)throws BillException;
		
	public List<Bill> viewAllBills(LocalDate startDate,LocalDate endDate)throws BillException;
	
	public List<Bill> viewBillByCoustmerId(Integer custId)throws BillException,CoustmerException;
		
	public Double CalculateTotalCost(Bill bill)throws BillException;

}
