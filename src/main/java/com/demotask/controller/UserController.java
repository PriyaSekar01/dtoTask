package com.demotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demotask.dto.UserDto;
import com.demotask.entity.User;
import com.demotask.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public User create(@RequestBody UserDto userDto) {
		return userService.create(userDto);
	}

}
