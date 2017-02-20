package com.AutowireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp 
{
 /**
  * @param args
  */
 public static void main(String[] args) 
 {
ApplicationContext context = new ClassPathXmlApplicationContext("BeanByType.xml");
  Circle circle = (Circle) context.getBean("circle123");
  circle.draw();
 }
}