package com.kgc.drug.entity;



public class Drugtable1 {
	private int did,amount,typeid;
	private String dname,pinying,bases,character,function,
	userlevel,untowardEffect,announcements,specification,
	periodofvalidity,approvalnumber,photo; 
	private double price;
	private Users supplierId;
	@Override
	public String toString() {
		return "Drugtable [did=" + did + ", amount=" + amount + ", typeid=" + typeid + ", dname=" + dname + ", pinying="
				+ pinying + ", bases=" + bases + ", character=" + character + ", function=" + function + ", userlevel="
				+ userlevel + ", untowardEffect=" + untowardEffect + ", announcements=" + announcements
				+ ", specification=" + specification + ", periodofvalidity=" + periodofvalidity + ", approvalnumber="
				+ approvalnumber + ", photo=" + photo + ", price=" + price + ", supplierId=" + supplierId + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPinying() {
		return pinying;
	}
	public void setPinying(String pinying) {
		this.pinying = pinying;
	}
	public String getBases() {
		return bases;
	}
	public void setBases(String bases) {
		this.bases = bases;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}
	public String getUntowardEffect() {
		return untowardEffect;
	}
	public void setUntowardEffect(String untowardEffect) {
		this.untowardEffect = untowardEffect;
	}
	public String getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(String announcements) {
		this.announcements = announcements;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getPeriodofvalidity() {
		return periodofvalidity;
	}
	public void setPeriodofvalidity(String periodofvalidity) {
		this.periodofvalidity = periodofvalidity;
	}
	public String getApprovalnumber() {
		return approvalnumber;
	}
	public void setApprovalnumber(String approvalnumber) {
		this.approvalnumber = approvalnumber;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Users getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Users supplierId) {
		this.supplierId = supplierId;
	}
	public Drugtable1(int did, int amount, int typeid, String dname, String pinying, String bases, String character,
			String function, String userlevel, String untowardEffect, String announcements, String specification,
			String periodofvalidity, String approvalnumber, String photo, double price, Users supplierId) {
		super();
		this.did = did;
		this.amount = amount;
		this.typeid = typeid;
		this.dname = dname;
		this.pinying = pinying;
		this.bases = bases;
		this.character = character;
		this.function = function;
		this.userlevel = userlevel;
		this.untowardEffect = untowardEffect;
		this.announcements = announcements;
		this.specification = specification;
		this.periodofvalidity = periodofvalidity;
		this.approvalnumber = approvalnumber;
		this.photo = photo;
		this.price = price;
		this.supplierId = supplierId;
	}
	public Drugtable1() {
		super();
	}
	
	
	

}
