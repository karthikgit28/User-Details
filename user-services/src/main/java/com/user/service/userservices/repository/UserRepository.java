package com.user.service.userservices.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.userservices.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{
	
	//Retrieve user By Name
	public List<UserDetails> findByName(String name);
	
	public Optional<UserDetails> findByNameAndPassword(String name,String password);
	
}
