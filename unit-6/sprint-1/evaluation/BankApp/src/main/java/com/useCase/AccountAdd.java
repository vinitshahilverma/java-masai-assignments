package com.useCase;

import java.util.Scanner;

import com.AccountDao.AccountDao;
import com.AccountDao.AccountDaoImpl;
import com.masai.beans.Account;

public class AccountAdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account id");
		int id = sc.nextInt();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter address");
		String address = sc.next();
		
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		AccountDao dao = new AccountDaoImpl();
		
		String str = dao.save(new Account(id,email,address,balance));
		
	   System.out.println(str);
		

	}

}
