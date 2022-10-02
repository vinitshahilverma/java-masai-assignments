package com.question5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
		List<Product> list = Arrays.asList(
				new Product(1,"rubber",100,50),
				new Product(2,"pencil",200,100),
				new Product(3,"book",80,250),
				new Product(4,"sharpner",120,15),
				new Product(1,"notebook",100,500)
				);
		
		
		System.out.println(list);
		
		Collections.sort(list, (p1,p2)-> p2.getPrice()>p1.getPrice() ? 1:-1);
		
		System.out.println(list);
		

	}

}
