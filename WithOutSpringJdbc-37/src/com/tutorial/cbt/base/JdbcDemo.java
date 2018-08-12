package com.tutorial.cbt.base;

import com.tutorial.cbt.dao.JdbcDaoImpl;
import com.tutorial.cbt.model.Employee;

public class JdbcDemo {
	public static void main(String[] args) {
		
		/*
		 *  Spring Tutorial 37 - Using JDBC without Spring
		 * 
		 */
		
		//Employee emp = new JdbcDaoImpl().getEmployee(102);
		Employee emp1 = new JdbcDaoImpl().getEmployee_MySql(10002);
		
		//System.out.println(emp.getfName()+" "+emp.getlName());
		System.out.println(emp1.getfName()+" "+emp1.getlName());
	}
}
