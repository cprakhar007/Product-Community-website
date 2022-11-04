package com.nagarro.blogs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
public class UserInformation {
	
	@Id
	private String useremail;
	
	private String firstname;
	private String lastname;
	private String userpassword;
	
	

	public UserInformation() {
		
	}
	
	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	
	
	public String getUseremail() {
		return useremail;
	}
	
	public void setUsername(String username) {
		this.useremail = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
	
	

}
