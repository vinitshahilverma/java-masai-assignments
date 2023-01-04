package com.useCase;

import java.util.Scanner;

import com.AccountDao.AccountDao;
import com.AccountDao.AccountDaoImpl;

public class DeleteAccount {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter the account Id you want to delete");
	       int id = sc.nextInt();
	       
	       AccountDao dao = new AccountDaoImpl();
	       
	       System.out.println(dao.deleteAccountById(id));
		
		
	}

}
