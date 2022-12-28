package com.contactManagement.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactManagement.demo.config.Response;
import com.contactManagement.demo.dto.UserDto;
import com.contactManagement.demo.entity.User;
import com.contactManagement.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
//	
//	 Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@PostMapping("user")
	public Response saveUser(@RequestBody UserDto userDto) {
		return userService.saveUser(userDto);
	} 
	
	@GetMapping("/uesr/{id}")
	public UserDto findById(@PathVariable("id") Integer id) {
		return userService.findById(id);
	}
	

//	@GetMapping("/message")
//	public String getMessage() {
//		logger.info("[getMessage] info message");
//		logger.warn("[getMessage] warn message");
//		logger.error("[getMessage] error message");
//		logger.debug("[getMessage] debug message");
//		logger.trace("[getMessage] trace message");
//		return "Open console to check log message";
//	}
	 
//	@GetMapping("/hello")
//	public String talk() {
//		logger.trace("hoem metthod accesssed");
//		return "Helloo contact managenet server";
//				
//	}
	 
	
}
