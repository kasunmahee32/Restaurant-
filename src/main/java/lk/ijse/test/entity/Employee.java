package lk.ijse.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
@Id
@Column(name="eid",nullable = false, length=30)
private String eid;
@Column(name="name",nullable = false, length=30)
private String name;
@Column(name="address",nullable = false, length=30)
private String address;
@Column(name="tel",nullable = false, length=30)
private String tel;
public Employee(String eid, String name, String address, String tel) {
	super();
	this.eid = eid;
	this.name = name;
	this.address = address;
	this.tel = tel;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}





}
