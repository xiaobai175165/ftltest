package com.kgc.drug.entity;

public class Maxtype {
	private int maxid;
	private String maxname;
	public int getMaxid() {
		return maxid;
	}
	public void setMaxid(int maxid) {
		this.maxid = maxid;
	}
	public String getMaxname() {
		return maxname;
	}
	public void setMaxname(String maxname) {
		this.maxname = maxname;
	}
	public Maxtype(int maxid, String maxname) {
		super();
		this.maxid = maxid;
		this.maxname = maxname;
	}
	public Maxtype() {
		super();
	}
	@Override
	public String toString() {
		return "Maxtype [maxid=" + maxid + ", maxname=" + maxname + "]";
	}
	

}
