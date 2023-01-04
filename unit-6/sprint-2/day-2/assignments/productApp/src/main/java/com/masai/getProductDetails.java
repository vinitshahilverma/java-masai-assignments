package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class getProductDetails {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManger();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Id...");
		
		int pId = sc.nextInt();
		
		Product product = em.find(Product.class,pId);
		
		if(product!=null) {
		
		String jpql = "from Product where productId=:id";
		
		TypedQuery<Product> q = em.createQuery(jpql,Product.class);
		
		q.setParameter("id", pId);
		
		Product or = q.getSingleResult();
		
		int productId = or.getProductId();
		int price =  or.getPrice();
		String name = or.getProductName();
		int quantity = or.getQuantity();
		
		
		System.out.println("Product Id = "+productId);
		System.out.println("Product name = "+name);
		System.out.println("Product price = "+price);
		System.out.println("Product quantity = "+quantity);
		
		
		
		em.close();
		
	}
		else {
			System.out.println("Product not found...");
		}

	}

}
