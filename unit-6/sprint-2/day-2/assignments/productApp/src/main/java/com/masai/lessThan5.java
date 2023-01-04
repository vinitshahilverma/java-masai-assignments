package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class lessThan5 {

	public static void main(String[] args) {

        EntityManager em = EMUtil.provideEntityManger();
        
        String jpql = "select a from Product a where quantity<5";

         Query q = em.createQuery(jpql);
         
          List<Product> obj = q.getResultList();
        
          for(Product r:obj) {
        	  System.out.println(r);
          }

	}

}
