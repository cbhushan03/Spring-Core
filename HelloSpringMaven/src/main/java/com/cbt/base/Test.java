package com.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student stud = (Student) context.getBean("student");
		System.out.println(stud.getName());
	}

}
