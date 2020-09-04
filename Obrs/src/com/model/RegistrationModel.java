package com.model;

public class RegistrationModel {
private String name;
private String gender;
private String email_id;
private String password;
private String ph_no;
private String s_quest;
private String s_ans;
private String dl_no;
private String location;
private String utype;





public RegistrationModel(String name,  String email_id,String ph_no,String location, String password, String s_quest, String s_ans,String dl_no) {
	super();
	this.name = name;
	this.location=location;
	this.email_id = email_id;
	this.password = password;
	this.ph_no = ph_no;
	this.s_quest = s_quest;
	this.s_ans = s_ans;
	this.dl_no=dl_no;
}



public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getph_no() {
	return ph_no;
}
public void setph_no(String ph_no) {
	this.ph_no = ph_no;
}

public String gets_quest() {
	return s_quest;
}
public void sets_quest(String s_quest) {
	this.s_quest = s_quest;
}
public String gets_ans() {
	return s_ans;
}
public void sets_ans(String s_ans) {
	this.s_ans = s_ans;
}
public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}

public String getUtype() {
	return utype;
}
public void setUtype(String utype) {
	this.utype = utype;
}
public String getDl_no() {
	return dl_no;
}

public void setDl_no(String dl_no) {
	this.dl_no = dl_no;
}

}
