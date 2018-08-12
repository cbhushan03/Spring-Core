package com.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.beans.Shape;

public class AutowireAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 	Spring Tutorial 19 - The Autowired Annotation
		 * 
		 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
	}

}
