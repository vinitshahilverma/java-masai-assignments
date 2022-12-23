package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentExcepiton;
import com.masai.exception.PostExcepiton;
import com.masai.model.Comment;
import com.masai.model.Post;
import com.masai.repository.CommentRepo;
import com.masai.repository.PostRepo;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostRepo pRepo;
	
	@Autowired
	private CommentService cService;

	@Override
	public List<Comment> getAllCommentsByPostId(Integer id) throws PostExcepiton, CommentExcepiton {
		
		Post post = pRepo.findById(id)
				         .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		List<Comment>  comments  = post.getComments();
		
		if(comments.size()==0) throw new CommentExcepiton();
		
		else return comments;
		
	}

	@Override
	public Comment getAllCommentsByPostId(Integer id, Integer cid) throws PostExcepiton, CommentExcepiton {
		
		Post post = pRepo.findById(id)
		         .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		Comment comment = cService.getCommentById(cid);
		
		return comment;
	}

	@Override
	public List<Post> getAllPosts() throws PostExcepiton {
		
		List<Post> list = pRepo.findAll();
		
		if(list.size()==0) throw new PostExcepiton("No Post found");
		
		else return list;
		
	}

	@Override
	public Post getPostById(Integer id) throws PostExcepiton {
		
		Post post  = pRepo.findById(id)
				          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		return post;
		   
	}

	@Override
	public Post addNewPost(Post post) throws PostExcepiton {
		
		if(post==null) throw new PostExcepiton("No Post found");
		
		post = pRepo.save(post);
		
		return post;
		
	}

	@Override
	public Post updatePost(Integer id, Post post) throws PostExcepiton {
		
		Post post1  = pRepo.findById(id)
		          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		post.setPostId(id);
		
		post = pRepo.save(post);
		
		return post;
		
	}

	@Override
	public Post deletePostById(Integer id) throws PostExcepiton {
		
		Post post1  = pRepo.findById(id)
		          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		pRepo.delete(post1);
		
		return post1;
		
	}

	@Override
	public Post addCommentByPostId(Integer id, Comment comment) throws PostExcepiton, CommentExcepiton {
		
		Post post1  = pRepo.findById(id)
		          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
	     if(comment!=null) {
	    	 post1.getComments().add(comment);
	    	 
	    	post1 = pRepo.save(post1);
	    	
	    	return post1;
	     }
	     else {
	    	 throw new CommentExcepiton("No Comments Found..");
	     }
	}

	@Override
	public Post updateCommentByPostId(Integer id, Integer cid, Comment comment) throws PostExcepiton, CommentExcepiton {
		  
		Post post1  = pRepo.findById(id)
		          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		 Comment comment1 = cService.updateComments(cid, comment);
		 
		 post1.getComments().add(comment1);
    	 
	    post1 = pRepo.save(post1);
	    	
	    return post1;
		
	}

	@Override
	public Post deleteCommentByPostId(Integer id, Integer cid) throws PostExcepiton, CommentExcepiton {
		
		Post post1  = pRepo.findById(id)
		          .orElseThrow(() ->  new PostExcepiton("No Post found"));
		
		
		Comment comment = cService.deleteCommets(cid);
		
		return post1;
	}

}
