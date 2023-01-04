package com.useCase;

import java.util.Scanner;

import com.AccountDao.AccountDao;
import com.AccountDao.AccountDaoImpl;

public class withDraw {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter the account Id");
          int id = sc.nextInt();
          
          System.out.println("Enter the amount you want to withdraw");
          double amount = sc.nextDouble();
          
          AccountDao dao = new AccountDaoImpl();
          
          System.out.println(dao.withdraw(amount, id));
          

	}

}
