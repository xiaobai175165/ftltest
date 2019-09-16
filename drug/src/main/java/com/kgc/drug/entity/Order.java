package com.kgc.drug.entity;




public class Order {
	private String oid;
	private double totalprice;
	private String buytime,taketime; //购买时间，收货时间
	private Users users;
	private Drugtable1 drugtable ;
	private int count,takestatus,drugid,udid;
	public int getUdid() {
		return udid;
	}
	public void setUdid(int udid) {
		this.udid = udid;
	}
	public int getDrugid() {
		return drugid;
	}
	public void setDrugid(int drugid) {
		this.drugid = drugid;
	}
	public int getTakestatus() {
		return takestatus;
	}
	public void setTakestatus(int takestatus) {
		this.takestatus = takestatus;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getBuytime() {
		return buytime;
	}
	public void setBuytime(String buytime) {
		this.buytime = buytime;
	}
	public String getTaketime() {
		return taketime;
	}
	public void setTaketime(String taketime) {
		this.taketime = taketime;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Drugtable1 getDrugtable() {
		return drugtable;
	}
	public void setDrugtable(Drugtable1 drugtable) {
		this.drugtable = drugtable;
	}
	
	
	public Order(String oid, double totalprice, String buytime, String taketime, Users users, Drugtable1 drugtable,
			int count, int takestatus) {
		super();
		this.oid = oid;
		this.totalprice = totalprice;
		this.buytime = buytime;
		this.taketime = taketime;
		this.users = users;
		this.drugtable = drugtable;
		this.count = count;
		this.takestatus = takestatus;
	}
	public Order() {
		super();
	}
	
	

}
