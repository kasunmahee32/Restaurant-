package lk.ijse.test.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Order_Detail_PK implements Serializable{
private String oid;
private String fid;

public Order_Detail_PK(String oid, String fid) {
	super();
	this.oid = oid;
	this.fid = fid;
}
public String getOid() {
	return oid;
}
public void setOid(String oid) {
	this.oid = oid;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}


}
