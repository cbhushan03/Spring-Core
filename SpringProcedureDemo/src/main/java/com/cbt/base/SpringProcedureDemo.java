package com.cbt.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.bean.Company;
import com.cbt.dao.CompanyDao;

public class SpringProcedureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		CompanyDao companyDao = (CompanyDao)context.getBean("companyDao");
		Company comp = companyDao.getCompany(0001);
		System.out.println(comp.getLocation()+" "+comp.getName()+" "+comp.getNoOfEmp());
	}

}
