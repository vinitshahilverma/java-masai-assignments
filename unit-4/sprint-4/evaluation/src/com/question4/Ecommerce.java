package com.question4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    
	List<Product> productList = new ArrayList<>();
	
	
	public void addProductToList(Product product) {
		  
		boolean flag = false;
	   for(int i=0 ; i<productList.size(); i++) {
		   
		   if(productList.get(i).equals(product)==true) {
			   flag = true;
		   }
	   }
	      
	   Product p1 = new Product();
	      
	   if(flag==true) {
		   
		   int count = product.getCount();
		   
		   for(int i=0 ; i<productList.size(); i++) {
			   
			   if(productList.get(i).equals(product)==true) {
				   
				   productList.get(i).setCount(productList.get(i).getCount()+count);
			   }
		  
		   }	 
		   
		   System.out.println("Count updated Product already exists");
	   }
	   
	   if(flag==false) {
		   
		   productList.add(product);
		   
		   System.out.println("Product added successfully");
	   }
		
	}
	
	public List<Product> showAllProduct(){
		
		
		return productList;
		
	}
 	
}
