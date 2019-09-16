package com.kgc.drug.entity;

public class Mintype {
	private int minid,typeid;
	private String minname;
	public int getMinid() {
		return minid;
	}
	public void setMinid(int minid) {
		this.minid = minid;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getMinname() {
		return minname;
	}
	public void setMinname(String minname) {
		this.minname = minname;
	}
	public Mintype(int minid, int typeid, String minname) {
		super();
		this.minid = minid;
		this.typeid = typeid;
		this.minname = minname;
	}
	public Mintype() {
		super();
	}
	@Override
	public String toString() {
		return "Mintype [minid=" + minid + ", typeid=" + typeid + ", minname=" + minname + "]";
	}
	

}
