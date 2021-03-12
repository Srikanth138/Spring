package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageService implements IWishMessageService {

	@Override
	public String getMassege() {

		// get system Date and time
		LocalDateTime sysDate = LocalDateTime.now();
		// Get current hour of the day
		int hour = sysDate.getHour() + 1;
		// generate wish message
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good AfterNoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

	@Override
	public void getMsg() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("....." + c);

	}

}
