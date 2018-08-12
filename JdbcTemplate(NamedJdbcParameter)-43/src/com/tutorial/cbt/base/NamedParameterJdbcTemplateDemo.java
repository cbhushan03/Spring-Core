package com.tutorial.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.cbt.dao.JdbcDaoImpl;
import com.tutorial.cbt.model.Countries;
import com.tutorial.cbt.model.Employee;

public class NamedParameterJdbcTemplateDemo {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Spring Tutorial 42 - Performing Write Operations with JdbcTemplate
		 * 
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		JdbcDaoImpl JdbcDaoImpl =context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		JdbcDaoImpl.insertCountry(new Countries("NO","Norway",3));
	}
}
