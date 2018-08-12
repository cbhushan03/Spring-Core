package com.cbt.spring;

import java.util.Iterator;
import java.util.List;

public class Tringle {
	
	private String Type;
	private int height;
	
	private Point point;
	
	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public Tringle(String Type,int height){
		this.Type = Type ;
		this.height = height ;
	}
	
	
	public Tringle(String Type,int height,Point list){
		this.Type = Type ;
		this.height = height ;
		this.point = list;
	}
	
	public void Draw(){
		System.out.println(getType()+" Tringle drawn of height "+getHeight());
	}
	
	public void displayList(){
		System.out.println(point);			
	}
	
}
