package com.useCase;

import java.util.Scanner;

import com.AccountDao.AccountDao;
import com.AccountDao.AccountDaoImpl;
import com.masai.beans.Account;

public class FindById {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the account Id which you want to find");
         
         int id = sc.nextInt();
         
         AccountDao  dao = new AccountDaoImpl();
         
         Account account = dao.findById(id);
        
        System.out.println(account);
	}

}
