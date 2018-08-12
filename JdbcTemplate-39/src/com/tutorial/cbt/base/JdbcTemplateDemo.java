package com.tutorial.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.cbt.dao.JdbcDaoImpl;
import com.tutorial.cbt.model.Employee;

public class JdbcTemplateDemo {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Spring Tutorial 39 - Using JdbcTemplate
		 * 
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		JdbcDaoImpl JdbcDaoImpl =context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		/*Employee emp = JdbcDaoImpl.getEmployee(102);
		System.out.println(emp.getfName()+" "+emp.getlName());*/
		
		System.out.println(JdbcDaoImpl.getEmpCount());
	}
}
