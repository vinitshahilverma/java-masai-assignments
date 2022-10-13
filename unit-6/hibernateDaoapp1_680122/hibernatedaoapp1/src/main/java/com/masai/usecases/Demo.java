package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Query q= em.createNamedQuery("account.getBalance");
		
		q.setParameter("bal", 5000);
		
		List<Account> accounts= q.getResultList();
		
		for(Account acc:accounts) {
			System.out.println(acc);
		}
		

		em.close();
	}

}
