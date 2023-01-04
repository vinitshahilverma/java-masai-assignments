package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.bean.Product;
import com.util.EMutil;

@Repository
public class ProductRepoImpl implements ProductRepo{

	public boolean insertProductDetails(Product product) {
		 
		EntityManager em =  EMutil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(product);
		
		em.getTransaction().commit();
		
		em.close();
		
		return true;
		
	}

	public List<Product> getAllProductDeatails() {
		
		EntityManager em =  EMutil.provideEntityManager();
		
		String jpql = "from Product";
		
		TypedQuery<Product> q = em.createQuery(jpql,Product.class);
		
		List<Product> list  = q.getResultList();
		
		return list;
	}

	public Product findProduct(int productId) {
		
		EntityManager em =  EMutil.provideEntityManager();
		
		 Product product =  em.find(Product.class, productId);
		
		return product;
		
	}

	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		
    EntityManager em =  EMutil.provideEntityManager();
		
		String jpql = "from Product where price>=:p1 and price<=p2";
		
		TypedQuery<Product> q = em.createQuery(jpql,Product.class);
		
		q.setParameter("p1", fromPrice);
		q.setParameter("p2", toPrice);
		
		List<Product> list  = q.getResultList();
		
		return list;
		
	}

}
