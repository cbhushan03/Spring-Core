package com.cbt.spring;

import java.util.Iterator;
import java.util.List;

public class Tringle {
	
	private String Type;
	private int height;
	
	private List<String> list;
	
	public int getHeight() {
		return height;
	}

	public void Draw(){
		System.out.println(getType()+" Tringle drawn of height "+getHeight());
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	
	public Tringle(String Type){
		this.Type = Type ;
	}
	
	public Tringle(int height){
		this.height = height ;
	}
	
	
	public Tringle(String Type,int height,List<String> list){
		this.Type = Type ;
		this.height = height ;
		this.list = list;
	}
	
	public void displayList(){
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
	}
	
}
