package com.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanConstructor.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	        output.generateOutput();
	}
}