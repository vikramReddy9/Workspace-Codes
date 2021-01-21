package com.bean;

public class User {
	private int uid;
	private String name;
	private String uemail;
	private String uname;
	private String upassword;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public User(int uid, String name, String uemail, String uname, String upassword) {
		super();
		this.uid = uid;
		this.name = name;
		this.uemail = uemail;
		this.uname = uname;
		this.upassword = upassword;
	}
	
}
