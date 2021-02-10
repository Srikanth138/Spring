package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricketer")
public class Cricketer implements ApplicationContextAware {
	@Value("${name}")
//	@Value("Sri") //passing the hard coding values
	private String name;
	@Value("${no}")
//	@Value("50")
	private int jersyNo;
	@Value("${id}")
//	@Value("bat")
	private String beanId; // To just CricketBat obj bean id
	private ApplicationContext ctx;

	public void setBeanId(String beanId) {
		System.out.println("Cricketer.setBeanId()");
		this.beanId = beanId;
	}

	// It is not setter method for setter Injection .It is method
	// ApplicationContextAware(I)
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;

	}

	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}

	public void setName(String name) {
		System.out.println("Cricketer.setName()");
		this.name = name;
	}

	public void setJersyNo() {
		System.out.println("Cricketer.setJersyNo()");
		this.jersyNo = jersyNo;
	}

	public void bowling() {
		System.out.println(
				"Mr." + name + " having jersyNo:" + jersyNo + " is bowling");
	}

	public void fielding() {
		System.out.println(
				"Mr." + name + " having jersyNo:" + jersyNo + " is fielding");
	}

	public void batting() {
		System.out.println(
				"Mr." + name + " having jersyNo:" + jersyNo + " is battting");
		// DependencyLookup to get CricketBat object only in the batting method
		// create an extra IOC container
		ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		System.out.println("2nd IOC container");
		CricketBat bat = ctx.getBean(beanId, CricketBat.class); // Dependency
																// lookup
		// use CricketBat object
		int score = bat.scoreRuns();
		System.out.println("Criketer runs are  ::" + score);
	}// method

}
