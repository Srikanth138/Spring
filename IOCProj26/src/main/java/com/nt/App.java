package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    static public void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext();
    	//ctx.getBean("");
        System.out.println( "Hello World!   "+ctx.getClass().getName() );
        
        ((AbstractApplicationContext) ctx).close();
    }
}
