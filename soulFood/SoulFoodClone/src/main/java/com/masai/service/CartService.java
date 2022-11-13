package com.masai.service;

import com.masai.exception.CartException;
import com.masai.exception.CoustmerException;
import com.masai.exception.ItemException;
import com.masai.model.Coustmer;
import com.masai.model.FoodCart;
import com.masai.model.Item;

public interface CartService {
	
	public FoodCart addFoodCart(FoodCart cart)throws CartException;
	
	public FoodCart addItemToFoodCart(Integer id,Item item)throws ItemException,CartException;
	
	public FoodCart increaseQuantity(Integer id,Item item,Integer quantity)throws ItemException,CartException;
	
	public FoodCart reduceQuantity(Integer id,Item item,Integer quantity)throws ItemException,CartException;
	
	public FoodCart removeItemFormCart(Integer id,Item item)throws ItemException,CartException;
	
	public FoodCart deleteCart(FoodCart cart)throws CartException;
}
