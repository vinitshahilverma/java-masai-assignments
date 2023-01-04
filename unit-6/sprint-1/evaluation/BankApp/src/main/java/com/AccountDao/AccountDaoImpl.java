package com.AccountDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.beans.Account;

public class AccountDaoImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		
		Account account;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em = emf.createEntityManager();
		
		
		 account = em.find(Account.class,id);
		
	      em.close();
	      
	  return account;	
		
	}

	@Override
	public String save(Account account) {
		
		String msg = "Account added successfully...";
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		  em.getTransaction().begin();
		  
		  em.persist(account);
		  
		  em.getTransaction().commit();
		  
		  
		  em.close();
		
		return msg;
		
	}

	@Override
	public String deleteAccountById(int id) {
	       String msg = "Account Not found....";
	       
	       EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		   EntityManager em = emf.createEntityManager();
		   
		   Account account = em.find(Account.class, id);
		   
		   if(account!=null) {
			   
			   em.getTransaction().begin();
				  
			   em.remove(account);
				  
			   em.getTransaction().commit();
			   
			   msg = "Account Deleted successfully...";
			   
		   }
	       
	       return msg;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		
		String msg = "Account Not found....";
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		   EntityManager em = emf.createEntityManager();
		   
		   Account account = em.find(Account.class, accountId);
		   
		   
           if(account!=null) {
        	   
        	   if(account.getBalance()<amount) {
        		   msg = "Low account Balance";
        	   }
			   
        	   else {
			   em.getTransaction().begin();
				  
			   account.setBalance(account.getBalance()-amount);
				  
			   em.getTransaction().commit();
			   
			   msg = "Withdrawal from account successfully...";
        	  }
			   
		   }
		
		
		return msg;
	}

	@Override
	public String deposit(double amount, int accountId) {
		
		String msg = "Account Not found....";
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		   EntityManager em = emf.createEntityManager();
		   
		   Account account = em.find(Account.class, accountId);
		   
		   
          if(account!=null) {
			   
			   em.getTransaction().begin();
				  
			   account.setBalance(account.getBalance()+amount);
				  
			   em.getTransaction().commit();
			   
			   msg = "Deposit into account successfully...";
			   
		   }
		
		
		return msg;
		
	}

}
