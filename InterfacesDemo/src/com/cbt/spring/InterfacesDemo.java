package com.cbt.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class InterfacesDemo {

	public static void main(String[] args) {
		/*
		 * Writing Coding To Interfaces tutorial
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		Shape shape = (Shape) context.getBean("tringle-alias");
		Shape shape1 = (Shape) context.getBean("circle");
		//shape.Draw();
		shape1.Draw();
		
	}

}
