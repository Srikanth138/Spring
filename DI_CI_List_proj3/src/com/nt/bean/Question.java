package com.nt.bean;

import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answer;
	
	public Question(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answer=" + answer + "]";
	}
	

}
