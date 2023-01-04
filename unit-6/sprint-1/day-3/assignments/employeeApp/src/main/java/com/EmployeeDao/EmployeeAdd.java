package com.EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeAdd {
	
	public static void save(Employee emp) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(emp);
		
		et.commit();
		
		em.close();
		
		System.out.println("Employee added successfully..");
		
	}

}
