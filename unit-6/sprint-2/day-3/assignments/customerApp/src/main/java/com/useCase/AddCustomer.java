package com.useCase;

import javax.persistence.EntityManager;

import com.masai.beans.Address;
import com.masai.beans.Customer;
import com.utility.EMUtil;

public class AddCustomer {

	public static void main(String[] args) {
	      
		 EntityManager em = EMUtil.provideEntityManager();
		 
		 Customer c1 = new Customer();
		 c1.setName("Shahil");
		 c1.setEmail("shahil@gmail.com");
		 c1.setMobileNumber("7858869209");
		 
		 c1.getAddresses().add(new Address("Jharkhand","Bokaro","828404","Home"));
		 c1.getAddresses().add(new Address("Maharshtra","Mumbai","421056","Office"));
		 
		 
		 Customer c2 = new Customer();
		 c2.setName("Verma");
		 c2.setEmail("verma@gmail.com");
		 c2.setMobileNumber("7858869208");
		 
		 c2.getAddresses().add(new Address("Bihar","Patna","828408","Home"));
		 c2.getAddresses().add(new Address("WestBengal","Kolkata","421053","Office"));
		 
		 
		 em.getTransaction().begin();
		 
		 em.persist(c1);
		 em.persist(c2);
		 
		 em.getTransaction().commit();
		 
		 System.out.println("Done...");
		 
		 em.close();
		      

	}

}
