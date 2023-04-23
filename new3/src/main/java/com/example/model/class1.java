package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Medicalshop")
public class class1 {
@Id
@Column(name="SNO")
private int SNO;
private String Tname;
private int Dose;
private int Price;
private int Totalcount;
public int getSNO() {
	return SNO;
}
public void setSNO(int sNO) {
	SNO = sNO;
}
public String getTname() {
	return Tname;
}
public void setTname(String tname) {
	Tname = tname;
}
public int getDose() {
	return Dose;
}
public void setDose(int dose) {
	Dose = dose;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getTotalcount() {
	return Totalcount;
}
public void setTotalcount(int totalcount) {
	Totalcount = totalcount;
}


}
