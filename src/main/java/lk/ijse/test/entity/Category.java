package lk.ijse.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@Column(name="cate_id",nullable = false, length=30)
	private String catId;
	@Column(name="c_name",nullable = false, length=30)
	private String cname;
	public Category(String catId, String cname) {
		super();
		this.catId = catId;
		this.cname = cname;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
}
