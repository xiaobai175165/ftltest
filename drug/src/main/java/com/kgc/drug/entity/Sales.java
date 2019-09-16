package com.kgc.drug.entity;

public class Sales {
	private String sid;
	private int drugid,udid,uid,status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	private DrugTable drugtable;
	private double totalPrice;
	private String buytime,returnCause,returntime,returnPic;
	public int getDrugid() {
		return drugid;
	}
	public void setDrugid(int drugid) {
		this.drugid = drugid;
	}
	public int getUdid() {
		return udid;
	}
	public void setUdid(int udid) {
		this.udid = udid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSid() {
		return sid;
	}
	public DrugTable getDrugtable() {
		return drugtable;
	}
	public void setDrugtable(DrugTable drugtable) {
		this.drugtable = drugtable;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getBuytime() {
		return buytime;
	}
	public void setBuytime(String buytime) {
		this.buytime = buytime;
	}
	public String getReturnCause() {
		return returnCause;
	}
	public void setReturnCause(String returnCause) {
		this.returnCause = returnCause;
	}
	public String getReturntime() {
		return returntime;
	}
	public void setReturntime(String returntime) {
		this.returntime = returntime;
	}
	public String getReturnPic() {
		return returnPic;
	}
	public void setReturnPic(String returnPic) {
		this.returnPic = returnPic;
	}
	public Sales(String sid, DrugTable drugtable, double totalPrice, String buytime, String returnCause,
			String returntime, String returnPic, Users users) {
		super();
		this.sid = sid;
		this.drugtable = drugtable;
		this.totalPrice = totalPrice;
		this.buytime = buytime;
		this.returnCause = returnCause;
		this.returntime = returntime;
		this.returnPic = returnPic;
	}
	public Sales() {
		super();
	}
}
