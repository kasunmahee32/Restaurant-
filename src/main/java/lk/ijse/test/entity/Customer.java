package lk.ijse.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
@Id
@Column(name="cid",nullable = false, length=30)
private String cid;
@Column(name="cus_name",nullable = false, length = 30)
private String cus_name;
@Column(name="tel" , nullable = false, length= 30)
private String tel;

public Customer(String cid, String cus_name, String tel) {
	super();
	this.cid = cid;
	this.cus_name = cus_name;
	this.tel = tel;
}

public String getCid() {
	return cid;
}

public void setCid(String cid) {
	this.cid = cid;
}

public String getCus_name() {
	return cus_name;
}

public void setCus_name(String cus_name) {
	this.cus_name = cus_name;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}


}
