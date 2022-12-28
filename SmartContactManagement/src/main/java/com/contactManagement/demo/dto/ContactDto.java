package com.contactManagement.demo.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ContactDto {
	
private Integer cId;
	
	private String name;
	
	private String secondName;
	
	private String work;
	
	private String email;
	
	private String phone;
	
	private String  image;
	
	@Column(length = 50000)
	private String description;

}
