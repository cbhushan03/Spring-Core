package com.tutorial.cbt.model;

public class Employee {
	private int eid;
	private String fName;
	private String lName;
	private String email;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int eid, String fName, String lName, String email) {
		setEid(eid); 
		setfName(fName);
		setlName(lName);
		setEmail(email);
	}
	
	public Employee(){
		
	}
	
	
}
