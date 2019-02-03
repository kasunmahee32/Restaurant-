package lk.ijse.test.dto;

public class CustomerDTO {
	private String cid;
	private String cus_name;
	private String tel;
	public CustomerDTO(String cid, String cus_name, String tel) {
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
	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", cus_name=" + cus_name + ", tel=" + tel + "]";
	}
	
	
}
