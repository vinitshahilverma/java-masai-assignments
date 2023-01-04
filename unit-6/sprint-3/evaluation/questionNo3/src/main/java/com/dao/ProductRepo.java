package com.dao;

import java.util.List;

import com.bean.Product;

public interface ProductRepo {
	
	public boolean insertProductDetails(Product product);
	public List<Product> getAllProductDeatails();
	public Product findProduct(int productId);
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice);
 
}
