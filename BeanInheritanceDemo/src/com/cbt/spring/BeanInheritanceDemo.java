package com.cbt.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class BeanInheritanceDemo {

	public static void main(String[] args) {
		/*
		 * AutoWire, ApplicationContextAware & BeanNameAware tutorial
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Tringle tringle1 = (Tringle) context.getBean("tringle1");
		tringle1.Draw();
		
	}

}
