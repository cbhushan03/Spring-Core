package com.tutorial.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.cbt.dao.JdbcDaoImpl;
import com.tutorial.cbt.model.Employee;

public class RowMapperDemo {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Spring Tutorial 41 - Implementing RowMapper
		 * 
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		JdbcDaoImpl JdbcDaoImpl =context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		/*Employee emp = JdbcDaoImpl.getEmployee(102);
		System.out.println(emp.getfName()+" "+emp.getlName());*/
		
		System.out.println(JdbcDaoImpl.getEmpDetails(102).getfName()+" "+JdbcDaoImpl.getEmpDetails(102).getlName());
		
		System.out.println(JdbcDaoImpl.getAllEmpDetails().size());
		
		for(Employee emp: JdbcDaoImpl.getAllEmpDetails()){
			System.out.println(emp.getfName()+" "+emp.getlName());
		}
	}
}
