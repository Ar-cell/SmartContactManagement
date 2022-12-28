package com.contactManagement.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id; 
	
	@Column(name="name")
	private String Name;
	
	@Column(unique = true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phoneno")
	private String phoneno;
	
	
}


