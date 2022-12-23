package com.masai.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentExcepiton;
import com.masai.model.Comment;
import com.masai.repository.CommentRepo;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentRepo cRepo;
	
	@Autowired
	private EntityManager em;


	@Override
	public Comment addComments(Comment comment) throws CommentExcepiton {
		   
//		if(comment!=null) {
//			cRepo.save(comment);
//			
//			return comment;
//		}
//		else throw new CommentExcepiton("No comments found");
		
//		em.getTransaction().begin();
		
		if(comment==null) {
			throw new CommentExcepiton("No comments found");
		}
		
		em.persist(comment);
		
//		em.getTransaction().commit();
//		
		em.close();
		
		return comment;
	}

	@Override
	public Comment deleteCommets(Integer id) throws CommentExcepiton {
		
//		Comment comment = cRepo.findById(id)
//				               .orElseThrow(() -> new CommentExcepiton("No comment found"));
//		
//		cRepo.delete(comment);
//		
//		return comment;
		
		Comment comment = em.find(Comment.class, id);
		
		 if(comment==null) throw new CommentExcepiton("No comments found");
		 
		 em.remove(comment);
		 
		 em.close();
		 
		 return comment;
		 
	}

	@Override
	public Comment updateComments(Integer id, Comment comment) throws CommentExcepiton {
		  
//		Comment comment1 = cRepo.findById(id)
//	               .orElseThrow(() -> new CommentExcepiton("No comment found"));
//		
//		 comment.setCId(id);
//		 
//		 comment = cRepo.save(comment);
//		 
//		 return comment;
		
		Comment comment1 = em.find(Comment.class, id);
		
		if(comment1==null) throw new CommentExcepiton("No comments found");
		
		comment.setCId(id);
		
		em.merge(comment);
		
		em.close();
		
		return comment;
		
	}

	@Override
	public Comment getCommentById(Integer id) throws CommentExcepiton {
		 
//		Comment comment1 = cRepo.findById(id)
//	               .orElseThrow(() -> new CommentExcepiton("No comment found"));
//		
//		return comment1;
		
        Comment comment1 = em.find(Comment.class, id);
		
		if(comment1==null) throw new CommentExcepiton("No comments found");
		
		em.close();
		
		return comment1;
	}

}
