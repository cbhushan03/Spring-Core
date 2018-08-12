package com.cbt.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("In After initialize method. Bean name is "+beanName);
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("In Before initialize method. Bean name is "+beanName);
		
		return arg0;
	}

}
