package com.nagarro.blogs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nagarro.blogs.entity.PostInformation;

public interface PostRepo extends JpaRepository<PostInformation,Integer> {

	
	List<PostInformation> findBypcode(Integer productcode);
	
	List<PostInformation> findBysubjectContaining(String subject);
	
	@Query("from PostInformation where body like CONCAT('%',:keyword,'%')")
	List<PostInformation>findBybodykeyword(@Param("keyword") String keyword);
	
	
	List<PostInformation>findBybodyContaining(String keyword);
	
	List<PostInformation> findByuseremail(String useremail);
	
	
	
	
		
}
