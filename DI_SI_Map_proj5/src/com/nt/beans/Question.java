package com.nt.beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;  
	private String name;  
	private Map<String,String> answers;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	} 
	
	public void showMap() {
		Set<Entry<String,String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator(); 
	    while(itr.hasNext()) {
	    	Entry<String,String> ent=itr.next();  
	    	System.out.println("Answer ::"+ent.getKey()+" posted ::"+ent.getValue());
	    }
		
	}
	
}
