package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CartException;
import com.masai.exception.CoustmerException;
import com.masai.model.FoodCart;
import com.masai.repository.CartRepo;
import com.masai.repository.CoustmerRepo;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepo cRepo;
	
//	@Autowired
//	private CoustmerRepo crRepo;

	@Override
	public FoodCart addFoodCart(FoodCart cart) throws CartException {
		
		if(cart==null) {
			throw new CartException("Please Enter valid Input");
		}
		
		FoodCart fcart = cRepo.save(cart);
		
		return fcart;
		
	}

//	@Override
//	public Integer findFoodCartId(Integer custId) throws CartException, CoustmerException {
//		
////		    crRepo.findById(custId)
////		          .orElseThrow(() -> new CoustmerException("Coustmer not found....."));
////		    
////		    Integer id = cRepo.getCartByCoustmerId(custId);
////		    
////		    return id;
//		        
//	}

}
