package com.masai.service;

import com.masai.exception.OrderException;
import com.masai.model.OrderDetails;

public interface OrderService {
	
	public OrderDetails addOrder(OrderDetails order)throws OrderException;

}
