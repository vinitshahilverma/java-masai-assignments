package com.masai.service;

import com.masai.exception.CoustmerException;
import com.masai.model.Coustmer;

public interface CoustmerService {
	
	public Coustmer AddCoustmer(Coustmer coustmer)throws CoustmerException;

}
