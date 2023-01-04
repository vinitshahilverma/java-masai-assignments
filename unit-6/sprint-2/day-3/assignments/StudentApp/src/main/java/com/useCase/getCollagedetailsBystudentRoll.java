package com.useCase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.beans.Collage;
import com.utility.EMUtil;

public class getCollagedetailsBystudentRoll {

	public static void main(String[] args) {

         EntityManager em = EMUtil.provideEntityManager();
         
         String jpql = "from Collage where collageId = (select collage from Student where studentRoll =:roll)";
         
         TypedQuery<Collage> q = em.createQuery(jpql, Collage.class);
         
         q.setParameter("roll", 8);
         
         Collage clg = q.getSingleResult();
         
         System.out.println(clg);
         
         em.close();

	}

}
