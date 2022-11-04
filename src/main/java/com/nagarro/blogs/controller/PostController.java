package com.nagarro.blogs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.blogs.entity.PostInformation;
import com.nagarro.blogs.repo.PostRepo;

@RestController
@CrossOrigin
public class PostController {
	
	@Autowired
	PostRepo repo;
	
	@GetMapping(path="/posts",produces={"application/json"})
	public List<PostInformation> getAllPost(){
		
		
		return repo.findAll();
		
	}
	
	@GetMapping(path="/posts/{pid}",produces={"application/json"})
	public Optional<PostInformation> getPostByid(@PathVariable("pid") Integer pid) {
		
		return repo.findById(pid);
		
		
			}
	
	   @GetMapping(path="/posts/pcode/{pcode}",produces={"application/json"})
	   public List<PostInformation> getPostByProductCode(@PathVariable("pcode") Integer pcode){
		
		return repo.findBypcode(pcode);
		
		
			}
	   
	   @GetMapping(path="/posts/subject/{subject}",produces= {"application/json"})
	   public List<PostInformation> getPostsBySubject(@PathVariable("subject") String subject) {
		   
		   return repo.findBysubjectContaining(subject);
		   
		   
	   }
	   
	   
	   @GetMapping(path="/posts/bodykeyword/{keyword}",produces= {"application/json"})
	   public List<PostInformation> getPostsByBody(@PathVariable("keyword") String keyword) {
		   
		   return repo.findBybodyContaining(keyword);
		   
		   
	   }
		
	   
	   @GetMapping(path="/posts/useremail/{useremail}",produces= {"application/json"})
	   public List<PostInformation> getPostsByuseremail(@PathVariable("useremail") String useremail) {
		   
		   return repo.findByuseremail(useremail);
		   
		   
	   }
	   
	
	@PostMapping(path="/posts",produces={"application/json"})
	@ResponseBody
	public PostInformation postQuestion(@RequestBody PostInformation qs) {
		
		repo.save(qs);
		
		return qs ;
		
	}
	
	
	
	

}
