package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CartException;
import com.masai.exception.CoustmerException;
import com.masai.model.FoodCart;
import com.masai.service.CartService;



@RestController
public class CartController {
	
	@Autowired
	private CartService cService;
	
	@PostMapping("/foodCart")
	public ResponseEntity<FoodCart> registerCartHandler(@RequestBody FoodCart foodCart) throws CartException{
		
		FoodCart cart = cService.addFoodCart(foodCart);
		
		return new ResponseEntity<FoodCart>(cart,HttpStatus.CREATED);
		
	}
	
//	@GetMapping("/coustmerId")
//	public ResponseEntity<Integer> getIdOfCart(@PathVariable("custId")Integer custId) throws CartException, CoustmerException{
//		
//		Integer id = cService.findFoodCartId(custId);
//		
//		return new ResponseEntity<Integer>(id,HttpStatus.OK);
//		
//	}

}
