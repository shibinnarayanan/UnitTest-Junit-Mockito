package com.svv.junittest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.svv.junittest.model.UserName;
import com.svv.junittest.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService ;
	
	@PostMapping("/createUser")
	void addUser(@RequestBody UserName user)
	{
		userService.addUser(user);
	}
	
	@GetMapping("/getUserbyName/{name}")
	UserName getUserNameById(@PathVariable String name)
	{
		return userService.getUserByName(name);
	}
	
	@GetMapping("/getAllUser")
	List<UserName> getAllUserList()
	{
		return  userService.getAllUser();
	}
    @DeleteMapping("/delete")
	public void deleteUser(@RequestBody UserName user)
	{
    	 userService.deleteUser(user);
	}

}
