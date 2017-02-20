package com.Ambiguties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"Beans.xml"});

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    }
}