package com.example.project1.Pharmacymodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pharmacy")
public class Pharmclass {
	@Id
	@Column(name="id")
private int id;
private String itemname;
private String qty;
private String mfgdate;
private String exp;
private String mrp;
private String cgst;
private String sgst;
private String taxable;
private String totalamount;
private int userid;
private String username;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public String getQty() {
	return qty;
}
public void setQty(String qty) {
	this.qty = qty;
}
public String getMfgdate() {
	return mfgdate;
}
public void setMfgdate(String mfgdate) {
	this.mfgdate = mfgdate;
}
public String getExp() {
	return exp;
}
public void setExp(String exp) {
	this.exp = exp;
}
public String getMrp() {
	return mrp;
}
public void setMrp(String mrp) {
	this.mrp = mrp;
}
public String getCgst() {
	return cgst;
}
public void setCgst(String cgst) {
	this.cgst = cgst;
}
public String getSgst() {
	return sgst;
}
public void setSgst(String sgst) {
	this.sgst = sgst;
}
public String getTaxable() {
	return taxable;
}
public void setTaxable(String taxable) {
	this.taxable = taxable;
}
public String getTotalamount() {
	return totalamount;
}
public void setTotalamount(String totalamount) {
	this.totalamount = totalamount;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
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

}


