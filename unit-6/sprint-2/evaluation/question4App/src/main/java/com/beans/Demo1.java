package com.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from SalariedEmployee";
		
		TypedQuery<SalariedEmployee> q = em.createQuery(jpql,SalariedEmployee.class);
		
		List<SalariedEmployee> sList = q.getResultList();
		
		
		sList.forEach( s -> System.out.println());
		
		em.close();

	}

}
