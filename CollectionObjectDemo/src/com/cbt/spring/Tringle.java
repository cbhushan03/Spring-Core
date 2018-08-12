package com.cbt.spring;

import java.util.List;

public class Tringle {
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	List<Point> points; 
	
	public void Draw(){
		
		for(Point p : points){
			System.out.println("Point = ("+p.getX()+", "+p.getY()+")");
		}
		
	}
	

}
