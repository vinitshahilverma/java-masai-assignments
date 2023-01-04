package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class getTotalPrice {

	public static void main(String[] args) {

         EntityManager em = EMUtil.provideEntityManger();
         
         String jpql = "select sum(price) from Product";
         
          TypedQuery<Long> q = em.createQuery(jpql,Long.class);
          
          Long result = q.getSingleResult();
           
          System.out.println("Total price = " +result);
           
	}

}
