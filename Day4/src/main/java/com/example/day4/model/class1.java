package com.example.day4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carmodel")
public class class1 {
@Id
@Column
private int id;
private String name;
private int model;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}

}
