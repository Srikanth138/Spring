package cmp.IOCProj51Anno_FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		Customer cust = ctx.getBean("cust", Customer.class);
		System.out.println("......................");
		// show details
		cust.showProductDetials();
		System.out.println("......................");
		// close container
		((AbstractApplicationContext) ctx).close();
	}
}
