package com.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.beans.Shape;

public class RequiredAnnotationDemo {
	public static void main(String[] args) {
		/* 
		 * Spring Tutorial 18 - Introduction to Annotations and the Required Annotation
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
	}
}
