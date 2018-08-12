package com.tutorial.cbt.model;

public class Countries {
	private String cid ;
	private String cname;
	private int region ;
	
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	
	public Countries() {
		
	}
	public Countries(String cid, String cname, int region) {
		
		this.cid = cid;
		this.cname = cname;
		this.region = region;
	}
	
	
	
}
