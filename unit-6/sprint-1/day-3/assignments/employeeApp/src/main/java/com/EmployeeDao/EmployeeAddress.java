package com.EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeAddress {
	
	public static String getAddressOfEmployee(int empId) {
		String add = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp!=null) {
			add = emp.getAddress();
		}else {
			add = "Employee Not Found";
		}
		
		em.close();
		
		return add;
	}

}
