package com.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bean.Product;
import com.bean.ProductException;

@Controller
public class Presentation {
	
	@Autowired
	private ProductService pService;
	
	Scanner sc =  new Scanner(System.in);
	
	public void insertProduct() {
		
		System.out.println("Enter product Name");
		String name = sc.next();
		
		System.out.println("Enter product quantity");
		int quantity = sc.nextInt();
		
		System.out.println("Enter prodcut  price");
	    int price = sc.nextInt();
	    
	    pService.addProduct(new Product(name,quantity,price));
		
	}
	
	public void printAllProduct() {
		List<Product> list = pService.getAllProduct();
		
		System.out.println(list);
	}
	
	public void serchProduct() {
		
		System.out.println("Enter product id");
		
		
		try {
			Product product;
			product = pService.getProductById(sc.nextInt());
			System.out.println(product);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void GetProductWithingPriceRange() {
		System.out.println("Enter price 1");
		
		int p1 = sc.nextInt();
		
     System.out.println("Enter price 2");
		
		int p2 = sc.nextInt();
		
		
		try {
			List<Product> list;
			list = pService.getProductsBetweenPrice(p1, p2);
			System.out.println(list);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
