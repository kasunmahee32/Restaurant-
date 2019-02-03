package lk.ijse.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Deliverys")
public class Deliverys {
@Id
@Column(name="did", nullable=false, length=30)
private String did;
@Column(name="dates",nullable=false,length=30)
private String dates;
@Column(name="time",nullable=false,length=30)
private String time;
@ManyToOne
@JoinColumn(name="oid")
private Orders orders;

 

public Deliverys(String did, String dates, String time, Orders orders) {
	super();
	this.did = did;
	this.dates = dates;
	this.time = time;
	this.orders = orders;
}
public String getDid() {
	return did;
}
public void setDid(String did) {
	this.did = did;
}
public String getDates() {
	return dates;
}
public void setDates(String dates) {
	this.dates = dates;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public Orders getOrders() {
	return orders;
}
public void setOrders(Orders orders) {
	this.orders = orders;
}

}
