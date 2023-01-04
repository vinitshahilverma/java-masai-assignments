package com.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.utility.EMUtil;

public class Demo2 {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		String jpql = "from ContractualEmployee";

		TypedQuery<ContractualEmployee> q = em.createQuery(jpql, ContractualEmployee.class);

		List<ContractualEmployee> sList = q.getResultList();

		sList.forEach(s -> System.out.println());

		em.close();

	}

}
