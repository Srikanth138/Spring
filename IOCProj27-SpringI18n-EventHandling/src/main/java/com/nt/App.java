package com.nt;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static public void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		// create Locale object
		Locale locale = new Locale(args[0], args[1]);
		// get Messages..
		String msg1 = ctx.getMessage("wishMsg", new Object[] { "buddy", " welcome" }, "msg", locale);
		String msg2 = ctx.getMessage("welcome.msg", new Object[] {}, "msg2", locale);
		String msg3 = ctx.getMessage("bye.msg", new Object[] {}, "msg3", locale);

		System.out.println(msg1 + "    " + msg2 + "   " + msg3);

		// close container
		((AbstractApplicationContext) ctx).close();
	}
}
