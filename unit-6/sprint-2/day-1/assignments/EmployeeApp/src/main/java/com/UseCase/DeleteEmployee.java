package com.UseCase;

import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.masai.bean.Employee;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id which you want to delete");
		int id  = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
	    try {
	    	
			Employee emp = dao.deleteEmployeeById(id);
			
			System.out.println(emp.getName()+ " has been removed from database");
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
