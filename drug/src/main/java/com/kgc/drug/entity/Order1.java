package com.kgc.drug.entity;

import java.util.Date;

public class Order1 {
	private String oid;
	private int drugid;
	private double totalPrice;
	private Date buytime;
	private Date taketime ;
	private int takestatus,udid;
	private Drug drug;
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getDrugid() {
		return drugid;
	}
	public void setDrugid(int drugid) {
		this.drugid = drugid;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getBuytime() {
		return buytime;
	}
	public void setBuytime(Date buytime) {
		this.buytime = buytime;
	}
	public Date getTaketime() {
		return taketime;
	}
	public void setTaketime(Date taketime) {
		this.taketime = taketime;
	}
	public int getTakestatus() {
		return takestatus;
	}
	public void setTakestatus(int takestatus) {
		this.takestatus = takestatus;
	}
	public int getUdid() {
		return udid;
	}
	public void setUdid(int udid) {
		this.udid = udid;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", drugid=" + drugid + ", totalPrice=" + totalPrice + ", buytime=" + buytime
				+ ", taketime=" + taketime + ", takestatus=" + takestatus + ", udid=" + udid + "]";
	}
	
}
