package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ItemException;
import com.masai.model.Item;
import com.masai.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepo iRepo;

	@Override
	public Item addItem(Item item) throws ItemException {
		   
		if(item==null) {
			throw new ItemException("Please Enter Valid Input..");
		}
		
	    Item item1= iRepo.save(item);
		
		
		return item1;
	}

}
