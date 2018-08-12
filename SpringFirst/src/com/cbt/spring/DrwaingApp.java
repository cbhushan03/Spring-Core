package com.cbt.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrwaingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
				Tringle tringle = (Tringle) factory.getBean("tringle");
		*/		
		
		//tringle.Draw();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Tringle tringle1 = (Tringle) context.getBean("tringle");
		tringle1.Draw();
		
	}

}
