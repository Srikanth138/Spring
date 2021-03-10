package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.BankLoanIntrestCalculator;
import com.nt.beans.IntrestAmountDetails;
import com.nt.cfgs.AppConfig;
import com.nt.editor.IntrestAmountDetailsEditor;

public class CustomPropertyEditorTest {
	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// get Target spring bean class object
		BankLoanIntrestCalculator calculator = ctx.getBean("blic",
				BankLoanIntrestCalculator.class);
		System.out.println(
				"Intrest amount:" + calculator.calculateIntrestAmount());

	}// inner class

}
