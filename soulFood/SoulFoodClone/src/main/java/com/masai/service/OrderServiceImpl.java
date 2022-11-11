package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.OrderException;
import com.masai.model.OrderDetails;
import com.masai.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepo oRepo;

	@Override
	public OrderDetails addOrder(OrderDetails order) throws OrderException {
		
		if(order==null) {
			throw new OrderException("Please enter valid Input");
		}
		
		OrderDetails o1 = oRepo.save(order);
		
		return o1;
		
	}

}
