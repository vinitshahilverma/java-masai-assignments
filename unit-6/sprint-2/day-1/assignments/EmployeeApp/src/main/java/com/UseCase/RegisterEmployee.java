package com.UseCase;

import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.masai.bean.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.println("Enter employee name");
        employee.setName(sc.next());
        
        System.out.println("Enter employee address");
        employee.setAddress(sc.next());
        
        System.out.println("Enter employee salary");
        employee.setSalary(sc.nextInt());
        
        EmployeeDao dao = new EmployeeDaoImpl();
        
        try {
			Employee emp = dao.registerEmployee(employee);
			System.out.println(emp);
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			
		}
        
     
	}

}
