package com.Dao;

import javax.persistence.EntityManager;

import com.Utility.EMUtil;
import com.exception.EmployeeException;
import com.masai.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;
		
		EntityManager em = EMUtil.provideEntityManger();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		Employee emp1 = em.find(Employee.class, employee.getEmpId());
		
		
		if(emp1!=null) {
			emp = emp1;
		}
		else {
			
			throw new EmployeeException("Employee not regeristed");
			
		}
		em.close();
		
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		
		EntityManager em = EMUtil.provideEntityManger();
		
		
		emp = em.find(Employee.class, empId);
		
		if(emp==null) {
			throw new EmployeeException("Employee Not Found");
		}
		em.close();
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		
        EntityManager em = EMUtil.provideEntityManger();
		Employee emp1 = em.find(Employee.class, empId);
		
		if(emp1!=null) {
			 emp = emp1;
			 
			 em.getTransaction().begin();
			 em.remove(emp1);
			 em.getTransaction().commit();
			
		}
		else {
			throw new EmployeeException("Employee Not Found");
		}
		em.close();
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;
		
		 EntityManager em = EMUtil.provideEntityManger();
		 Employee emp1 = em.find(Employee.class, employee.getEmpId());
		 
		 if(emp1!=null) {
			 
			 em.getTransaction().begin();
			 em.merge(employee);
			 em.getTransaction().commit();
			 
			 emp = em.find(Employee.class, employee.getEmpId());
		 }
		 else {
			 throw new EmployeeException("Employee Not Found");
		 }
		
		return emp;
	}
	

}
