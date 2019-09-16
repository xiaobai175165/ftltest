package com.kgc.drug.entity;

public class Users {
	private Integer uid;			//用户编号
	private String uname;		//用户名称
	private String password;	//用户密码
	private Integer status;			//用户类型
	private String icbc;		//工商照片
	private String identity;	//身份证照片
	private String email;		//企业邮箱
	private String address;		//企业地址
	private Integer statuss;		//用户状态
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", password=" + password + ", status=" + status + ", icbc="
				+ icbc + ", identity=" + identity + ", email=" + email + ", address=" + address + ", statuss=" + statuss
				+ "]";
	}
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	/**
	 * @return the icbc
	 */
	public String getIcbc() {
		return icbc;
	}
	/**
	 * @param icbc the icbc to set
	 */
	public void setIcbc(String icbc) {
		this.icbc = icbc;
	}
	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}
	/**
	 * @param identity the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the statuss
	 */
	public Integer getStatuss() {
		return statuss;
	}
	/**
	 * @param statuss the statuss to set
	 */
	public void setStatuss(Integer statuss) {
		this.statuss = statuss;
	}
	public Users(Integer uid, String uname, String password, Integer status, String icbc, String identity, String email,
			String address, Integer statuss) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.status = status;
		this.icbc = icbc;
		this.identity = identity;
		this.email = email;
		this.address = address;
		this.statuss = statuss;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
