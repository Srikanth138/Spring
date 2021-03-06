package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.external.IICCScoreComp;
import com.nt.locator.ICCScoreCompServiceLocator;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	@Bean(name = "extComp")
	public IICCScoreComp createExtenalComp() throws Exception {
		return ICCScoreCompServiceLocator.getExternalServiceComp();
		// make SErviceLocator giving Exteram comp ref by calling static factory method
	}

}
