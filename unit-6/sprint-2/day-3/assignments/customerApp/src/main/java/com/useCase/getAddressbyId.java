package com.useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.beans.Address;
import com.masai.beans.Customer;
import com.utility.EMUtil;

public class getAddressbyId {

	public static void main(String[] args) {

          EntityManager em = EMUtil.provideEntityManager();
          
          String jpql = "from Customer where cid =: id";
          
          TypedQuery<Customer> q = em.createQuery(jpql,Customer.class);
          
          q.setParameter("id", 12);
          
          Customer cm = q.getSingleResult();
          
          List<Address> add = cm.getAddresses();
          
           add.forEach(a -> System.out.println(a));
          
          em.close();

	}

}
