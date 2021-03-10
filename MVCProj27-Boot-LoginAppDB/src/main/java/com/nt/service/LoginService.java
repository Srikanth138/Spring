package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{
	
	@Override
	public String login() {
		String name1="MAMA HAI HOW ARE YOU";
		return name1;
	}
}
