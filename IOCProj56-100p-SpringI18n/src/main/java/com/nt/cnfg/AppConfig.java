package com.nt.cnfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.nt.listener")
public class AppConfig {
	@Bean(name="messageSource")
	public  ResourceBundleMessageSource  createBundle() {
		ResourceBundleMessageSource bundle=new  ResourceBundleMessageSource();
		bundle.setBasename("com/nt/commons/App");
		return bundle;
	}

}
