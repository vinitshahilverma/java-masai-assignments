package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CartException;
import com.masai.model.FoodCart;
import com.masai.service.CartService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CartController {
	
	@Autowired
	private CartService cService;
	
	@PostMapping("/foodCart")
	public ResponseEntity<FoodCart> registerCartHandler(@RequestBody FoodCart foodCart) throws CartException{
		
		FoodCart cart = cService.addFoodCart(foodCart);
		
		return new ResponseEntity<FoodCart>(cart,HttpStatus.CREATED);
		
	}

}
