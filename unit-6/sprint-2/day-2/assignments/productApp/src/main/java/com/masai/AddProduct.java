package com.masai;

import javax.persistence.EntityManager;

import com.utility.EMUtil;

public class AddProduct {
	
	public static void InsertProduct(Product product) {
		
		EntityManager em = EMUtil.provideEntityManger();
		
		em.getTransaction().begin();
		
		em.persist(product);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
		
	}

	public static void main(String[] args) {

         Product p1 = new Product();
         p1.setProductName("Rubber");
         p1.setPrice(5);
         p1.setQuantity(10);
        
         
         Product p2 = new Product();
         p2.setProductName("Pencil");
         p2.setPrice(10);
         p2.setQuantity(20);
         
         Product p3 = new Product();
         p3.setProductName("Pen");
         p3.setPrice(15);
         p3.setQuantity(30);
         
         
         Product p4 = new Product();
         p4.setProductName("Copy");
         p4.setPrice(20);
         p4.setQuantity(40);
         
         Product p5 = new Product();
         p5.setProductName("Book");
         p5.setPrice(50);
         p5.setQuantity(50);
         
         
         InsertProduct(p1);
         InsertProduct(p2);
         InsertProduct(p3);
         InsertProduct(p4);
         InsertProduct(p5);
         
	}

}
