package com.kgc.drug.entity;

public class Drug1 {
	private int id,supplierId,amount,typeid;
	private String dname,pinyin,bases,character,function,userlevel,untowardeffect,announcements,specification,periodofvalidity,approvalnumber,photo;
	private double price;
	private int status;
	private Mintype min=new Mintype();
	
	@Override
	public String toString() {
		return "Drug [id=" + id + ", supplierId=" + supplierId + ", amount=" + amount + ", typeid=" + typeid
				+ ", dname=" + dname + ", pinyin=" + pinyin + ", bases=" + bases + ", character=" + character
				+ ", function=" + function + ", userlevel=" + userlevel + ", untowardeffect=" + untowardeffect
				+ ", announcements=" + announcements + ", specification=" + specification + ", periodofvalidity="
				+ periodofvalidity + ", approvalnumber=" + approvalnumber + ", photo=" + photo + ", price=" + price
				+ ", status=" + status + ", min=" + min + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mintype getMin() {
		return min;
	}
	public void setMin(Mintype min) {
		this.min = min;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
