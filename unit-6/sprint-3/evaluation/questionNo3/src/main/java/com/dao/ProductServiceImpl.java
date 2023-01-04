package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.bean.ProductException;

@Service
public class ProductServiceImpl implements ProductService{
   
	@Autowired
	private ProductRepoImpl p1; 
	
	public boolean addProduct(Product product) {
		return p1.insertProductDetails(product);
	}

	public List<Product> getAllProduct() {
		return p1.getAllProductDeatails();
	}

	public Product getProductById(int productId) throws ProductException {
		return p1.findProduct(productId);
	}

	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		return p1.getProductInPriceRange(fromPrice, toPrice);
	}
	
	

}
