package com.UseCase;

import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.masai.bean.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter employee id..");
	    emp.setEmpId(sc.nextInt());

	    System.out.println("Enter employee name..");
	    emp.setName(sc.next());
	    
	    System.out.println("Enter employee address..");
	    emp.setAddress(sc.next());
	    
	    System.out.println("Enter employee salary..");
		emp.setSalary(sc.nextInt());
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			
			Employee emp1 = dao.updateEmployee(emp);
			System.out.println(emp1);
			
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
