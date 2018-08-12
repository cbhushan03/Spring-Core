package com.cbt.msg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeDemo {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Message msg = (Message) context.getBean("message");
		
		msg.setMessage("Hello Spring");
		msg.getMessage();
		
		Message msg1 = (Message) context.getBean("message");
		msg1.getMessage();
	}
}
