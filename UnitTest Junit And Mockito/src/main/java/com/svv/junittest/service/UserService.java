package com.svv.junittest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svv.junittest.model.UserName;
import com.svv.junittest.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;


	public List<UserName> getAllUser() {
		
		return userRepo.findAll();
	}


	public  UserName addUser(UserName user) {
		return userRepo.save(user);

	}


	public UserName getUserByName(String user) {
		return userRepo.findByuser(user);
	}


	public void deleteUser(UserName user) {
		 userRepo.delete(user);
	}
}
