package com.useCase;

import java.util.List;
import java.util.Scanner;

import com.Exception.EmployeeException;
import com.masai.beans.Employee;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class getEmployeeList {

	public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             
             System.out.println("Enter department name..");
             String name = sc.next();
                    
             
             try {
            	 EmployeeDao dao = new EmployeeDaoImpl();
            	 
				List<Employee> emp = dao.getAllEmployeeWithDeptName(name);
				
				emp.forEach(e -> System.out.println(e));
				
			} catch (EmployeeException e) {
				
				System.out.println(e.getMessage());
			}

	}

}
