package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.ProductBean;
import com.nt.service.IProductServiceImpl;


public class RealTime {
	public static void main(String args[]) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		IProductServiceImpl service=ctx.getBean("services",IProductServiceImpl.class);
		
		Scanner sc=new Scanner(System.in);
		ProductBean bean=new ProductBean();
		
		System.out.println("ENTER PRODUCT_NAME ::");
		String pname=sc.next();
		bean.setPname(pname);
		
		System.out.println("ENTER Type EX:-Still,irenn ::");
		String type=sc.next();
		bean.setType(type);
		
		System.out.println("ENTER BasePrice ::");
		float baseprice=sc.nextFloat();
		bean.setBaseprice(baseprice);
		
		System.out.println("ENTER Status ::");
		String status=sc.next();
		bean.setStatus(status);
		System.out.println("ENTER qty ::");
		float qty=sc.nextFloat();
		bean.setQty(qty);
		
		System.out.println(service.processService(bean));
		//System.out.println(a);
		
		sc.close();
		((AbstractApplicationContext) ctx).close();
		
	}

}
