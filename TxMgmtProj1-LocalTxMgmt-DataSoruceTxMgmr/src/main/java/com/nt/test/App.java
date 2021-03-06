package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IBankMgmtService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    			//create IOC container
    			ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgn/applicationContext.xml");
    			
    			//get Proxy object
    			IBankMgmtService proxy=ctx.getBean("bankService",IBankMgmtService.class);
    			System.out.println(proxy.getClass());
    			//invoke b.method
    			try {
    				if(proxy.transferMoney(1002, 1001, 2000.0))
    					  System.out.println("Money Transfered");
    				else
    					System.out.println("Problem in money  transffering");
    			}
    			catch(Exception e) {
    				System.out.println("Money not transffered");
    				e.printStackTrace();
    			}
    	        //close container
    			((AbstractApplicationContext) ctx).close();
    }
}
