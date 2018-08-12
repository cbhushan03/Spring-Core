package com.cbt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


public class Circle implements Shape {
	
	private Point center;
	
	public void draw(){
		System.out.println("Circle is drawing...");
		System.out.println("Circle: Point is: ("+center.getX()+" , "+center.getY()+")");
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Initialization of Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destruction of Circle");
	}
	
}
