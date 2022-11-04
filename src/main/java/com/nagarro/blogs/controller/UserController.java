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

import com.nagarro.blogs.entity.UserInformation;
import com.nagarro.blogs.repo.UserRepo;

@RestController
@CrossOrigin
public class UserController {
	
	  @Autowired
	  UserRepo repo;

		@GetMapping(path="/users",produces={"application/json"})
	  public List<UserInformation> getUsers() {
			
			return repo.findAll();
		}
		
		@GetMapping(path="/users/{useremail}",produces={"application/json"})
		public Optional<UserInformation> getUser(@PathVariable("useremail") String useremail) {
			
			System.out.println("hi");
			
			return repo.findById(useremail);
		}
		
		@PostMapping(path="/users",produces={"application/json"})
		@ResponseBody
		public UserInformation postUser(@RequestBody UserInformation us) {
			
			repo.save(us);
			
			return us;
			
		}
	

}
