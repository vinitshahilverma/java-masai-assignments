package com.question1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		product.add(new Product(1,"Trouser",200,15));
		product.add(new Product(2,"Shirt",300,10));
		product.add(new Product(3,"Jeans",100,12));
		product.add(new Product(4,"T-shirts",150,8));
		product.add(new Product(5,"HalfPant",50,5));
		
		System.out.println("============Original List===============================================");
		
		product.stream().forEach(p-> System.out.println(p));
		
		
		
		List<Product> list1 = product.stream().filter(p-> p.getQuantity()>=10)
				     .sorted((p1,p2)-> p1.getPrice()>p2.getPrice()? 1 : -1)
	                 .collect(Collectors.toList());
		
	     System.out.println("=====================Filtered and Sorted list============================");
		
				
		list1.forEach(p->System.out.println(p));
		
	

	}

}
