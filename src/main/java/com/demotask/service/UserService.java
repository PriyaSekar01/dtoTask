package com.demotask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demotask.dto.UserDto;
import com.demotask.entity.User;
import com.demotask.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public User create(UserDto userDto) {
		User u = new User();
		u.setName(userDto.getName());
		u.setPassword(userDto.getPassword());
		u.setEmail(userDto.getEmail());

		return userRepo.save(u);
	}

}
