package com.cbt.base;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.beans.Shape;

public class EventListenerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 	Spring Tutorial 22 - Using MessageSource To Get Text From Property Files
		 * 
		 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
//		System.out.println(context.getMessage("greeting", null,"Default greeting",null));
	}

}
