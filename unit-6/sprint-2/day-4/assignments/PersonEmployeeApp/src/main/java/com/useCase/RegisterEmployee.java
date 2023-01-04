package com.useCase;

import javax.persistence.EntityManager;

import com.beans.Address;
import com.beans.Employee;
import com.beans.Person;
import com.utility.EMUtil;

public class RegisterEmployee {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Employee p1 = new Employee();

		p1.setName("Shahil");
		p1.setSalary(10000);
		p1.setHomeAddress(new Address("Jharkhand", "Bokaro", "828404"));
		p1.setOfficeAddress(new Address("Maharashtra", "Mumbai", "7846515"));

		Employee p2 = new Employee();

		p2.setName("Verma");
		p2.setSalary(20000);
		p2.setHomeAddress(new Address("Jharkhand", "Dhanbad", "828404"));
		p2.setOfficeAddress(new Address("Maharashtra", "Pune", "7846515"));

		Employee p3 = new Employee();

		p3.setName("Vinit");
		p3.setSalary(30000);
		p3.setHomeAddress(new Address("Jharkhand", "Ranchi", "828404"));
		p3.setOfficeAddress(new Address("Maharashtra", "Thane", "7846515"));

		Employee p4 = new Employee();

		p4.setName("Sandeep");
		p4.setSalary(40000);
		p4.setHomeAddress(new Address("Bihar", "Patna", "828404"));
		p4.setOfficeAddress(new Address("Maharashtra", "New Mumbai", "7846515"));
		
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		em.getTransaction().commit();
		
	    System.out.println("Done....");
	    
	    em.close();

	}

}
