package com.EmployeeDao;

import java.util.Scanner;

import com.masai.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Employee emp = new Employee(10,"Shahil","Bokaro",10000);
		
		EmployeeAdd.save(emp);
//		
//		System.out.println("Enter Employee id to get the address");
//		
//		int id = sc.nextInt();
//		
//		String Address = EmployeeAddress.getAddressOfEmployee(id);
//		
//		System.out.println(Address);
		
//		System.out.println("Enter Employee id to give bonus");
//		int eid = sc.nextInt();
//		
//		System.out.println("Enter the Bonus amount");
//		int bonus = sc.nextInt();
//		
//		System.out.println(EmployeeBonus.giveBonusToEmployee(eid,bonus));
		
//		System.out.println("Enter the employee id which you want to delete");
//		int empId = sc.nextInt();
//		
//		boolean res = EmployeeRemove.deleteEmployee(empId);
//		
//		if(res== true){
//			System.out.println("Employee deleted successfully..");
//		}else
//			System.out.println("Employee not found...");
	}

}
