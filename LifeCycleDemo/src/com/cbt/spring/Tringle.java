package com.cbt.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tringle implements InitializingBean,DisposableBean {
	
	Point pointA;
	Point pointB;
	Point pointC;
	
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
	
	public void myInit(){
		System.out.println("User Initialise Bean here.....");
	}
	
	public void cleanUp(){
		System.out.println("User Destroying Bean here.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialising Bean here.....");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying Bean here.....");
	}
}
