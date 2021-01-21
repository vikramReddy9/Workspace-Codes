package com.user.bean;

public class UserBean {
private int id;
private String fname;
private String email;
private String username;
private String password;
private long mobilenumber;
public UserBean(String fname, String email, String username, String password, long mobilenumber) {
	super();
	this.fname = fname;
	this.email = email;
	this.username = username;
	this.password = password;
	this.mobilenumber = mobilenumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public UserBean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return ""+ id + "\t" + fname + "\t" + email + "\t" + username + "\t"
			+ password + "\t" + mobilenumber + "";
}

}


