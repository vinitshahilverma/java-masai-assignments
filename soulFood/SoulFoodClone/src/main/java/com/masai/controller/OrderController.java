package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.OrderException;
import com.masai.model.OrderDetails;
import com.masai.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService oService;
	
	@PostMapping("/order")
	public ResponseEntity<OrderDetails> registerOrderHandler(@RequestBody OrderDetails order) throws OrderException{
		
		 OrderDetails order1 = oService.addOrder(order);
		 
		 
		 return new ResponseEntity<OrderDetails>(order1,HttpStatus.CREATED);
	}

}
