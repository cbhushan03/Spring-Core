package com.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ShapeService shapeService= (ShapeService) context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
	}

}
