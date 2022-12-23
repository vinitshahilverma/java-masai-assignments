package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentExcepiton;
import com.masai.model.Comment;
import com.masai.repository.CommentRepo;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentRepo cRepo;


	@Override
	public Comment addComments(Comment comment) throws CommentExcepiton {
		   
		if(comment!=null) {
			cRepo.save(comment);
			
			return comment;
		}
		else throw new CommentExcepiton("No comments found");
	}

	@Override
	public Comment deleteCommets(Integer id) throws CommentExcepiton {
		
		Comment comment = cRepo.findById(id)
				               .orElseThrow(() -> new CommentExcepiton("No comment found"));
		
		cRepo.delete(comment);
		
		return comment;
		 
	}

	@Override
	public Comment updateComments(Integer id, Comment comment) throws CommentExcepiton {
		  
		Comment comment1 = cRepo.findById(id)
	               .orElseThrow(() -> new CommentExcepiton("No comment found"));
		
		 comment.setCId(id);
		 
		 comment = cRepo.save(comment);
		 
		 return comment;
		
	}

	@Override
	public Comment getCommentById(Integer id) throws CommentExcepiton {
		 
		Comment comment1 = cRepo.findById(id)
	               .orElseThrow(() -> new CommentExcepiton("No comment found"));
		
		return comment1;
	}

}
