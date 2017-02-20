package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class DemoTest {
public static void main(String[] args) {
	
	ClassA a = new ClassA();
	ClassB b = new ClassB();
	
	System.out.println("This is normal object gen");
	a.DoSomething();
	b.DoSomething();
	
	System.out.println("=======");
	System.out.println("This is spring bean object gen");
	ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring.xml");
	
	ClassA newa=(ClassA) ctx.getBean("A");
	ClassB newb=(ClassB) ctx.getBean("B");
	
	newa.DoSomething();
	newb.DoSomething();
	
}

}
