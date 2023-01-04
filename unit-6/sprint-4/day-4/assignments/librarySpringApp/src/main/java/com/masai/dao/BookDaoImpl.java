package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.bean.Book;
import com.masai.util.EMUtil;


@Repository
public class BookDaoImpl implements BookDao{

	@Override
	public String addBook(Book book) {
		
		  String message = null;

		  EntityManager em = EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  
		  em.persist(book);
		  
		  em.getTransaction().commit();
		  
	      em.close();
	      
	      message = "Book added successfully....";
	    		  
	     return message;
		  
	}

	@Override
	public List<Book> getAllBooks() {
		
		  EntityManager em = EMUtil.provideEntityManager();
		  
		  String jpql = "from Book";
		  
		  TypedQuery<Book> q = em.createQuery(jpql,Book.class);
		  
		  List<Book> list = q.getResultList();
		  
		  em.close();
		  
		  return list;
		
	}

	@Override
	public Book getBookById(Integer Id) {
		
		 EntityManager em = EMUtil.provideEntityManager();
		 
		 Book book = em.find(Book.class,Id);
		 
		 em.close();
		 
		 return book;

	}

	@Override
	public Book updateBook(Book book) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Book book1 = em.find(Book.class,book.getBookId());
	
		em.getTransaction().begin();
		
		book1.setName(book.getName());
		book1.setAuthor(book.getAuthor());
		book1.setPrice(book.getPrice());
		
		em.getTransaction().commit();
		
		em.close();
		
		return book1;
	}

	@Override
	public Book deleteBookById(Integer Id) {
		
        EntityManager em = EMUtil.provideEntityManager();
		
		Book book1 = em.find(Book.class,Id);
		
		em.getTransaction().begin();
		
		em.remove(book1);
		
		em.getTransaction().commit();
		
		em.close();
		
	   return book1;
		
		
	}
	
	

}
