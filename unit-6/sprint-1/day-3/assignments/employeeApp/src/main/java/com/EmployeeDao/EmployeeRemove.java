package com.EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeRemove {
	
  public static boolean deleteEmployee(int empId) {
	  
	  boolean result = false;
	  
	  
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
	  
	  EntityManager em = emf.createEntityManager();
	  
	  Employee emp = em.find(Employee.class,empId);
	  
	  if(emp!=null) {
		  
		  em.getTransaction().begin();
		  
		  em.remove(emp);
		  
		  em.getTransaction().commit();
		  
		  result = true;
		  
	  }
	  
	  em.close();

	  return result;
	  
  }
	

}
