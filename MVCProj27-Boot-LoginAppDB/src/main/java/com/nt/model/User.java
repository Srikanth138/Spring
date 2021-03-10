package com.nt.model;

import lombok.Data;

@Data
public class User {
	private String name;
	
	public User() {
		System.out.println("User.User()");
	}

}
