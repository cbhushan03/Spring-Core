package com.cbt.base;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.beans.Shape;

public class Other_JSR250Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 	Spring Tutorial 20 - Some JSR-250 Annotations
		 * 
		 */
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
	}

}
