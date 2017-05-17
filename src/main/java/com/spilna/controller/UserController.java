package com.spilna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spilna.model.User;
import com.spilna.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService){
		this.userService = userService;
	}
	
	@RequestMapping("/list")
	public List<User> userList(){
		return userService.userList();
	}

	
}
