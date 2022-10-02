package com.question3;

import java.util.*;

public class Main {

	public static void printDetails(Member e1, String member) {

		System.out.println("age is " + e1.age);
		System.out.println("name is " + e1.name);
		System.out.println("phone number is " + e1.phoneNumber);
		System.out.println("address is " + e1.address);
		e1.printSalary();

		if (member.equals("employee") || member.equals("Employee")) {
			Employee e2 = (Employee) e1;
			System.out.println("specialisation in " + e2.specialisation);
			System.out.println("department is " + e2.department);
		}

		else if (member.equals("manager") || member.equals("Manager")) {
			Manager m2 = (Manager) e1;
			System.out.println("specialisation in " + m2.specialisation);
			System.out.println("department is " + m2.department);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter member type");

		String member = sc.next();

		if (member.equals("employee") || member.equals("Employee")) {
			Employee e1 = new Employee();

			e1.specialisation = "3 roll";
			e1.department = "production";
			e1.age = 24;
			e1.name = "shahil";
			e1.address = "dugda";
			e1.salary = 24000.0;
			e1.phoneNumber = "7858869609";

			printDetails(e1, member);
		}

		else if (member.equals("manager") || member.equals("Manager")) {
			Manager m1 = new Manager();

			m1.specialisation = "Planning";
			m1.department = "Planning";
			m1.age = 34;
			m1.name = "vinit";
			m1.address = "Bokaro";
			m1.salary = 48000.0;
			m1.phoneNumber = "7858869609";
			printDetails(m1, member);
		}

	}

}
