package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepo cRepo;

	@Override
	public Category addCategory(Category category) throws CategoryException {
		
		if(category==null) {
			throw new CategoryException("Please enter valid Input");
		}
		
		Category cat = cRepo.save(category);
		
		
		return cat;
	}

}
