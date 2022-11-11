package com.masai.service;

import com.masai.exception.ItemException;
import com.masai.model.Item;

public interface ItemService {

	public Item addItem(Item item)throws ItemException;

}
