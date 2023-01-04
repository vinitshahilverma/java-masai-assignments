package com.useCase;

import java.util.Scanner;

import com.Exception.DepartmentException;
import com.masai.beans.Department;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class getDepartemntDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id..");
		
		int id = sc.nextInt();
		
		 EmployeeDao dao = new EmployeeDaoImpl();
		 
		 try {
			Department dept = dao.getDepartmentDetailsByEmployeeId(id);
			
			System.out.println(dept);
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}

	}

}
