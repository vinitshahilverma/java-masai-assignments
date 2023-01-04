package com.useCase;

import java.util.Scanner;

import com.masai.beans.Department;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class registerDept {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       Department dept = new Department();
       
        System.out.println("Enter department name");
        dept.setDeptName(sc.next());
        
        System.out.println("Enter department location");
        dept.setLocation(sc.next());
        
        EmployeeDao dao = new EmployeeDaoImpl();
        
        dao.addDepartment(dept);
 
	}

}
