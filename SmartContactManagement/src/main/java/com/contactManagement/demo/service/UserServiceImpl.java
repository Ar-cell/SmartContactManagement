package com.contactManagement.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.contactManagement.demo.config.Response;
import com.contactManagement.demo.dto.UserDto;
import com.contactManagement.demo.entity.User;
import com.contactManagement.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService  {
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public Response saveUser(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setPhoneno(userDto.getPassword());
		userRepository.save(user);
		return new Response("user saved successfully",HttpStatus.OK);
	}

	@Override
	public UserDto findById(Integer id) {
		Optional<User> c =  userRepository.findById(id);
	       UserDto dto=new UserDto();
	       if(c.isPresent()) {
	    	   User user = c.get();
	    	   dto.setName(user.getName());
	    	   dto.setEmail(user.getEmail());
	    	   dto.setId(user.getId());
	    	   dto.setPassword(user.getPassword());
	    	   dto.setPhoneno(user.getPhoneno());
	       }
		return dto;
	}
	

}
