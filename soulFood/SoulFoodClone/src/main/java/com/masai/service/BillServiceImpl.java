package com.masai.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.BillException;
import com.masai.exception.CoustmerException;
import com.masai.model.Bill;
import com.masai.model.Coustmer;
import com.masai.model.OrderDetails;
import com.masai.repository.BillRepo;
import com.masai.repository.CartRepo;
import com.masai.repository.CoustmerRepo;

@Service
public class BillServiceImpl implements BillService{
    
	@Autowired
	private BillRepo bRepo;
	
	@Autowired
	private CoustmerRepo cRepo;
	
//	@Autowired
//	private CartRepo crRepo;
//	
//	@Autowired
//	private OrderDetails oRepo;
	
	
	@Override
	public Bill addBill(Bill bill) throws BillException {
		
		if(bill==null) {
			throw new BillException("Please Enter Valid Input");
		}
		
		
		
		Bill b1 = bRepo.save(bill);
		
		
		return b1;
		
	}

	@Override
	public Bill updateBill(Bill bill) throws BillException {
		
	     Bill b1 = bRepo.findById(bill.getBillId())
	    		        .orElseThrow(()-> new BillException("Bill details not found..."));
	     
	      b1 = bRepo.save(bill);
	      
	      return b1;
		  
	}

	@Override
	public Bill removeBill(Integer bid) throws BillException {
		
		Bill b1 = bRepo.findById(bid)
		        .orElseThrow(()-> new BillException("Bill details not found..."));
		
		
		 bRepo.delete(b1);;
		 
		 
		 return b1;
		  
	}

	@Override
	public Bill viewBill(Integer bid) throws BillException {
		
		Bill b1 = bRepo.findById(bid)
		        .orElseThrow(()-> new BillException("Bill details not found..."));
		
		
		return b1;
		
	}

	@Override
	public List<Bill> viewAllBills(LocalDate startDate, LocalDate endDate) throws BillException {

		 List<Bill> list = bRepo.getBillByDate(startDate, endDate);
		
		if(list.size()==0) {
			throw new BillException("Bill details not found between "+ startDate + " and "+endDate);
		}
		
		return list;
		
	}

	@Override
	public List<Bill> viewBillByCoustmerId(Integer custId) throws BillException, CoustmerException {
		
		List<Bill> list = new ArrayList<>();
		
//		Coustmer coustmer = cRepo.findById(custId)
//		                         .orElseThrow(() -> new CoustmerException("No Coustemer found with the id: "+custId));
//		
		
		                     
		    
		return list;
	}

	@Override
	public Double CalculateTotalCost(Integer id) throws BillException {
		
		 Bill b1 = bRepo.findById(id)
 		        .orElseThrow(()-> new BillException("Bill details not found..."));
		 
		 return b1.getTotalCost();
		
	}

	@Override
	public Bill getBillByOrderId(Integer Id) throws BillException {
		
		Bill bill = bRepo.getBillByOrderId(Id);
		
		if(bill==null) {
			throw new BillException("Bill details not found...");
		}
		
		
		return bill;
		
	}

}
