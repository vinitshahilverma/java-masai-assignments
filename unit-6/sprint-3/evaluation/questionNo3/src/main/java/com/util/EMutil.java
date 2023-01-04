package com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutil {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("productUnit");
		
	}
	
	public static EntityManager provideEntityManager() {
		
		return emf.createEntityManager();
		
	}

}
