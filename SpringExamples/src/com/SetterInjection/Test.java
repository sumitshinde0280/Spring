package com.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Bean.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	        output.generateOutput();
	}
}