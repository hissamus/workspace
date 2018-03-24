package com.tutorialspoint;

import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beaner.xml");
		HelloWorld obj = (HelloWorld) context.getBean("hw1");
	    obj.getMessage();
	    
	    TestBean t1=(TestBean)context.getBean("TestBean1");
	    TestBean t2=(TestBean)context.getBean("TestBean2");
	    
	    t1.getMessage();t1.setMessage("Changing of t1 msg");t1.getMessage();t1=(TestBean)context.getBean("TestBean1");t1.getMessage();
	    t2.getMessage();t2.setMessage("Changing of t2 msg");t2.getMessage();t2=(TestBean)context.getBean("TestBean2");t2.getMessage();
	    context.registerShutdownHook();
	    obj = (HelloWorld) context.getBean("hw1");
	    obj.getMessage(); 
	    
	   // LinkedList<E>
	}

}
