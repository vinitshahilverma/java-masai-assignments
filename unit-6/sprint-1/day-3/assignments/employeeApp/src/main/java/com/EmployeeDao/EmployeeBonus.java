package com.EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeBonus {
	
	
	public static String giveBonusToEmployee(int empId,int bonus) {
		String bon = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp!=null) {
			
		    em.getTransaction().begin();;
			emp.setSalary(emp.getSalary()+bonus);
			em.getTransaction().commit();
			
			bon = "Bonus given succesfully";
		}
		else {
			bon = "Employee Not Found";
		}
		
		
		
		return bon;
	}

}
