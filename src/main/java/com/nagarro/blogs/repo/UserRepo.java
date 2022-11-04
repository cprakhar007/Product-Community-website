package com.nagarro.blogs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.blogs.entity.UserInformation;

public interface UserRepo extends JpaRepository<UserInformation,String> {

}
