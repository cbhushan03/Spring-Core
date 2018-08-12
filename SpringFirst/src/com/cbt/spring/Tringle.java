package com.cbt.spring;

public class Tringle {
	
	private String Type;
	
	public void Draw(){
		System.out.println(getType()+" Tringle Drawn...");
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
}
