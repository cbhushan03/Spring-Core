package com.cbt.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LifeCycleDemo {

	public static void main(String[] args) {
		/*
		 * Spring Life Cycle
		 * Using InitializingBean for initialization and DisposableBean for destroy beans
		 * 
		 * Spring Life Cycle
		 * Using user define method to initialize and destroy beans
		 */
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		context.registerShutdownHook();
		Tringle tringle1 = (Tringle) context.getBean("tringle-alias");
		tringle1.Draw();
		
	}

}
