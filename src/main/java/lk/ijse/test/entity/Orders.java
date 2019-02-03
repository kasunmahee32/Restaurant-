package lk.ijse.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Orders")
public class Orders {
@Id
@Column(name="oid",nullable=false, length=30 )
private String oid;

private String date;

private Double total_price;

@ManyToOne
@JoinColumn(name="cid")
private Customer customer;

public Orders(String oid, String date, Double total_price, Customer customer) {
	super();
	this.oid = oid;
	this.date = date;
	this.total_price = total_price;
	this.customer = customer;
}

public String getOid() {
	return oid;
}

public void setOid(String oid) {
	this.oid = oid;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public Double getTotal_price() {
	return total_price;
}

public void setTotal_price(Double total_price) {
	this.total_price = total_price;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}



}
