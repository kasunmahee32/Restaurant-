package lk.ijse.test.entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 @Entity
@Table(name="Order_Detail")
public class Order_Detail implements Serializable{
	@Column(name="quantity",nullable = false)
	private int quantity;
	@Column(name="unite_price",nullable = false)
	private int unite_price;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fid",referencedColumnName = "fid",insertable =false, updatable=false)
	private Food food;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "oid",referencedColumnName ="oid",insertable=false,updatable=false)
	private Orders orders;
	
	@EmbeddedId
	private Order_Detail_PK order_Detail_PK;
	public Order_Detail(int quantity, int unite_price, Food food, Orders orders, Order_Detail_PK order_Detail_PK) {
		super();
		this.quantity = quantity;
		this.unite_price = unite_price;
		this.food = food;
		this.orders = orders;
		this.order_Detail_PK = order_Detail_PK;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnite_price() {
		return unite_price;
	}
	public void setUnite_price(int unite_price) {
		this.unite_price = unite_price;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Order_Detail_PK getOrder_Detail_PK() {
		return order_Detail_PK;
	}
	public void setOrder_Detail_PK(Order_Detail_PK order_Detail_PK) {
		this.order_Detail_PK = order_Detail_PK;
	}

}

