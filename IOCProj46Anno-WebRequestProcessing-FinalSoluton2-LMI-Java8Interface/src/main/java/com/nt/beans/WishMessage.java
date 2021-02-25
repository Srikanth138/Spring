package com.nt.beans;

import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

@Component("wm")
public class WishMessage {

	Date d = new Date();
	int hh = d.getHours();

	private WishMessage() {
		System.out.println("WishMessage.0-param private constructor");
	}

	public String showWishMsg(String user) {
		if (hh < 12) {
			return "Good Moring::" + user;
		} else if (hh < 16) {
			return "Good AfterNoon::" + user;
		} else if (hh < 20) {
			return "Good EveningNoon::" + user;
		} else {
			return "Good Night::" + user;
		}
	}
}
