package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class WishMessageService implements IWishMessageService {

	@Override
	public String getMassege() {
		
		return "Srikanth";
	}

	@Override
	public void getMsg() {
		int a=10,b=20;
		int c=a+b;
		System.out.println("....."+c);
		
	}

}
