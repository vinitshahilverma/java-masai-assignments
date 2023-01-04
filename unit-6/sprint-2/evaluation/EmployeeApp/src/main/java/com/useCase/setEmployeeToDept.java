package com.useCase;

import java.util.Scanner;

import com.Exception.DepartmentException;
import com.Exception.EmployeeException;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class setEmployeeToDept {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter employee id");
          int empId = sc.nextInt();
          
          System.out.println("Enter department id");
          int deptId = sc.nextInt();
          
          EmployeeDao dao = new EmployeeDaoImpl();
          
          try {
			dao.registerEmployeeTODepartment(empId, deptId);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
          
          

	}

}
