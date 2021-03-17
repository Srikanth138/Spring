package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg") // componet is super type of all the @Configer, @service,
					// @Controller
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime sysDateTime;
	public String generateWishMessage(String user) {
		int hour = sysDateTime.getHour();
		if (hour < 12)
			return "GoodMorning::" + user;
		else if (hour < 16)
			return "GoodAfterNoon::" + user;
		else if (hour < 20)
			return "GoodEvening::" + user;
		else
			return "Good Night::" + user;
	}

}
