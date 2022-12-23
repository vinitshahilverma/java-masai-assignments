package com.masai.service;

import java.util.List;

import com.masai.exception.CommentExcepiton;
import com.masai.model.Comment;

public interface CommentService {
	
	
	public Comment addComments(Comment comment)throws CommentExcepiton;
	
	public Comment deleteCommets(Integer id)throws CommentExcepiton;
	
	public Comment updateComments(Integer id,Comment comment)throws CommentExcepiton;
	
	public Comment getCommentById(Integer id)throws CommentExcepiton;

}
