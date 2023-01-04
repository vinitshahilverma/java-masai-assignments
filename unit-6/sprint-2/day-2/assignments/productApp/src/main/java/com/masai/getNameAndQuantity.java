package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.utility.EMUtil;

public class getNameAndQuantity {

	public static void main(String[] args) {

         EntityManager em = EMUtil.provideEntityManger();
         
         Query q = em.createNamedQuery("getNameAndQuantity");
         
          List<Object[]> results = q.getResultList();
          
          for(Object[] res:results) {
        	  
        	  String name = (String)res[1];
        	  int quantity = (Integer)res[0];
        	  
        	  System.out.println("Product name is "+ name);
        	  System.out.println("Product quantity is "+quantity);
        	  
        	  System.out.println("================================================");
        	  
          }
         

	}

}
