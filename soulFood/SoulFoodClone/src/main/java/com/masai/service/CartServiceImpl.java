package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CartException;
import com.masai.model.FoodCart;
import com.masai.repository.CartRepo;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepo cRepo;

	@Override
	public FoodCart addFoodCart(FoodCart cart) throws CartException {
		
		if(cart==null) {
			throw new CartException("Please Enter valid Input");
		}
		
		FoodCart fcart = cRepo.save(cart);
		
		return fcart;
		
	}

}
