package com.nagarro.blogs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.blogs.entity.CommentInformation;


public interface CommentsRepo extends JpaRepository<CommentInformation,Integer> {

	List<CommentInformation>findBypid(Integer pid);
		
		

		
	
}
