package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class getProductPricebyId {

	public static void main(String[] args) {
	      
		EntityManager em = EMUtil.provideEntityManger();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product id which price you want to get");
		
		int id1 = sc.nextInt();
		
		Product pr = em.find(Product.class, id1);
		
		if(pr!=null) {
			
			TypedQuery<Integer> q = em.createNamedQuery("getProductPrice",Integer.class);
			
			q.setParameter("id", id1);
			
		    int p = q.getSingleResult();
			
			System.out.println("Price = " + p);
			
		}else
			System.out.println("Product not found..");

	}

}
