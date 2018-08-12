package com.cbt.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Tringle implements ApplicationContextAware,BeanNameAware{
	
	Point pointA;
	Point pointB;
	Point pointC;
	
	ApplicationContext context = null;
	
	public void Draw(){
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = context ;
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is : "+name);
	}

}
