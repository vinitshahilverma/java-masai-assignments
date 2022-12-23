package com.masai.controller;

import java.net.http.HttpResponse.ResponseInfo;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CommentExcepiton;
import com.masai.exception.PostExcepiton;
import com.masai.model.Comment;
import com.masai.model.Post;
import com.masai.service.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService pService;
	
    @GetMapping("/posts/{id}/comments")
	public ResponseEntity<List<Comment>> getAllCommentsByPostIdHandler(@PathVariable("id")Integer id) throws PostExcepiton, CommentExcepiton{
		
		List<Comment> list = pService.getAllCommentsByPostId(id);
		
		return new ResponseEntity<List<Comment>>(list,HttpStatus.OK);
		
	}
    
    @GetMapping("/posts/{id}/comments/{cid}")
	public ResponseEntity<List<Comment>> getCommentsByPostIdHandler(@PathVariable("id")Integer id,@PathVariable("cid")Integer cid) throws PostExcepiton, CommentExcepiton{
		
		List<Comment> list = pService.getAllCommentsByPostId(id);
		
		return new ResponseEntity<List<Comment>>(list,HttpStatus.OK);
		
	}
	
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPostsHandler() throws PostExcepiton{
		
		List<Post> list = pService.getAllPosts();
		
		return new ResponseEntity<List<Post>>(list,HttpStatus.OK);
		
	}
    
    
    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> getPostByIdHandler(@PathVariable("id")Integer id) throws PostExcepiton{
		
		Post list = pService.getPostById(id);
		
		return new ResponseEntity<Post>(list,HttpStatus.OK);
		
	}
    
     @PostMapping("/Posts")
     public ResponseEntity<Post> addPostHandler(@Valid @RequestBody Post post) throws PostExcepiton{
		
		Post list = pService.addNewPost(post);
		
		return new ResponseEntity<Post>(list,HttpStatus.CREATED);
		
	}
     
     @PutMapping("/Posts/{id}")
     public ResponseEntity<Post> updatePostHandler(@PathVariable("id")Integer id,@RequestBody Post post) throws PostExcepiton{
 		
 		Post list = pService.updatePost(id, post);
 		
 		return new ResponseEntity<Post>(list,HttpStatus.OK);
 		
 	}
     
     @DeleteMapping("/Posts/{id}")
     public ResponseEntity<Post> deletePostHandler(@PathVariable("id")Integer id) throws PostExcepiton{
 		
 		Post list = pService.deletePostById(id);
 		
 		return new ResponseEntity<Post>(list,HttpStatus.OK);
 		
 	}
     
    @PostMapping("/Posts/{id}/comments")
     public ResponseEntity<Post> addCommentByPostPostHandler(@Valid @PathVariable("id")Integer id,@RequestBody Comment comment) throws PostExcepiton, CommentExcepiton{
  		
  		Post list = pService.addCommentByPostId(id, comment);
  		
  		return new ResponseEntity<Post>(list,HttpStatus.OK);
  		
  	}
     
    @PutMapping("/Posts/{id}/comments/{cid}")
    public ResponseEntity<Post> updateCommentByPostPostIdHandler(@PathVariable("id")Integer id,@PathVariable("cid")Integer cid,@RequestBody Comment comment) throws PostExcepiton, CommentExcepiton{
  		
  		Post list = pService.updateCommentByPostId(id, cid, comment);
  		
  		return new ResponseEntity<Post>(list,HttpStatus.OK);
  		
  	}
      
     @DeleteMapping("/Posts/{id}/comments/{cid}")
     public ResponseEntity<Post> deleteCommentByPostPostHandler(@PathVariable("id")Integer id,@PathVariable("cid")Integer cid) throws PostExcepiton, CommentExcepiton{
  		
  		Post list = pService.deleteCommentByPostId(id, cid);
  		
  		return new ResponseEntity<Post>(list,HttpStatus.OK);
  		
  	}

}
