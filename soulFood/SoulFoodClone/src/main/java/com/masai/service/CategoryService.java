package com.masai.service;

import com.masai.exception.CategoryException;
import com.masai.model.Category;

public interface CategoryService {
	
	public Category addCategory(Category category)throws CategoryException;

}
