package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo pRepo;

	@Override
	public Product registerProduct(Product p) throws ProductException {
		
		Product savedProduct = pRepo.save(p);
		
		if(savedProduct==null) {
			throw new ProductException("Product not saved......");
		}
		
		return savedProduct;
		
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		
		   List<Product> list = pRepo.findAll();
		   
		   if(list.size()==0) {
			   throw new ProductException("No products are there...");
		   }
		   
		   return list;
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		     
		Product product = pRepo.findById(p.getProductId())
				.orElseThrow(() -> new ProductException("Product not found..."));
		
		      product = pRepo.save(p);
		
		return product;
		
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		
		      Product product = pRepo.findById(pid)
		    		                 .orElseThrow(() -> new ProductException("Product not found..."));
		      
		      pRepo.delete(product);
		      
		      return product;
		   
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		       
		    List<Product> list = pRepo.findByCategory(category);
		    
		    if(list.size()==0) {
		    	throw new ProductException("No Product found....");
		    }
		    
		    return list;
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		         
		List<ProductDTO> list = pRepo.getNamePriceAndProduct();
		
		 if(list.size()==0) {
		    	throw new ProductException("No Product found....");
		    }
		 
		 return list;
	}

}
