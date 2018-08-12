package com.cbt.spring;

public class Circle implements Shape {

	Point pointD;
	
	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Point A = ("+getPointD().getX()+", "+getPointD().getY()+")");
		
	}

}
