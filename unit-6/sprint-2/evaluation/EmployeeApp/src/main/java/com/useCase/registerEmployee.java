package com.useCase;

import java.util.Scanner;

import com.masai.beans.Address;
import com.masai.beans.Employee;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImpl;

public class registerEmployee {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.println("Enter employee name");
        emp.setEmpName(sc.next());
        
        System.out.println("Enter employee salary");
        emp.setSalary(sc.nextInt());
        
        
        Address add = new Address();
        System.out.println("Enter employee city");
        add.setCity(sc.next());
        
        System.out.println("Enter employee State");
        add.setState(sc.next());
        
        System.out.println("Enter employee pincode");
        add.setPincode(sc.next());
        
        emp.setAddress(add);
        
        EmployeeDao dao = new EmployeeDaoImpl();
        
        dao.addEmployee(emp);

	}

}
