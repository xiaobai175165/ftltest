package com.kgc.drug.entity;

import java.util.List;

public class Drug {
	private int did;
	private int supplierId;
	private int amount;
	private int typeid;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	private int status;
	private double price;
	private String dname,pinyin,bases,character,function,userlevel,untowardeffect,announcements,specification,periodofvalidity,approvalnumber,photo;
	private List<Mintype> mintype;
	private Users users;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
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
	public String getUntowardeffect() {
		return untowardeffect;
	}
	public void setUntowardeffect(String untowardeffect) {
		this.untowardeffect = untowardeffect;
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
	public List<Mintype> getMintype() {
		return mintype;
	}
	public void setMintype(List<Mintype> mintype) {
		this.mintype = mintype;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Drug(int did, int supplierId, int amount, int typeid, double price, String dname, String pinyin,
			String bases, String character, String function, String userlevel, String untowardeffect,
			String announcements, String specification, String periodofvalidity, String approvalnumber, String photo,
			List<Mintype> mintype, Users users) {
		super();
		this.did = did;
		this.supplierId = supplierId;
		this.amount = amount;
		this.typeid = typeid;
		this.price = price;
		this.dname = dname;
		this.pinyin = pinyin;
		this.bases = bases;
		this.character = character;
		this.function = function;
		this.userlevel = userlevel;
		this.untowardeffect = untowardeffect;
		this.announcements = announcements;
		this.specification = specification;
		this.periodofvalidity = periodofvalidity;
		this.approvalnumber = approvalnumber;
		this.photo = photo;
		this.mintype = mintype;
		this.users = users;
	}
	public Drug() {
		super();
	}
	@Override
	public String toString() {
		return "Drug [did=" + did + ", supplierId=" + supplierId + ", amount=" + amount + ", typeid=" + typeid
				+ ", price=" + price + ", dname=" + dname + ", pinyin=" + pinyin + ", bases=" + bases + ", character="
				+ character + ", function=" + function + ", userlevel=" + userlevel + ", untowardeffect="
				+ untowardeffect + ", announcements=" + announcements + ", specification=" + specification
				+ ", periodofvalidity=" + periodofvalidity + ", approvalnumber=" + approvalnumber + ", photo=" + photo
				+ ", mintype=" + mintype + ", users=" + users + "]";
	}
	
	
}
