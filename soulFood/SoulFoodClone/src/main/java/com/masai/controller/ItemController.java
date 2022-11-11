package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ItemException;
import com.masai.model.Item;
import com.masai.service.ItemService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService iService;
	
	@PostMapping("/item")
	public ResponseEntity<Item> registerItemHandler(@RequestBody Item item) throws ItemException{
		
		
		Item it = iService.addItem(item);
		
		return new ResponseEntity<Item>(it,HttpStatus.CREATED);
		
	}

}
