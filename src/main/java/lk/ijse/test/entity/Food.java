package lk.ijse.test.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class Food {
@Id
private String fid;
@Column(name="f_name",nullable = false, length=30)
private String f_name;
@Column(name="qty",nullable = false, length=30)
private int qty;
@Column(name="unite_price",nullable = false, length=30)
private double unite_price;

@ManyToOne
@JoinColumn(name="cate_id")
private Category category;



public Food(String fid, String f_name, int qty, double unite_price, Category category) {
	super();
	this.fid = fid;
	this.f_name = f_name;
	this.qty = qty;
	this.unite_price = unite_price;
	this.category = category;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getUnite_price() {
	return unite_price;
}
public void setUnite_price(double unite_price) {
	this.unite_price = unite_price;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}




}
