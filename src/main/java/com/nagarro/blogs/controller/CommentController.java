package com.nagarro.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.blogs.entity.CommentInformation;
import com.nagarro.blogs.repo.CommentsRepo;


@RestController
@CrossOrigin
public class CommentController {
	
	@Autowired
   CommentsRepo repo;
	
	@PostMapping(path="/comments",produces={"application/json"})
	@ResponseBody
	public CommentInformation postQuestion(@RequestBody CommentInformation cs) {
		
		repo.save(cs);
		
		return cs ;
		
	}
	
	
	@GetMapping(path="/comments",produces={"application/json"})
	public List<CommentInformation>getAllComments(){
		
		System.out.println("hi is their is any here");
		
		return repo.findAll();
	}
	

	@GetMapping(path="/comments/fby/{pid}",produces={"application/json"})
	public List<CommentInformation>getCommentsByproductid(@PathVariable("pid") int pid){
		
		
		
		return repo.findBypid(pid);
	}
	
	
	
	
	

}
