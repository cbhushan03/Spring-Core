package com.tutorial.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.cbt.dao.JdbcDaoImpl;
import com.tutorial.cbt.model.Employee;

public class SpringJdbcDemo {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Spring Tutorial 38 - Adding Spring and DataSource Configuration
		 * 
		 * 
		 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		JdbcDaoImpl JdbcDaoImpl =context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		Employee emp = JdbcDaoImpl.getEmployee_Mysql(10002);//102
		System.out.println(emp.getfName()+" "+emp.getlName());
	}
}
