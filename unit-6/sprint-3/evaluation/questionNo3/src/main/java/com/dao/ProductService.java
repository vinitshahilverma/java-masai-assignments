package com.dao;

import java.util.List;

import com.bean.Product;
import com.bean.ProductException;

public interface ProductService {
	
	public boolean addProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(int productId)throws ProductException;
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice)throws ProductException;

}
