package com.masai.service;

import com.masai.exception.ResturantException;
import com.masai.model.Resturant;

public interface ResturantService {
	
	public Resturant addResturant(Resturant resturant)throws ResturantException;

}
