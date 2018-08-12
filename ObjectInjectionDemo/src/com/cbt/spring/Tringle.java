package com.cbt.spring;

import java.util.List;

public class Tringle {
	
	List<Point> points;
	
	public void Draw(){
		
		for(Point point : points){
			System.out.println("Point  = ("+point.getX()+", "+point.getY()+")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
}
