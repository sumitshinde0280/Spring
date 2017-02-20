package com.AutowiringUsingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp 
{
 /**
  * @param args
  */
 public static void main(String[] args) 
 {
ApplicationContext context = new ClassPathXmlApplicationContext("SpringAutowireBean.xml");
  Circle circle = (Circle) context.getBean("circle");
  circle.draw();
 }
}