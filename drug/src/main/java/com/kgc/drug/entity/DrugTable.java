package com.kgc.drug.entity;
/**
 * 药品详情表
 * @author Vevive
 *
 */
public class DrugTable {
	private Integer didi;
	private String dname;
	private String pinyin;
	private String bases;
	private String character;
	private String function;
	private String userlevel;
	private String untowardeffect;
	private String announcements;
	private String specification;
	private String periodofvalidity;
	private String approvalnumber;
	private Integer supplierId;
	private String photo;
	private Integer amount;
	private Double price;
	private Integer typeid;
	private Integer status;
	/**
	 * @return the didi
	 */
	public Integer getDidi() {
		return didi;
	}
	/**
	 * @param didi the didi to set
	 */
	public void setDidi(Integer didi) {
		this.didi = didi;
	}
	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * @return the pinyin
	 */
	public String getPinyin() {
		return pinyin;
	}
	/**
	 * @param pinyin the pinyin to set
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	/**
	 * @return the bases
	 */
	public String getBases() {
		return bases;
	}
	/**
	 * @param bases the bases to set
	 */
	public void setBases(String bases) {
		this.bases = bases;
	}
	/**
	 * @return the character
	 */
	public String getCharacter() {
		return character;
	}
	/**
	 * @param character the character to set
	 */
	public void setCharacter(String character) {
		this.character = character;
	}
	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}
	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}
	/**
	 * @return the userlevel
	 */
	public String getUserlevel() {
		return userlevel;
	}
	/**
	 * @param userlevel the userlevel to set
	 */
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}
	/**
	 * @return the untowardeffect
	 */
	public String getUntowardeffect() {
		return untowardeffect;
	}
	/**
	 * @param untowardeffect the untowardeffect to set
	 */
	public void setUntowardeffect(String untowardeffect) {
		this.untowardeffect = untowardeffect;
	}
	/**
	 * @return the announcements
	 */
	public String getAnnouncements() {
		return announcements;
	}
	/**
	 * @param announcements the announcements to set
	 */
	public void setAnnouncements(String announcements) {
		this.announcements = announcements;
	}
	/**
	 * @return the specification
	 */
	public String getSpecification() {
		return specification;
	}
	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * @return the periodofvalidity
	 */
	public String getPeriodofvalidity() {
		return periodofvalidity;
	}
	/**
	 * @param periodofvalidity the periodofvalidity to set
	 */
	public void setPeriodofvalidity(String periodofvalidity) {
		this.periodofvalidity = periodofvalidity;
	}
	/**
	 * @return the approvalnumber
	 */
	public String getApprovalnumber() {
		return approvalnumber;
	}
	/**
	 * @param approvalnumber the approvalnumber to set
	 */
	public void setApprovalnumber(String approvalnumber) {
		this.approvalnumber = approvalnumber;
	}
	/**
	 * @return the supplierId
	 */
	public Integer getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the typeid
	 */
	public Integer getTypeid() {
		return typeid;
	}
	/**
	 * @param typeid the typeid to set
	 */
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	public DrugTable(Integer didi, String dname, String pinyin, String bases, String character, String function,
			String userlevel, String untowardeffect, String announcements, String specification,
			String periodofvalidity, String approvalnumber, Integer supplierId, String photo, Integer amount,
			Double price, Integer typeid, Integer status) {
		super();
		this.didi = didi;
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
		this.supplierId = supplierId;
		this.photo = photo;
		this.amount = amount;
		this.price = price;
		this.typeid = typeid;
		this.status = status;
	}
	public DrugTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
