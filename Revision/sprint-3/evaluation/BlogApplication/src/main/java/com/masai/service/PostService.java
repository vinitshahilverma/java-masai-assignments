package com.masai.service;

import java.util.List;

import com.masai.exception.CommentExcepiton;
import com.masai.exception.PostExcepiton;
import com.masai.model.Comment;
import com.masai.model.Post;

public interface PostService {
	
	
	public List<Comment> getAllCommentsByPostId(Integer id)throws PostExcepiton,CommentExcepiton;
	
	public Comment getAllCommentsByPostId(Integer id,Integer cid)throws PostExcepiton,CommentExcepiton;
	
    public List<Post> getAllPosts()throws PostExcepiton;
    
    public Post getPostById(Integer id)throws PostExcepiton;
    
    public Post addNewPost(Post post)throws PostExcepiton;
    
    public Post updatePost(Integer id,Post post)throws PostExcepiton;
    
    public Post deletePostById(Integer id)throws PostExcepiton;
    
    public Post addCommentByPostId(Integer id,Comment comment)throws PostExcepiton,CommentExcepiton;
    
    public Post updateCommentByPostId(Integer id,Integer cid,Comment comment)throws PostExcepiton,CommentExcepiton;
    
    public Post deleteCommentByPostId(Integer id,Integer cid)throws PostExcepiton,CommentExcepiton;
    
} 
