package com.bean;

public abstract class Salary {
private int eno;
private String ename;
private String erole;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getErole() {
	return erole;
}
public void setErole(String erole) {
	this.erole = erole;
}
abstract double caluculateSalary (String erole);
}
