package com.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		 emf = Persistence.createEntityManagerFactory("empUnit");
	}
	
	public static EntityManager provideEntityManger() {
		
		return emf.createEntityManager();
		
	}

}
