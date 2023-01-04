package com.masai;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProductHandler(@Valid @RequestBody Product product) throws ProductException{
		
		Product p1 = pService.registerProduct(product);
		
		return new ResponseEntity<Product>(p1,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProductHandler() throws ProductException{
		
		List<Product> list = pService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(list,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/productDTO")
	public ResponseEntity<List<ProductDTO>> getNamePriceAndCateogory() throws ProductException{
		
		List<ProductDTO> list = pService.getProductNameQtyPrice();
		
		
		return new ResponseEntity<List<ProductDTO>>(list,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> updateProductHandler(@Valid @RequestBody Product product) throws ProductException{
		
		Product p1 = pService.updateProdcut(product);
		
		
		return new ResponseEntity<Product>(p1,HttpStatus.ACCEPTED);
	}s
	
	

}
