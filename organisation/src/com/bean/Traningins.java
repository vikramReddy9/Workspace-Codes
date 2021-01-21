package com.bean;

public abstract class Traningins {
	private int sid;
	private String sname;
	private long smobile;
	private String sadd;
	private String scourse;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSmobile() {
		return smobile;
	}
	public void setSmobile(long smobile) {
		this.smobile = smobile;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	abstract double calculatefee(String course);
}
