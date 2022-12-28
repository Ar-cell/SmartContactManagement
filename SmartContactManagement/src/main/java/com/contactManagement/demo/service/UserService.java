package com.contactManagement.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.contactManagement.demo.config.Response;
import com.contactManagement.demo.dto.UserDto;
import com.contactManagement.demo.entity.User;

@Service
public interface UserService {

	Response saveUser(UserDto userDto);
	
	UserDto findById(Integer id);
}
