package com.masai.service;

import com.masai.exception.CartException;
import com.masai.model.FoodCart;
import com.masai.model.Item;

public interface CartService {
	
	public FoodCart addFoodCart(FoodCart cart)throws CartException;

}
